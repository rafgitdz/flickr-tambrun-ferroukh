package net.service.flickr;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FlickrPhotosSearchGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel panel, north, north2, south, south2, center, center2;
    private JLabel img, title, title2, description;
    // private JLabel author;
    private ImageIcon imgIc;
    private FlickrImpl impl;
    private List<String> urlList;
    private List<Integer> id;
    private URL url;
    private JButton next, previous, search;
    private int nb;
    private JMenuBar menu;
    // private JMenu options;
    private JMenuItem changeTag, searchWeb;
    private String tag, key, key2, tag2;
    private Photos photos;

    public FlickrPhotosSearchGUI(FlickrImpl flickr) {

        impl = flickr;
        nb = 0;
        id = new ArrayList<Integer>();
        urlList = new ArrayList<String>();
        setName("Flickr Display Photos");
        setSize(800, 600);
        panel = new JPanel(new BorderLayout());
        center = new JPanel(new BorderLayout());
        center2 = new JPanel(new FlowLayout());
        north = new JPanel(new FlowLayout());
        north2 = new JPanel(new FlowLayout());
        south = new JPanel(new FlowLayout());
        south2 = new JPanel(new FlowLayout());
        next = new JButton("--->");
        previous = new JButton("<---");
        search = new JButton("Search");
        previous.setEnabled(false);
        next.setEnabled(false);
        img = new JLabel();
        title = new JLabel("");
        title2 = new JLabel("");
        description = new JLabel("");
        menu = new JMenuBar();
        changeTag = new JMenuItem("Changer le tag");
        searchWeb = new JMenuItem("Recherche web");
        next.addActionListener(this);
        previous.addActionListener(this);
        changeTag.addActionListener(this);
        searchWeb.addActionListener(this);
        search.addActionListener(this);
        search.add(searchWeb);
        menu.add(search);
        setJMenuBar(menu);
        north.add(title);
        north2.add(title2);
        south.add(search);
        south2.add(description);
        center2.add(img);
        center.add(center2, BorderLayout.CENTER);
        center.add(north2, BorderLayout.NORTH);
        center.add(south2, BorderLayout.SOUTH);
        panel.add(north, BorderLayout.NORTH);
        panel.add(south, BorderLayout.SOUTH);
        panel.add(next, BorderLayout.EAST);
        panel.add(previous, BorderLayout.WEST);
        panel.add(center, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
        setTitle("Flickr Photos Display");
        // added to be adapted to the principal GUI Flickr
        search.setVisible(false);
    }

    public void search() {
        createList();
        createImg();
    }

    public void createList() {
        // creation de la liste d'URL
        urlList.clear();
        id.clear();
        nb = 0;

        if (searchWeb.isSelected()) {
            try {
                Rsp resp = impl.getPhotos(key, "", tag);
                photos = (Photos) resp.getAny();
                this.urlList = impl.buildUrlList(((Photos) resp.getAny()).getPhoto());

            } catch (ClassCastException ce) {
                JOptionPane.showMessageDialog(
                        this,
                        "Une erreur est survenue, votre cle est peut etre erronee",
                        ce.getClass().getName(), 0);
                key = "";
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Une erreur est survenue : " + e.getClass().getName(),
                        e.getClass().getName(), 0);

            }

        }

        if (!urlList.isEmpty()) {
            next.setEnabled(true);
        } else {
            next.setEnabled(false);
        }
        previous.setEnabled(false);
    }

    public void createImg() {
        if (!urlList.isEmpty()) {
            try {
                img.setText("");

                if (searchWeb.isSelected()) {
                    title2.setText("Tag : " + tag);
                    description.setText("Description : "
                            + photos.getPhoto().get(nb).getTitle());
                    url = new URL(urlList.get(nb));
                }
                imgIc = new ImageIcon(url);
                img.setIcon(imgIc);
                setSize(800, 600);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Une erreur est survenue : " + e.getClass().getName(),
                        e.getClass().getName(), 0);
            }
        } else {
            img.setIcon(null);
            img.setText("Aucun resultat");
            title2.setText("");
            description.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // clic sur suivant
        if (e.getSource() == next) {
            nb++;
            createImg();
            repaint();

            if (nb == urlList.size() - 1) {
                next.setEnabled(false);
            }

            if (nb == 1) {
                previous.setEnabled(true);
            }
        }

        if (e.getSource() == previous) {
            nb--;
            createImg();
            repaint();

            if (nb == 0) {
                previous.setEnabled(false);
            }

            if (nb == urlList.size() - 2) {
                next.setEnabled(true);
            }
        }

        if (e.getSource() == changeTag) {
            if (searchWeb.isSelected()) {
                search();
            }
        }

        if (e.getSource() == searchWeb) {
            searchWeb.setSelected(true);
            search();
        }
    }

    // set the informations from the principal GUI
    public void setInfo(String keyUser, String tagUser) {
        key = keyUser;
        tag = tagUser;
        searchWeb.setSelected(true);
    }
}

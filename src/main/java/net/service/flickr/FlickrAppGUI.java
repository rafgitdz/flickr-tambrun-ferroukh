package net.service.flickr;

import java.io.File;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFileChooser;

public class FlickrAppGUI extends javax.swing.JFrame implements Observer {

    private static final String DEFAULT_API_KEY = "6363265654c604432f3c6cd544cac85a";
    private static final String DEFAULT_SECRET = "431ef0f46e6ba7d6";
    private static final String EMPTY = "";
    private static final String OPEN = "Open";
    private static final String PLEASE_EDIT_KEY = "Please edit your developper key !";
    private static final String PLEASE_EDIT_TAG = "Please edit the tag !";
    private static final String PLEASE_EDIT_EMAIL = "Please edit your e-mail !";
    private static final String PLEASE_EDIT_USERNAME = "Please edit your username !";
    private static final String HAVE_NOT_GROUP = "It's has not a group for you !";
    private static final String SUCCESSFUL_UPLOAD = "Successful upload !";
    private static final String FAIL_UPLOAD = "Failed to upload the photo !";
    private static final String PLEASE_EDIT_SECRET = "Please edit your secret !";
    private static final String PLEASE_EDIT_MISSING_INFORMATION = "Please edit missing informations !";
    private static final String NO_DISPLAY_WINDOW = "It's has not a current (last) window !";
    private static final String REQUEST_OK = "Successful Request !";
    private static final String HELP = "See the ReadMe file at /Flickr"
            + "\nFor more help contact us :\n\tmathieu.tambrun@etu.u-bordeaux1.fr \n\trafik.ferroukh@etu.u-bordeaux1.fr "
            + "\nMaster 2 Computer Science - University of Bordeaux 1 - FRANCE -"
            + "\n2011-2012";
    private static final String ABOUT =
            "FlickrApp is based on software developed at the university of Bordeaux 1 (France), which has been dual "
            + "\nlicensed under the Common Development and Distribution License (CDDL) and the GNU General Public License "
            + "\nversion 2 with Classpath exception. \n2011 - 2012"
            + "\nFor more information, please visit \n\thttp://mathieu.tambrun.emi.u-bordeaux1.fr/ \n\thttp://rafik.ferroukh.emi.u-bordeaux1.fr/";
    private static final String ERROR_EXTENSION = "ERROR FILE : Invalid format of file"
            + "\nFile extension autorised : jpg , bmp , png";
    private static final String JPEG_EXTENSION = ".jpg";
    private static final String BITMAP_EXTENSION = ".bmp";
    private static final String PNG_EXTENSION = ".png";
    private static final String POINT = ".";
    private static final String ERROR_ = "ERROR : ";
    //resources
    private FlickrImpl flickrService = null;
    private int currentGroup = -1;
    private String frob = null;
    private List<Groups.Group> groups = null;
    private FlickrPhotosSearchGUI displayPhotosGUI = null;

    /** Creates new form FlickrAppGUI */
    public FlickrAppGUI() {

        initComponents();
        // Create the service flickr app
        flickrService = new FlickrImpl();
        // add the FlickrAppGUI to the Service to notify it 
        // when an error response Http is occured 
        flickrService.addObserver(this);
        // to avoid worst handling by the user
        validatedUrlButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FlickrAppTabbedPane = new javax.swing.JTabbedPane();
        uploadPhotoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        keyUploadTextField = new javax.swing.JTextField();
        secretUploadTextField = new javax.swing.JTextField();
        titleUploadTextField = new javax.swing.JTextField();
        descUploadTextField = new javax.swing.JTextField();
        tagUploadTextField = new javax.swing.JTextField();
        pathPhotoUploadTextField = new javax.swing.JTextField();
        uploadPathPhotoButton = new javax.swing.JButton();
        uploadPhotoButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        validatedUrlButton = new javax.swing.JButton();
        urlTextField = new javax.swing.JTextField();
        useDefaultCheckBox = new javax.swing.JCheckBox();
        searchPhotoPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        keySearchPhotoTextField = new javax.swing.JTextField();
        tagSearchPhotoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchPhotosButton = new javax.swing.JButton();
        useSameWindowCheckBox = new javax.swing.JCheckBox();
        searchUserPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        emailSearchUserTestField = new javax.swing.JTextField();
        keySearchUserTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        getUsernameButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        resultUsernameTextField = new javax.swing.JTextField();
        infoUserPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        usernameInfoUserTextField = new javax.swing.JTextField();
        keyInfoUserTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        getInfoUserButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        resultUsernameInfoUserTextField = new javax.swing.JTextField();
        resultRealnameInfoUserTextField = new javax.swing.JTextField();
        resultMboxInfoUserTextField = new javax.swing.JTextField();
        resultLocationInfoUserTextField = new javax.swing.JTextField();
        resultPhotoUrlInfoUserTextField = new javax.swing.JTextField();
        resultProfileUrlInfoUserTextFIeld = new javax.swing.JTextField();
        resultFirstDatePhotoInfoUserTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        resultCountPhotosInfoUserTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        resultIConfarmInfoUserTextField1 = new javax.swing.JTextField();
        userGroupsPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        usernameGetGroupsTextField = new javax.swing.JTextField();
        keygetGroupsTextFIeld = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        getGroupsButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        resultNsidTextField = new javax.swing.JTextField();
        resultNameGroupsTextField = new javax.swing.JTextField();
        resultIsAdminGroupsTextFIeld = new javax.swing.JTextField();
        resultEighteenPlusTextField = new javax.swing.JTextField();
        resultInvitationOnlyTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        nextGroupButton = new javax.swing.JButton();
        previousGroupButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        informationTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UploadMenuItem = new javax.swing.JMenuItem();
        searchMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        quitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        byEmailAdress = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        getGroupsMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        useDefaultMenuItem = new javax.swing.JMenuItem();
        unuseDefaultKeyMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        aboutFlickrMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AppFlickr");

        FlickrAppTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        FlickrAppTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("Key :");

        jLabel4.setText("Secret :");

        jLabel5.setText("Title :");

        jLabel6.setText("Description :");

        jLabel7.setText("Tag :");

        jLabel8.setText("Photo :");

        uploadPathPhotoButton.setText("...");
        uploadPathPhotoButton.setToolTipText("Upload a photo");
        uploadPathPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPathPhotoButtonActionPerformed(evt);
            }
        });

        uploadPhotoButton.setText("Generate URL");
        uploadPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pathPhotoUploadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(descUploadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(titleUploadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(keyUploadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(secretUploadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(tagUploadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadPathPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(uploadPhotoButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(keyUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(secretUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(titleUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(descUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tagUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pathPhotoUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadPathPhotoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(uploadPhotoButton)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel10.setText("Url to validate : ");

        validatedUrlButton.setText("It is Validated");
        validatedUrlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validatedUrlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(urlTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validatedUrlButton)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validatedUrlButton)
                    .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        useDefaultCheckBox.setText("Use default key and secret");
        useDefaultCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useDefaultCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uploadPhotoPanelLayout = new javax.swing.GroupLayout(uploadPhotoPanel);
        uploadPhotoPanel.setLayout(uploadPhotoPanelLayout);
        uploadPhotoPanelLayout.setHorizontalGroup(
            uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadPhotoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(uploadPhotoPanelLayout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPhotoPanelLayout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(162, 162, 162)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPhotoPanelLayout.createSequentialGroup()
                        .addComponent(useDefaultCheckBox)
                        .addGap(270, 270, 270))))
        );
        uploadPhotoPanelLayout.setVerticalGroup(
            uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPhotoPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(useDefaultCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FlickrAppTabbedPane.addTab("Upload Photo", uploadPhotoPanel);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Key :");

        jLabel2.setText("Tag :");

        searchPhotosButton.setText("Search photos");
        searchPhotosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPhotosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tagSearchPhotoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(keySearchPhotoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(searchPhotosButton)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keySearchPhotoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagSearchPhotoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchPhotosButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        useSameWindowCheckBox.setText("Use the same window");
        useSameWindowCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useSameWindowCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPhotoPanelLayout = new javax.swing.GroupLayout(searchPhotoPanel);
        searchPhotoPanel.setLayout(searchPhotoPanelLayout);
        searchPhotoPanelLayout.setHorizontalGroup(
            searchPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPhotoPanelLayout.createSequentialGroup()
                .addGroup(searchPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPhotoPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPhotoPanelLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(useSameWindowCheckBox)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        searchPhotoPanelLayout.setVerticalGroup(
            searchPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPhotoPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(useSameWindowCheckBox)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(177, 177, 177))
        );

        FlickrAppTabbedPane.addTab("Search Photo", searchPhotoPanel);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setText("E-mail :");

        jLabel12.setText("Key :");

        getUsernameButton.setText("Get Username");
        getUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getUsernameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailSearchUserTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(keySearchUserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(getUsernameButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(keySearchUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(emailSearchUserTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getUsernameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Result Get Username"));

        jLabel9.setText("Username :");

        resultUsernameTextField.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultUsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(resultUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchUserPanelLayout = new javax.swing.GroupLayout(searchUserPanel);
        searchUserPanel.setLayout(searchUserPanelLayout);
        searchUserPanelLayout.setHorizontalGroup(
            searchUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchUserPanelLayout.createSequentialGroup()
                .addGroup(searchUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchUserPanelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchUserPanelLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        searchUserPanelLayout.setVerticalGroup(
            searchUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchUserPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        FlickrAppTabbedPane.addTab("Search User", searchUserPanel);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setText("Username :");

        jLabel14.setText("Key :");

        getInfoUserButton.setText("Get Information");
        getInfoUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInfoUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameInfoUserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(keyInfoUserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(getInfoUserButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(keyInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(usernameInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(getInfoUserButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Result Info Person"));

        resultUsernameInfoUserTextField.setEditable(false);

        resultRealnameInfoUserTextField.setEditable(false);

        resultMboxInfoUserTextField.setEditable(false);

        resultLocationInfoUserTextField.setEditable(false);

        resultPhotoUrlInfoUserTextField.setEditable(false);

        resultProfileUrlInfoUserTextFIeld.setEditable(false);

        resultFirstDatePhotoInfoUserTextField.setEditable(false);

        jLabel27.setText("PhotoUrl :");

        resultCountPhotosInfoUserTextField.setEditable(false);

        jLabel28.setText("ProfileUrl :");

        jLabel29.setText("Username :");

        jLabel30.setText("Realname :");

        jLabel31.setText("Mbox :");

        jLabel32.setText("Location :");

        jLabel33.setText("First Date Photo :");

        jLabel34.setText("Count :");

        jLabel36.setText("Confarm :");

        resultIConfarmInfoUserTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33)
                                .addComponent(jLabel36))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultIConfarmInfoUserTextField1)
                    .addComponent(resultCountPhotosInfoUserTextField)
                    .addComponent(resultFirstDatePhotoInfoUserTextField)
                    .addComponent(resultProfileUrlInfoUserTextFIeld)
                    .addComponent(resultPhotoUrlInfoUserTextField)
                    .addComponent(resultLocationInfoUserTextField)
                    .addComponent(resultMboxInfoUserTextField)
                    .addComponent(resultRealnameInfoUserTextField)
                    .addComponent(resultUsernameInfoUserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                .addGap(833, 833, 833))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultUsernameInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultRealnameInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultMboxInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLocationInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultPhotoUrlInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultProfileUrlInfoUserTextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultFirstDatePhotoInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultCountPhotosInfoUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultIConfarmInfoUserTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)))
        );

        javax.swing.GroupLayout infoUserPanelLayout = new javax.swing.GroupLayout(infoUserPanel);
        infoUserPanel.setLayout(infoUserPanelLayout);
        infoUserPanelLayout.setHorizontalGroup(
            infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUserPanelLayout.createSequentialGroup()
                .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoUserPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
                    .addGroup(infoUserPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        infoUserPanelLayout.setVerticalGroup(
            infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FlickrAppTabbedPane.addTab("Info User", infoUserPanel);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setText("Username :");

        jLabel16.setText("Key :");

        getGroupsButton.setText("Get Groups");
        getGroupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGroupsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(getGroupsButton))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameGetGroupsTextField)
                            .addComponent(keygetGroupsTextFIeld, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keygetGroupsTextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameGetGroupsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(11, 11, 11)
                .addComponent(getGroupsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Result User Groups"));

        resultNsidTextField.setEditable(false);

        resultNameGroupsTextField.setEditable(false);

        resultIsAdminGroupsTextFIeld.setEditable(false);

        resultEighteenPlusTextField.setEditable(false);

        resultInvitationOnlyTextField.setEditable(false);

        jLabel35.setText("Invitations Only :");

        jLabel37.setText("NSID :");

        jLabel38.setText("Name :");

        jLabel39.setText("Is Administrator :");

        jLabel40.setText("EighteenPlus :");

        nextGroupButton.setText("Next ->");
        nextGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextGroupButtonActionPerformed(evt);
            }
        });

        previousGroupButton.setText("<- Previous");
        previousGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousGroupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(previousGroupButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(nextGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultInvitationOnlyTextField)
                    .addComponent(resultEighteenPlusTextField)
                    .addComponent(resultIsAdminGroupsTextFIeld)
                    .addComponent(resultNameGroupsTextField)
                    .addComponent(resultNsidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultNsidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultNameGroupsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultIsAdminGroupsTextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultEighteenPlusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultInvitationOnlyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextGroupButton)
                    .addComponent(previousGroupButton)))
        );

        javax.swing.GroupLayout userGroupsPanelLayout = new javax.swing.GroupLayout(userGroupsPanel);
        userGroupsPanel.setLayout(userGroupsPanelLayout);
        userGroupsPanelLayout.setHorizontalGroup(
            userGroupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userGroupsPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(userGroupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
        );
        userGroupsPanelLayout.setVerticalGroup(
            userGroupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userGroupsPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        FlickrAppTabbedPane.addTab("User Groups", userGroupsPanel);

        informationTextArea.setColumns(20);
        informationTextArea.setEditable(false);
        informationTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14));
        informationTextArea.setRows(5);
        jScrollPane2.setViewportView(informationTextArea);

        jMenu1.setText("Photo");

        UploadMenuItem.setText("Upload");
        UploadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(UploadMenuItem);

        searchMenuItem.setText("Search");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(searchMenuItem);
        jMenu1.add(jSeparator1);

        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(quitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Action");

        jMenu3.setText("Find Username");

        byEmailAdress.setText("By E-mail Adress");
        byEmailAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byEmailAdressActionPerformed(evt);
            }
        });
        jMenu3.add(byEmailAdress);

        jMenu2.add(jMenu3);

        jMenuItem6.setText("Get Info User");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        getGroupsMenuItem.setText("Get Groups User");
        getGroupsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGroupsMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(getGroupsMenuItem);
        jMenu2.add(jSeparator3);

        useDefaultMenuItem.setText("Use Default Key");
        useDefaultMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useDefaultMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(useDefaultMenuItem);

        unuseDefaultKeyMenuItem.setText("Unuse Default Key");
        unuseDefaultKeyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuseDefaultKeyMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(unuseDefaultKeyMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Help");

        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(helpMenuItem);
        jMenu4.add(jSeparator2);

        aboutFlickrMenuItem.setText("About AppFlickr");
        aboutFlickrMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutFlickrMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(aboutFlickrMenuItem);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FlickrAppTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FlickrAppTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // call the GUI Dislay Photos after setting the key and the tag
    private void searchPhotosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPhotosButtonActionPerformed

        clearInformation();
        String key = keySearchPhotoTextField.getText();
        String tag = tagSearchPhotoTextField.getText();
        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (tag.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_TAG);
        } else {

            // set the information for the display GUI
            // and launch the search of photos
            // NOTE : we can use the same (the last)
            // current window or not
            if (!useSameWindowCheckBox.isSelected()) {
                displayPhotosGUI =
                        new FlickrPhotosSearchGUI(flickrService);
                displayPhotosGUI.setInfo(key, tag);
                displayPhotosGUI.search();
            } else {
                if (displayPhotosGUI != null) {
                    if (!displayPhotosGUI.isActive()) {

                        displayPhotosGUI.setVisible(true);
                        displayPhotosGUI.setInfo(key, tag);
                        displayPhotosGUI.search();
                    }
                } else {
                    displayInformation(NO_DISPLAY_WINDOW);
                }

            }
        }
    }//GEN-LAST:event_searchPhotosButtonActionPerformed

    // get the username of a user based on the e-mail adress
    private void getUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUsernameButtonActionPerformed

        clearInformation();
        String key = keySearchUserTextField.getText();
        String email = emailSearchUserTestField.getText();
        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (email.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_EMAIL);
        } else {
            // get the user and display its username
            Rsp response = flickrService.findByEmail(key, email);
            String result = ((User) response.getAny()).getUsername();
            resultUsernameTextField.setText(result);
            displayInformation(REQUEST_OK);
        }
    }//GEN-LAST:event_getUsernameButtonActionPerformed

    // get the info of the username and display it
    private void getInfoUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInfoUserButtonActionPerformed

        clearInformation();
        String key = keyInfoUserTextField.getText();
        String username = usernameInfoUserTextField.getText();
        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (username.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_USERNAME);
        } else {

            // get the NSID of the user to have the groups
            Rsp response = flickrService.findByUsername(key, username);
            User user = (User) response.getAny();
            String user_id = user.getNsid();

            // get the person informations
            response = flickrService.getInfoUser(key, user_id);
            Person person = (Person) response.getAny();
            // display all
            resultUsernameInfoUserTextField.setText(person.getUsername());
            resultRealnameInfoUserTextField.setText(person.getRealname());
            resultMboxInfoUserTextField.setText(person.getMboxSha1Sum());
            resultLocationInfoUserTextField.setText(person.getLocation());
            resultPhotoUrlInfoUserTextField.setText(person.getPhotosurl());
            resultProfileUrlInfoUserTextFIeld.setText(person.getProfileurl());
            resultIConfarmInfoUserTextField1.setText(person.getIconfarm());
            resultFirstDatePhotoInfoUserTextField.setText(person.getPhotos().getFirstdate());
            resultCountPhotosInfoUserTextField.setText(String.valueOf(person.getPhotos().getCount()));
            displayInformation(REQUEST_OK);
        }
    }//GEN-LAST:event_getInfoUserButtonActionPerformed

    // Handle the request to get all the groups of the user flickr
    private void getGroupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGroupsButtonActionPerformed

        clearInformation();
        String key = keygetGroupsTextFIeld.getText();
        String username = usernameGetGroupsTextField.getText();

        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (username.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_USERNAME);
        } else {
            Rsp response = flickrService.findByUsername(key, username);
            User user = (User) response.getAny();
            // get the NSID of the user to have the groups
            String user_id = user.getNsid();

            response = flickrService.getPublicGroups(key, user_id);
            Groups groupsResult = (Groups) response.getAny();
            // Update the current group list
            groups = groupsResult.getGroup();

            if (groups == null || groups.isEmpty()) {
                displayInformation(HAVE_NOT_GROUP);
                resultIsAdminGroupsTextFIeld.setText(EMPTY);
                resultEighteenPlusTextField.setText(EMPTY);
                resultInvitationOnlyTextField.setText(EMPTY);
                resultNameGroupsTextField.setText(EMPTY);
                resultNsidTextField.setText(EMPTY);
            } else {
                // display the first group
                currentGroup = 0;
                Groups.Group group = groups.get(currentGroup);
                resultIsAdminGroupsTextFIeld.setText(String.valueOf(group.getAdmin()));
                resultEighteenPlusTextField.setText(String.valueOf(group.getEighteenplus()));
                resultInvitationOnlyTextField.setText(String.valueOf(group.getInvitationOnly()));
                resultNameGroupsTextField.setText(group.getName());
                resultNsidTextField.setText(group.getNsid());
                displayInformation(REQUEST_OK);
            }
        }
    }//GEN-LAST:event_getGroupsButtonActionPerformed
    private void nextGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextGroupButtonActionPerformed
        // display the next group info of the current group list
        clearInformation();
        String key = keygetGroupsTextFIeld.getText();
        String username = usernameGetGroupsTextField.getText();

        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (username.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_USERNAME);
        } else {
            // The username is not in any group
            if (groups == null || groups.isEmpty()) {
                displayInformation(HAVE_NOT_GROUP);
            } else {

                // display the next of the currentGroup
                ++currentGroup;
                if (currentGroup >= groups.size()) {
                    currentGroup = 0; // turn to the first group
                }
                Groups.Group group = groups.get(currentGroup);
                resultIsAdminGroupsTextFIeld.setText(String.valueOf(group.getAdmin()));
                resultEighteenPlusTextField.setText(String.valueOf(group.getEighteenplus()));
                resultInvitationOnlyTextField.setText(String.valueOf(group.getInvitationOnly()));
                resultNameGroupsTextField.setText(group.getName());
                resultNsidTextField.setText(group.getNsid());
                displayInformation(REQUEST_OK);
            }
        }
    }//GEN-LAST:event_nextGroupButtonActionPerformed

    // Display the previous group of the current groups list
    private void previousGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousGroupButtonActionPerformed

        clearInformation();
        String key = keygetGroupsTextFIeld.getText();
        String username = usernameGetGroupsTextField.getText();

        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (username.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_USERNAME);
        } else {

            // The username is not in any group
            if (groups == null || groups.isEmpty()) {
                displayInformation(HAVE_NOT_GROUP);
            } else {
                // display the previous of the currentGroup
                --currentGroup;
                if (currentGroup < 0) {
                    // turn to the end group
                    currentGroup = groups.size() - 1;
                }
                Groups.Group group = groups.get(currentGroup);
                resultIsAdminGroupsTextFIeld.setText(String.valueOf(group.getAdmin()));
                resultEighteenPlusTextField.setText(String.valueOf(group.getEighteenplus()));
                resultInvitationOnlyTextField.setText(String.valueOf(group.getInvitationOnly()));
                resultNameGroupsTextField.setText(group.getName());
                resultNsidTextField.setText(group.getNsid());
                displayInformation(REQUEST_OK);
            }
        }
    }//GEN-LAST:event_previousGroupButtonActionPerformed

    private void UploadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadMenuItemActionPerformed
        clearInformation();
        FlickrAppTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_UploadMenuItemActionPerformed

    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        clearInformation();
        FlickrAppTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_searchMenuItemActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void byEmailAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byEmailAdressActionPerformed
        clearInformation();
        FlickrAppTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_byEmailAdressActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        clearInformation();
        FlickrAppTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void getGroupsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGroupsMenuItemActionPerformed
        clearInformation();
        FlickrAppTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_getGroupsMenuItemActionPerformed

    // Build a request to generate the url (displayed in the urlTextField)
    // to validate the frob
    private void uploadPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoButtonActionPerformed

        clearInformation();
        String key = keyUploadTextField.getText();
        String secret = secretUploadTextField.getText();
        if (key.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_KEY);
        } else if (secret.equals(EMPTY)) {
            this.displayInformation(PLEASE_EDIT_SECRET);
        } else {

            Rsp rsp = flickrService.getFrob(key, secret);
            frob = ((Frob) (rsp.getAny())).getValue();
            String url = flickrService.getUrlAuth(key, secret, frob);
            urlTextField.setText(url);
            displayInformation(REQUEST_OK);
        }
        validatedUrlButton.setEnabled(true);
    }//GEN-LAST:event_uploadPhotoButtonActionPerformed

    // Upload the photo After the user had validate the frob
    private void validatedUrlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validatedUrlButtonActionPerformed

        clearInformation();
        String key = keyUploadTextField.getText();
        String secret = secretUploadTextField.getText();
        String title = titleUploadTextField.getText();
        String description = descUploadTextField.getText();
        String tag = tagUploadTextField.getText();
        String pathPhoto = pathPhotoUploadTextField.getText();

        if (key.equals(EMPTY) || secret.equals(EMPTY) || title.equals(EMPTY)
                || description.equals(EMPTY) || tag.equals(EMPTY)
                || pathPhoto.equals(EMPTY)) {
            displayInformation(PLEASE_EDIT_MISSING_INFORMATION);
        }
        Rsp respToken = flickrService.getToken(key, secret, frob);
        String token = ((Auth) (respToken.getAny())).getToken();

        if (flickrService.uploadPhotos(key, secret, title,
                description, tag, pathPhoto, token)) {
            displayInformation(SUCCESSFUL_UPLOAD);
        } else {
            displayInformation(FAIL_UPLOAD);
        }
        validatedUrlButton.setEnabled(false);
    }//GEN-LAST:event_validatedUrlButtonActionPerformed

    // handle the upload photo request
    private void uploadPathPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPathPhotoButtonActionPerformed

        clearInformation();
        JFileChooser dialogue = new JFileChooser();
        // Show the dialog to choose the image file
        int Retour = dialogue.showDialog(dialogue, OPEN);
        File photoToUpload = null;

        // Choose the image file
        if (Retour == JFileChooser.APPROVE_OPTION) {
            photoToUpload = dialogue.getSelectedFile();
            String pathUploadPhoto = photoToUpload.getAbsolutePath();
            String extension = pathUploadPhoto.substring(pathUploadPhoto.lastIndexOf(POINT));
            // verify the extension of the input file
            if (!extension.equals(JPEG_EXTENSION) && !extension.equals(BITMAP_EXTENSION) && !extension.equals(PNG_EXTENSION)) {
                displayInformation(ERROR_EXTENSION);
            } else {
                pathPhotoUploadTextField.setText(photoToUpload.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_uploadPathPhotoButtonActionPerformed

    // load the default key ans default secret in all the upload textField Key and Secret
    private void useDefaultCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useDefaultCheckBoxActionPerformed

        if (useDefaultCheckBox.isSelected()) {
            keyUploadTextField.setText(DEFAULT_API_KEY);
            secretUploadTextField.setText(DEFAULT_SECRET);
        } else {
            keyUploadTextField.setText(EMPTY);
            secretUploadTextField.setText(EMPTY);
        }
    }//GEN-LAST:event_useDefaultCheckBoxActionPerformed

    // load the default key in all the textFields
    private void useDefaultMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useDefaultMenuItemActionPerformed

        keyInfoUserTextField.setText(DEFAULT_API_KEY);
        keySearchPhotoTextField.setText(DEFAULT_API_KEY);
        keySearchUserTextField.setText(DEFAULT_API_KEY);
        keygetGroupsTextFIeld.setText(DEFAULT_API_KEY);
        unuseDefaultKeyMenuItem.setEnabled(true);
        useDefaultMenuItem.setEnabled(false);
    }//GEN-LAST:event_useDefaultMenuItemActionPerformed

    // unload the default key in all the textFields
    private void unuseDefaultKeyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuseDefaultKeyMenuItemActionPerformed
        keyInfoUserTextField.setText(EMPTY);
        keySearchPhotoTextField.setText(EMPTY);
        keySearchUserTextField.setText(EMPTY);
        keygetGroupsTextFIeld.setText(EMPTY);
        unuseDefaultKeyMenuItem.setEnabled(false);
        useDefaultMenuItem.setEnabled(true);
    }//GEN-LAST:event_unuseDefaultKeyMenuItemActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        displayInformation(HELP);
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void aboutFlickrMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutFlickrMenuItemActionPerformed
        displayInformation(ABOUT);
    }//GEN-LAST:event_aboutFlickrMenuItemActionPerformed

    private void useSameWindowCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useSameWindowCheckBoxActionPerformed
    }//GEN-LAST:event_useSameWindowCheckBoxActionPerformed

    // display the notificate in the TextArea
    private void displayInformation(String message) {
        informationTextArea.setText(EMPTY);
        informationTextArea.setText(message);
    }

    private void clearInformation() {
        informationTextArea.setText(EMPTY);
    }

    // Before that an exception was generated, the app receives 
    // the information error to display that an error was occured
    @Override
    public void update(Observable o, Object arg) {
        displayInformation(ERROR_ + String.valueOf(arg));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane FlickrAppTabbedPane;
    private javax.swing.JMenuItem UploadMenuItem;
    private javax.swing.JMenuItem aboutFlickrMenuItem;
    private javax.swing.JMenuItem byEmailAdress;
    private javax.swing.JTextField descUploadTextField;
    private javax.swing.JTextField emailSearchUserTestField;
    private javax.swing.JButton getGroupsButton;
    private javax.swing.JMenuItem getGroupsMenuItem;
    private javax.swing.JButton getInfoUserButton;
    private javax.swing.JButton getUsernameButton;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JPanel infoUserPanel;
    private javax.swing.JTextArea informationTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField keyInfoUserTextField;
    private javax.swing.JTextField keySearchPhotoTextField;
    private javax.swing.JTextField keySearchUserTextField;
    private javax.swing.JTextField keyUploadTextField;
    private javax.swing.JTextField keygetGroupsTextFIeld;
    private javax.swing.JButton nextGroupButton;
    private javax.swing.JTextField pathPhotoUploadTextField;
    private javax.swing.JButton previousGroupButton;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JTextField resultCountPhotosInfoUserTextField;
    private javax.swing.JTextField resultEighteenPlusTextField;
    private javax.swing.JTextField resultFirstDatePhotoInfoUserTextField;
    private javax.swing.JTextField resultIConfarmInfoUserTextField1;
    private javax.swing.JTextField resultInvitationOnlyTextField;
    private javax.swing.JTextField resultIsAdminGroupsTextFIeld;
    private javax.swing.JTextField resultLocationInfoUserTextField;
    private javax.swing.JTextField resultMboxInfoUserTextField;
    private javax.swing.JTextField resultNameGroupsTextField;
    private javax.swing.JTextField resultNsidTextField;
    private javax.swing.JTextField resultPhotoUrlInfoUserTextField;
    private javax.swing.JTextField resultProfileUrlInfoUserTextFIeld;
    private javax.swing.JTextField resultRealnameInfoUserTextField;
    private javax.swing.JTextField resultUsernameInfoUserTextField;
    private javax.swing.JTextField resultUsernameTextField;
    private javax.swing.JMenuItem searchMenuItem;
    private javax.swing.JPanel searchPhotoPanel;
    private javax.swing.JButton searchPhotosButton;
    private javax.swing.JPanel searchUserPanel;
    private javax.swing.JTextField secretUploadTextField;
    private javax.swing.JTextField tagSearchPhotoTextField;
    private javax.swing.JTextField tagUploadTextField;
    private javax.swing.JTextField titleUploadTextField;
    private javax.swing.JMenuItem unuseDefaultKeyMenuItem;
    private javax.swing.JButton uploadPathPhotoButton;
    private javax.swing.JButton uploadPhotoButton;
    private javax.swing.JPanel uploadPhotoPanel;
    private javax.swing.JTextField urlTextField;
    private javax.swing.JCheckBox useDefaultCheckBox;
    private javax.swing.JMenuItem useDefaultMenuItem;
    private javax.swing.JCheckBox useSameWindowCheckBox;
    private javax.swing.JPanel userGroupsPanel;
    private javax.swing.JTextField usernameGetGroupsTextField;
    private javax.swing.JTextField usernameInfoUserTextField;
    private javax.swing.JButton validatedUrlButton;
    // End of variables declaration//GEN-END:variables
}

package coursework;


import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class CAD_Info extends javax.swing.JFrame {
   
   
  
    public CAD_Info() {
        initComponents();
         setResizable(false);
         setLocationRelativeTo(null);
        
    }
 

    private int binarySearch(int[] a, int x) {
        Arrays.sort(a);
        int size = a.length;
        int lowIndex = 0;
        int highIndex = size - 1;

        while (lowIndex <= highIndex) {
            int mid = (lowIndex +highIndex ) / 2;
            if (a[mid] == x) {
                return a[mid];
            } else if (x > a[mid]) {
                lowIndex = mid + 1;
            } else {
                highIndex = mid - 1;
            }
        }
        return -1;
    }
	
    @SuppressWarnings("unchecked")
   
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFileChooser = new javax.swing.JFileChooser();
        bodyPanel = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        detailsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        priceSrch = new javax.swing.JTextField();
        priceSrchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delItembtn = new javax.swing.JButton();
        delAllbtn = new javax.swing.JButton();
        categorySrch = new javax.swing.JComboBox<>();
        catSrchbtn = new javax.swing.JButton();
        formPanel = new javax.swing.JPanel();
        mainFormPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idtf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        company = new javax.swing.JRadioButton();
        community = new javax.swing.JRadioButton();
        none = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        high = new javax.swing.JRadioButton();
        low = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        pricetf = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        open = new javax.swing.JCheckBoxMenuItem();
        exit = new javax.swing.JCheckBoxMenuItem();
        help = new javax.swing.JMenu();
        helpmenu = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bodyPanel.setLayout(new javax.swing.OverlayLayout(bodyPanel));

        jTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        detailsPanel.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car Accessories Details");

        priceSrch.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        priceSrchbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        priceSrchbtn.setText("Search By Price");
        priceSrchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceSrchbtnActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Bluetooth", "Media", "1000", "medium", "By Company"},
                { new Integer(2), "Air freshner", "Ambience", "1500", "medium", "None"},
                { new Integer(3), "Air bags", "Comfort", "13000", "high", "None"},
                { new Integer(4), "USB charger", "Media", "500", "low", "By Commmunity"},
                { new Integer(5), "Seat cover", "Interior", "6000", "high", "None"},
                { new Integer(6), "Floor mats", "Interior", "1000", "medium", "By Company"},
                { new Integer(7), "Sun roof", "Ambience", "3000", "medium", "By Company"},
                { new Integer(8), "Emergency supply", "Comfort", "1200", "medium", "None"},
                { new Integer(9), "Lighting", "Ambience", "1500", "medium", "None"},
                { new Integer(10), "Seat design", "Comfort", "10000", "high", "None"},
                { new Integer(11), "Armrest", "Comfort", "700", "low", "None"},
                { new Integer(12), "Mobile holder", "Interior", "650", "low", "None"}
            },
            new String [] {
                "Accessory ID", "Accessory Name", "Category", "Price", "Price Range", "Recommendation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setShowGrid(true);
        table.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(table);

        delItembtn.setFont(new java.awt.Font("Tahoma", 0, 14));
        delItembtn.setText("Delete item");
        delItembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delItembtnActionPerformed(evt);
            }
        });

        delAllbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        delAllbtn.setText("Delete all");
        delAllbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAllbtnActionPerformed(evt);
            }
        });

        categorySrch.setFont(new java.awt.Font("Tahoma", 0, 14));
        categorySrch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Security ", "Comfort", "Ambience", "Media", "Interior" }));
        categorySrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorySrchActionPerformed(evt);
            }
        });

        catSrchbtn.setFont(new java.awt.Font("Tahoma", 0, 14));
        catSrchbtn.setText("Search By Category");
        catSrchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catSrchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(categorySrch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(catSrchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(priceSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(priceSrchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(delItembtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delAllbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(19, 19, 19))))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceSrchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(priceSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categorySrch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catSrchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delAllbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delItembtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane.addTab("Car Accessories Details", detailsPanel);

        formPanel.setBackground(new java.awt.Color(204, 204, 0));
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainFormPanel.setBackground(new java.awt.Color(0, 0, 102));
        mainFormPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD DETAILS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Accessories ID");

        idtf.setFont(new java.awt.Font("Tahoma", 0, 14));
        idtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtfActionPerformed(evt);
            }
        });

        nametf.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Accessories Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Category");

        category.setFont(new java.awt.Font("Tahoma", 0, 12));
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comfort", "Ambience", "Media", "Security ", "Interior" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Recommendation");

        company.setFont(new java.awt.Font("Tahoma", 0, 12));
        company.setForeground(new java.awt.Color(255, 255, 255));
        company.setText("By Company");
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });

        community.setFont(new java.awt.Font("Tahoma", 0, 12));
        community.setForeground(new java.awt.Color(255, 255, 255));
        community.setText("By Community");
        community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityActionPerformed(evt);
            }
        });

        none.setFont(new java.awt.Font("Tahoma", 0, 12));
        none.setForeground(new java.awt.Color(255, 255, 255));
        none.setText("None");
        none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Range");

        high.setFont(new java.awt.Font("Tahoma", 0, 12));
        high.setForeground(new java.awt.Color(255, 255, 255));
        high.setText("High");
        high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highActionPerformed(evt);
            }
        });

        low.setFont(new java.awt.Font("Tahoma", 0, 12));
        low.setForeground(new java.awt.Color(255, 255, 255));
        low.setText("Low");
        low.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowActionPerformed(evt);
            }
        });

        medium.setFont(new java.awt.Font("Tahoma", 0, 12));
        medium.setForeground(new java.awt.Color(255, 255, 255));
        medium.setText("Medium");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");

        pricetf.setFont(new java.awt.Font("Tahoma", 0, 14));

        addbtn.setFont(new java.awt.Font("Tahoma", 0, 14));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Tahoma", 0, 14));
        clearbtn.setText("Clear All");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFormPanelLayout = new javax.swing.GroupLayout(mainFormPanel);
        mainFormPanel.setLayout(mainFormPanelLayout);
        mainFormPanelLayout.setHorizontalGroup(
            mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainFormPanelLayout.createSequentialGroup()
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainFormPanelLayout.createSequentialGroup()
                        .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainFormPanelLayout.createSequentialGroup()
                                .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(low, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(community, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                            .addComponent(high, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(none, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medium, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                    .addGroup(mainFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pricetf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(mainFormPanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainFormPanelLayout.setVerticalGroup(
            mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nametf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(none, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(high, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(low, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medium, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pricetf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        formPanel.add(mainFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 480, 600));

        jTabbedPane.addTab("Car Accessoires Form", formPanel);

        bodyPanel.add(jTabbedPane);

        getContentPane().add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        titlePanel.setBackground(new java.awt.Color(102, 0, 102));
        titlePanel.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 38));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CAR ACCESSORIES MANAGEMENT SYSTEM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 292, 18, 253);
        titlePanel.add(jLabel9, gridBagConstraints);

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1440, 69));

        jMenuBar.setEnabled(false);

        menu.setText("File");

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setSelected(true);
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        menu.add(open);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exit.setSelected(true);
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menu.add(exit);

        jMenuBar.add(menu);

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        helpmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        helpmenu.setSelected(true);
        helpmenu.setText("help");
        helpmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpmenuActionPerformed(evt);
            }
        });
        help.add(helpmenu);

        jMenuBar.add(help);

        setJMenuBar(jMenuBar);

        pack();
    }

    private void openActionPerformed(java.awt.event.ActionEvent evt) {
        
        int returnValue = jFileChooser.showOpenDialog(this);
        File file;
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            file = jFileChooser.getSelectedFile();
            try
                
            {
                
                if (Desktop.isDesktopSupported())
                {
                    try
                    {
                        File openFile = new File(file.getAbsolutePath());
                        Desktop.getDesktop().open(openFile);
                    }
                    catch (IOException ex) 
                    {
                        
                        JOptionPane.showMessageDialog(this, "Selected file cannot be opened. \n"
                                + "Chosen File location: \n" + file.getAbsolutePath(), "Error!", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
            catch (HeadlessException ex)
            {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Problem accessing the file", "", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else 
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Can't Open the file!\nFile access cancelled by user.", "", JOptionPane.ERROR_MESSAGE);
        }
       
    }

    public boolean Idconfirm(int id) {
            for(int i = 0;i<table.getModel().getRowCount();i++){
                if(String.valueOf(table.getModel().getValueAt(i,0)).equals(idtf.getText())){
                return true;
                }
            }
        return false;
    
    }

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void helpmenuActionPerformed(java.awt.event.ActionEvent evt) {
      
     
        JFrame helpFrame = new JFrame();
        helpFrame.setSize(500,600);
        helpFrame.setVisible(true);
        helpFrame.setLocationRelativeTo(null);
        helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea textArea = new javax.swing.JTextArea();
        textArea.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        helpFrame.setTitle("Help");

        textArea.setColumns(20);
        textArea.setRows(5);
    
        textArea.setText("Car Accessories Management System\n------------------------------------------------\n "
                + "This car accessories management system has menubar with:\n -File menu having open and exit option and \n -Help menu having help option.\n"
                + "\nThe system body includes:\n -a form to enter details about accessories and add data in the record table and \n -a record details to store the added information."
                + " \n\n There are two search button at the top of record details table:\n -one searches accessories according to price \n "
                + "-next searchs all the data with the selected category and is displayed. \n\n Likewise, there are various other functions and "
                + "features that you can test and try yourself.");
        jScrollPane1.setViewportView(textArea);
        
        helpFrame.add(textArea);
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void delAllbtnActionPerformed(java.awt.event.ActionEvent evt) {
        int yOrN = JOptionPane.showConfirmDialog(null, "Do you really want to delete all the records?","Delete Accessory",JOptionPane.OK_CANCEL_OPTION,2);
        if(yOrN == JOptionPane.OK_OPTION){
        for (int i=0; i<table.getRowCount(); i++)
        {
            for(int j=0; j<table.getColumnCount(); j++)
            {
                table.setValueAt("", i, j);
            }         
        }
        JOptionPane.showMessageDialog(this, "All Rows Cleared Successfully.", "Success!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void delItembtnActionPerformed(java.awt.event.ActionEvent evt) {
       
        try{
        int yOrN = JOptionPane.showConfirmDialog(null, "Do you want to delete the item?","Delete Accessory",JOptionPane.OK_CANCEL_OPTION,2);
        if(yOrN == JOptionPane.OK_OPTION){
            DefaultTableModel model = (DefaultTableModel) this.table.getModel();
            int selectedRowIndex=this.table.getSelectedRow();
            model.removeRow(selectedRowIndex);
            JOptionPane.showMessageDialog(this, "Item deleted successfully !!", "Delete Accessory", JOptionPane.INFORMATION_MESSAGE);
        }
        }
   
        catch(ArrayIndexOutOfBoundsException ae){
            JOptionPane.showMessageDialog(this, "Please select the row to delete first!!", "Delete Accessory", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void priceSrchbtnActionPerformed(java.awt.event.ActionEvent evt) {
        int rows = table.getRowCount();
        int searchIndex = 3;
        String search = priceSrch.getText();
        if (!"".equals(search) && rows != 0) {

            int searchItem = Integer.parseInt(priceSrch.getText());

            int data[] = new int[rows];

            for (int i = 0; i < rows; i++) {
                data[i] = Integer.parseInt(table.getValueAt(i, searchIndex).toString());
            }

            System.out.println(Arrays.toString(data));
            int searchResult = binarySearch(data, searchItem);

            System.out.println(searchResult);

            if (searchResult != -1) {
                for (int i = 0; i < rows; i++) {
                    if (Integer.parseInt(table.getValueAt(i, searchIndex).toString()) == searchResult) {
                        int itemIndex = 1;
                        String itemName = table.getValueAt(i, itemIndex).toString();
                        JOptionPane.showMessageDialog(this, "Search Item Found\nPrice: " + searchItem + "\nItem: " + itemName, "Message", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Search Item Not Found!", "Message", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Enter the price value of the item to search!", "Message", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        
    }

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {
        idtf.setText("");
        nametf.setText("");
        pricetf.setText("");
        category.setSelectedIndex(0);
        medium.setSelected(false);
        low.setSelected(false);
        high.setSelected(false);
        company.setSelected(false);
        community.setSelected(false);
        none.setSelected(false);
    }

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {
        
        int rowCount= table.getRowCount();
        try{
            acc_id = Integer.parseInt(idtf.getText());
            acc_name = nametf.getText();
            cost= Double.parseDouble(pricetf.getText());

            if(acc_name.equals("") || acc_id==0 || cost==0){
                JOptionPane.showMessageDialog(rootPane,"Please fil the accessory name field.");
            }
            else{
                if(low.isSelected() || medium.isSelected() || high.isSelected()){

                    String level = "";

                    if(high.isSelected())
                    {
                        level = high.getText();
                    }
                    else if(low.isSelected())
                    {
                        level = low.getText();
                    }
                    else if(medium.isSelected())
                    {
                        level = medium.getText();
                    }

                    if(company.isSelected() || community.isSelected() || none.isSelected()){

                        String recommendBy ="";

                        if(company.isSelected())
                        {
                            recommendBy = company.getText();
                        }
                        else if(community.isSelected())
                        {
                            recommendBy = community.getText();
                        }
                        else if(none.isSelected())
                        {
                            recommendBy = none.getText();
                        }

                        if(Idconfirm(acc_id)==true){
                            JOptionPane.showMessageDialog(this,"The id is already added. Please enter another id.");
                        }else{
                            String acc_category= category.getSelectedItem().toString();
                            DefaultTableModel obj= (DefaultTableModel) table.getModel();
                            table.setModel(obj);
                            Object row[]={acc_id.toString(),acc_name,acc_category,cost,level,recommendBy.toString()};
                            obj.addRow(row);
                            JOptionPane.showMessageDialog(rootPane,"Records added successfully.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"Please select the recommendation status.");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Please select the price range.");
                }

            }

        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(rootPane,"Please fill all the fields.");
        }
    }

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {
    
        high.setSelected(false);
        low.setSelected(false);
    }

    private void lowActionPerformed(java.awt.event.ActionEvent evt) {
        
        medium.setSelected(false);
        high.setSelected(false);
    }

    private void highActionPerformed(java.awt.event.ActionEvent evt) {
       
        medium.setSelected(false);
        low.setSelected(false);
    }

    private void noneActionPerformed(java.awt.event.ActionEvent evt) {
        
        company.setSelected(false);
        community.setSelected(false);
    }

    private void communityActionPerformed(java.awt.event.ActionEvent evt) {
        
        company.setSelected(false);
        none.setSelected(false);
    }

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {
        community.setSelected(false);
        none.setSelected(false);
    }

    private void idtfActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void categorySrchActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void catSrchbtnActionPerformed(java.awt.event.ActionEvent evt) {
      
         String categoryItems = categorySrch.getSelectedItem().toString();
        int searchIndex = 2;
        int rows = table.getRowCount();
        int no = 1;
        String displayName = "";
        for (int i = 0; i < rows; i++) {
            if ((table.getValueAt(i, searchIndex).toString()).equals(categoryItems)) {
                int itemIndex = 1;
                displayName += no + "." + ((String) table.getValueAt(i, itemIndex)) + "\n";
                no++;
            }
        }

        if (!"".equals(displayName)) {
            JOptionPane.showMessageDialog(this, displayName, (no - 1) + " Items From " + categoryItems, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No Items Related to Category: " + categoryItems, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
                                    
        
     
                                  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CAD_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAD_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAD_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAD_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAD_Info().setVisible(true);
               
            }
        });
    }

    
    private javax.swing.JButton addbtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton catSrchbtn;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JComboBox<String> categorySrch;
    private javax.swing.JButton clearbtn;
    private javax.swing.JRadioButton community;
    private javax.swing.JRadioButton company;
    private javax.swing.JButton delAllbtn;
    private javax.swing.JButton delItembtn;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JCheckBoxMenuItem exit;
    private javax.swing.JPanel formPanel;
    private javax.swing.JMenu help;
    private javax.swing.JCheckBoxMenuItem helpmenu;
    private javax.swing.JRadioButton high;
    private javax.swing.JTextField idtf;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JRadioButton low;
    private javax.swing.JPanel mainFormPanel;
    private javax.swing.JRadioButton medium;
    private javax.swing.JMenu menu;
    private javax.swing.JTextField nametf;
    private javax.swing.JRadioButton none;
    private javax.swing.JCheckBoxMenuItem open;
    private javax.swing.JTextField priceSrch;
    private javax.swing.JButton priceSrchbtn;
    private javax.swing.JTextField pricetf;
    private javax.swing.JTable table;
    private javax.swing.JPanel titlePanel;
    public String acc_name;
    public Integer acc_id;
    public Double cost;

}


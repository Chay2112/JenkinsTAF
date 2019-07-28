//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

class MainFrame extends JFrame implements ActionListener {
    JTabbedPane tabPane;
    JButton Print;
    JTextArea BillingPage = new JTextArea(30, 50);
    JPanel Input_Invoice;
    JPanel Billing;
    JPanel Inventory;
    JPanel CustomerDetails;
    JPanel Check_Invoice;
    JTable invoiceTable;
    String[] columnNames = new String[]{"s.no", "Item Description", "Gr", "Qty", "Rate", "Product Discount", "Tax Rate", "Amount"};
    String[][] rowData = new String[20][8];
    TableModel invoiceModel;
    JPanel invoicePanel = new JPanel();
    JTextField Sno;
    JTextField Qty;
    JComboBox Item_Description;
    JPanel blankPanel = new JPanel();
    JTextField UserName;
    JTextField Password;
    JPanel UserPanel;
    JPanel PasswordPanel;
    JPanel CompletePanel;
    JPanel SouthPanel;
    JPanel CheckBoxPanel;
    JButton Submit;
    JButton ForgotPassword;
    JRadioButton Vizag;
    JRadioButton Vijayanagaram;
    JRadioButton Kuchamamba;
    ImageIcon img;

    MainFrame() {
        super("sri sai tyres");
        this.setDefaultCloseOperation(3);
        this.addTabs();
        this.addBlanks();
        this.addTable();
        this.addLoginPage();
        this.Input_Invoice.add(this.blankPanel, "North");
        this.Input_Invoice.add(this.invoicePanel, "Center");
        this.setVisible(true);
        this.pack();
    }

    private void addTabs() {
        this.Input_Invoice = new JPanel();
        this.Input_Invoice.setLayout(new BorderLayout());
        this.Billing = new JPanel();
        this.Billing.add(new JScrollPane(this.BillingPage));
        this.BillingPage.setFont(new Font("SAN_SERIF", 3, 20));
        this.Inventory = new JPanel();
        this.CustomerDetails = new JPanel();
        this.Check_Invoice = new JPanel();
        this.tabPane = new JTabbedPane(2);
        this.tabPane.add("Input Invoice", this.Input_Invoice);
        this.tabPane.add("Billing", this.Billing);
        this.tabPane.add("Inventory", this.Inventory);
        this.tabPane.add("CustomerDetails", this.CustomerDetails);
        this.tabPane.add("Check Invoice", this.Check_Invoice);
        this.add(this.tabPane);
    }

    private void addTable() {
        this.invoiceModel = new DefaultTableModel(this.rowData, this.columnNames);
        this.invoiceTable = new JTable(this.invoiceModel);
        this.invoiceTable.setRowHeight(30);
        this.Print = new JButton("Print");
        this.Print.addActionListener(this);
        this.invoicePanel.setLayout(new BorderLayout());
        this.invoicePanel.add(new JScrollPane(this.invoiceTable));
        this.invoicePanel.add(this.Print, "South");
    }

    private void addBlanks() {
        this.Sno = new JTextField();
        this.Sno.setPreferredSize(new Dimension(100, 25));
        this.Qty = new JTextField();
        this.Qty.setPreferredSize(new Dimension(100, 25));
        this.Item_Description = new JComboBox();
        this.Item_Description.setPreferredSize(new Dimension(100, 25));
        this.Item_Description.addItem("tyre1");
        this.Item_Description.addItem("tyre2");
        this.Item_Description.addItem("fyre3");
        this.blankPanel.add(new JLabel("Invoice Number"));
        this.blankPanel.add(this.Sno);
        this.blankPanel.add(new JLabel("Item_Description"));
        this.blankPanel.add(this.Item_Description);
        this.blankPanel.add(new JLabel("Qty"));
        this.blankPanel.add(this.Qty);
    }

    public void actionPerformed(ActionEvent var1) {
        try {
            if (var1.getSource() == this.Submit) {
                if (this.Vizag.isSelected()) {
                    if (this.UserName.getText().equals("saikumar")) {
                        if (this.Password.getText().equals("password")) {
                            this.setTitle("Login success");
                            this.setTitle("Sri Sai Tyres");
                            this.CompletePanel.setVisible(false);
                            this.SouthPanel.setVisible(false);
                            this.tabPane.setVisible(true);
                            this.add(this.tabPane);
                            this.pack();
                        }
                    } else {
                        this.setTitle("login failed");
                    }
                } else {
                    this.setTitle("login failed");
                }
            } else if (var1.getSource() == this.ForgotPassword) {
                this.CompletePanel.setVisible(false);
                this.SouthPanel.setVisible(false);
                this.setTitle("call Admin 7337216225");
            }
        } catch (Exception var3) {
        }

    }

    private void addLoginPage() {
        this.Vizag = new JRadioButton("Vizag");
        this.Vizag.addActionListener(this);
        this.Vijayanagaram = new JRadioButton("Vijayanagaram");
        this.Vijayanagaram.addActionListener(this);
        this.Kuchamamba = new JRadioButton("Kuchamamba");
        this.Kuchamamba.addActionListener(this);
        this.CheckBoxPanel = new JPanel();
        this.CheckBoxPanel.setLayout(new FlowLayout());
        this.CheckBoxPanel.add(this.Vizag);
        this.CheckBoxPanel.add(this.Vijayanagaram);
        this.CheckBoxPanel.add(this.Kuchamamba);
        this.Submit = new JButton();
        this.Submit.setLabel("Submit");
        this.Submit.addActionListener(this);
        this.ForgotPassword = new JButton();
        this.ForgotPassword.setLabel("forgotPassword");
        this.ForgotPassword.addActionListener(this);
        this.img = new ImageIcon("C:/Users/SriSai/Desktop/ceat.jpeg");
        this.setIconImage(this.img.getImage());
        this.UserName = new JTextField();
        this.Password = new JPasswordField();
        this.UserPanel = new JPanel();
        this.UserPanel.setLayout(new FlowLayout());
        this.UserPanel.add(new JLabel("Username"));
        this.UserPanel.add(this.UserName);
        this.UserName.setPreferredSize(new Dimension(150, 25));
        this.PasswordPanel = new JPanel();
        this.PasswordPanel.setLayout(new FlowLayout());
        this.PasswordPanel.add(new JLabel("Password"));
        this.PasswordPanel.add(this.Password);
        this.Password.setPreferredSize(new Dimension(150, 25));
        this.CompletePanel = new JPanel();
        this.CompletePanel.setLayout(new BorderLayout());
        this.CompletePanel.add(this.CheckBoxPanel, "North");
        this.CompletePanel.add(this.UserPanel, "Center");
        this.CompletePanel.add(this.PasswordPanel, "South");
        this.setLayout(new BorderLayout());
        this.SouthPanel = new JPanel();
        this.SouthPanel.setLayout(new FlowLayout());
        this.SouthPanel.add(this.Submit);
        this.SouthPanel.add(this.ForgotPassword);
        this.add(this.CheckBoxPanel, "North");
        this.add(this.CompletePanel, "Center");
        this.add(this.SouthPanel, "South");
        this.tabPane.setVisible(false);
    }

    public static void main(String[] var0) throws Exception {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        UIManager.put("nimbusBase", new Color(242, 242, 189));
        UIManager.put("info", new Color(169, 46, 34));
        new MainFrame();
    }
}

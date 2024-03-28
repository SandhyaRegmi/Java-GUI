/**
 *This is the BankGUI that contain the GUI of previous coursework.
 *
 *@author Sandhya Regmi
 * ID:22072244
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.util.ArrayList;

public class BankGUI {
  private JFrame frame;
  private Dimension fullDimension;
  private JPanel panelDebit, panelCredit;
  private JLabel label1, label2, label3, label4, label5,
      labeld6, labeld7, labeld8,
      labelc6, labelc7, labelc8, labelc9, labelc10;
  private JTextField fieldd1, fieldd2, fieldd3, fieldd4, fieldd5, fieldd6,
      fieldd7, fieldd8, fieldd9,
      fieldc1, fieldc2, fieldc3, fieldc4, fieldc5, fieldc6, fieldc7, fieldc8,
      fieldc9, fieldc10, fieldc11;
  private JComboBox combod1, combod2, combod3, comboc1, comboc2, comboc3;
  private JButton buttond1, buttond2, buttond3, buttond4, buttond5, buttond6,
      buttonc1, buttonc2, buttonc3, buttonc4, buttonc5, buttonc6, buttonc7,
      button;
  private final static int INVALID = -1;
  private ArrayList<BankCard> list = new ArrayList<BankCard>();

  public BankGUI() {

    // making main frame
    frame = new JFrame();
    frame.setTitle("BankGUI");
    frame.setSize(600, 600);
    frame.setLayout(null);

    // frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.resiable(false);
    // to make screen full size
    Dimension fullDimension = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setSize(fullDimension.width, fullDimension.height);

    // making debitpanel
    panelDebit = new JPanel();
    panelDebit.setBounds(145, 20, 580, 650);
    // panelDebit.setSize(450,700);
    // panelDebit.setLocation(30,20);
    panelDebit.setLayout(null);
    panelDebit.setBackground(new Color(255, 182, 193));
    TitledBorder titleBorder = BorderFactory.createTitledBorder("Debit Card Details");
    titleBorder.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
    titleBorder.setTitleFont(new Font("Cambria", Font.BOLD, 17));
    titleBorder.setTitleJustification(TitledBorder.CENTER);
    panelDebit.setBorder(titleBorder);
    frame.add(panelDebit);

    // Making label Card IDSET
    label1 = new JLabel("Card ID:");
    label1.setBounds(35, 34, 200, 35);
    label1.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(label1);

    // Making textfield for Card ID
    fieldd1 = new JTextField();
    fieldd1.setBounds(130, 34, 150, 30);
    fieldd1.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd1);

    // Making label Client Name
    label2 = new JLabel("Client Name:");
    label2.setBounds(320, 34, 200, 35);
    label2.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(label2);

    // Making textfield for Client Name
    fieldd2 = new JTextField();
    fieldd2.setBounds(410, 34, 150, 30);
    fieldd2.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd2);

    // Making label Issuer Bank
    label3 = new JLabel("Issuer Bank:");
    label3.setBounds(35, 85, 200, 35);
    label3.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(label3);

    // Making textfield for Issuer Bank
    fieldd3 = new JTextField();
    fieldd3.setBounds(130, 85, 150, 30);
    fieldd3.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd3);

    // Making label Bank Account
    label4 = new JLabel("Bank Account:");
    label4.setBounds(320, 85, 200, 35);
    label4.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(label4);

    // Making textfield for Bank Account
    fieldd4 = new JTextField();
    fieldd4.setBounds(410, 85, 150, 30);
    fieldd4.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd4);

    // Making label Balance Amount
    label5 = new JLabel("Balance Amount:");
    label5.setBounds(35, 135, 200, 35);
    label5.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(label5);

    // Making textfield for Balance Amount
    fieldd5 = new JTextField();
    fieldd5.setBounds(140, 135, 150, 30);
    fieldd5.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd5);

    // Making label PIN Number
    labeld6 = new JLabel("PIN Number:");
    labeld6.setBounds(320, 135, 200, 35);
    labeld6.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(labeld6);

    // Making textfield for PIN Number
    fieldd6 = new JTextField();
    fieldd6.setBounds(410, 135, 150, 30);
    fieldd6.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd6);

    // PIN Number to withdraw
    labeld6 = new JLabel("PIN Number:");
    labeld6.setBounds(320, 240, 200, 35);
    labeld6.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(labeld6);

    // Making textfield for PIN Number to withdraw
    fieldd8 = new JTextField();
    fieldd8.setBounds(410, 240, 150, 30);
    fieldd8.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd8);

    // Making label Withdrawal Amount
    labeld7 = new JLabel("Withdrawal Amount:");
    labeld7.setBounds(35, 290, 200, 35);
    labeld7.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(labeld7);

    // Making textfield for Withdrawal Amount
    fieldd7 = new JTextField();
    fieldd7.setBounds(170, 290, 150, 30);
    fieldd7.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd7);

    // label of cardID for withdraw
    label1 = new JLabel("Card ID:");
    label1.setBounds(35, 240, 200, 35);
    label1.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(label1);

    // Making textfield of Card ID for withdraw
    fieldd9 = new JTextField();
    fieldd9.setBounds(120, 240, 150, 30);
    fieldd9.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldd9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(fieldd9);

    // Making label Withdrawal Date
    labeld8 = new JLabel("Withdrawal Date:");
    labeld8.setBounds(35, 335, 200, 35);
    labeld8.setFont(new Font("Cambria", Font.BOLD, 13));
    panelDebit.add(labeld8);

    // Making combobox for Withdrawal Date
    String[] Year = { "Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
        "2011", "2012", "2013", "2014", "2015",
        "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" };
    combod1 = new JComboBox<>(Year);
    combod1.setBounds(150, 335, 100, 30);
    combod1.setFont(new Font("Cambria", Font.BOLD, 13));
    combod1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(combod1);

    String[] Month = { "Month", "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov",
        "Dec" };
    combod2 = new JComboBox<>(Month);
    combod2.setBounds(270, 335, 100, 30);
    combod2.setFont(new Font("Cambria", Font.BOLD, 13));
    combod2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(combod2);

    String[] Day = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
        "18", "19", "20", "21",
        "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    combod3 = new JComboBox<>(Day);
    combod3.setBounds(390, 335, 100, 30);
    combod3.setFont(new Font("Cambria", Font.BOLD, 13));
    combod3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelDebit.add(combod3);

    // Creating button to add debit card
    buttond1 = new JButton("Add Debit Card");
    buttond1.setBounds(250, 185, 130, 30);
    buttond1.setFont(new Font("Cambria", Font.BOLD, 13));
    buttond1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttond1.setBackground(new Color(23, 152, 227));
    panelDebit.add(buttond1);

    // making anonymous class for add debit card button
    buttond1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        debitCard();
      }
    });

    buttond2 = new JButton("Withdraw");
    buttond2.setBounds(35, 400, 130, 30);
    buttond2.setFont(new Font("Cambria", Font.BOLD, 13));
    buttond2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttond2.setBackground(new Color(23, 152, 227));
    panelDebit.add(buttond2);

    // making anonymous class for withdraw button
    buttond2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        withdrawDebit();
      }
    });

    buttond3 = new JButton("Display");
    buttond3.setBounds(200, 400, 130, 30);
    buttond3.setFont(new Font("Cambria", Font.BOLD, 13));
    buttond3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttond3.setBackground(new Color(23, 152, 227));
    panelDebit.add(buttond3);

    // making anonymous class for display of debit
    buttond3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        debitDisplay();
      }
    });

    // to clear 2nd field of debit card
    buttond6 = new JButton("Clear");
    buttond6.setBounds(365, 400, 130, 30);
    buttond6.setFont(new Font("Cambria", Font.BOLD, 14));
    buttond6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttond6.setBackground(new Color(23, 152, 227));
    panelDebit.add(buttond6);

    // making anonymous class for clearing the 2nd textfield of debit card
    buttond6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttond6)

          // clear textfield of debit card
        fieldd7.setText("");
        fieldd8.setText("");
        fieldd9.setText("");

        // clear combobox of credit card
        combod1.setSelectedIndex(0);
        combod2.setSelectedIndex(0);
        combod3.setSelectedIndex(0);
      }
    });

    // to clear whole debit card field
    buttond4 = new JButton("Clear");
    buttond4.setBounds(365, 560, 130, 30);
    buttond4.setFont(new Font("Cambria", Font.BOLD, 14));
    buttond4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttond4.setBackground(new Color(23, 152, 227));
    panelDebit.add(buttond4);

    // making anonymous class for clearing the whole textfield of debit card
    buttond4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttond4)

          // clear textfield of debit card
        fieldd1.setText("");
        fieldd2.setText("");
        fieldd3.setText("");
        fieldd4.setText("");
        fieldd5.setText("");
        fieldd6.setText("");
        fieldd7.setText("");
        fieldd8.setText("");
        fieldd9.setText("");

        // clear combobox of credit card
        combod1.setSelectedIndex(0);
        combod2.setSelectedIndex(0);
        combod3.setSelectedIndex(0);
      }
    });

    // to clear first field of debit card
    buttond5 = new JButton("Clear");
    buttond5.setBounds(420, 185, 130, 30);
    buttond5.setFont(new Font("Cambria", Font.BOLD, 13));
    buttond5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    buttond5.setBackground(new Color(23, 152, 227));
    panelDebit.add(buttond5);

    // anynomous button for clearing the 1st textfield of debit card
    buttond5.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttond5)

              // clear textfield of debit card
            fieldd1.setText("");
            fieldd2.setText("");
            fieldd3.setText("");
            fieldd4.setText("");
            fieldd5.setText("");
            fieldd6.setText("");
          }
        });

    // making credit panel
    panelCredit = new JPanel();
    panelCredit.setBounds(750, 20, 580, 650);
    // panelCredit.setSize(450,700);
    // panelCredit.setLocation(510,20);
    // panelCredit.setLayout(new FlowLayout());
    panelCredit.setLayout(null);
    panelCredit.setBackground(new Color(255, 182, 193));
    TitledBorder titleBorder1 = BorderFactory.createTitledBorder("Credit Card Details");
    titleBorder1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
    titleBorder1.setTitleFont(new Font("Cambria", Font.BOLD, 17));
    titleBorder1.setTitleJustification(TitledBorder.CENTER);
    panelCredit.setBorder(titleBorder1);
    // panelCredit.setBorder(BorderFactory.createTitledBorder("Credit Card
    // Details"));
    frame.add(panelCredit);

    // Making label Card ID
    label1 = new JLabel("Card ID:");
    label1.setBounds(35, 34, 200, 35);
    label1.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label1);

    // Making textfield for Card ID
    fieldc1 = new JTextField();
    fieldc1.setBounds(130, 34, 150, 30);
    fieldc1.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc1);

    // Making label Client Name
    label2 = new JLabel("Client Name:");
    label2.setBounds(300, 34, 200, 35);
    label2.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label2);

    // Making textfield for Client Name
    fieldc2 = new JTextField();
    fieldc2.setBounds(400, 34, 150, 30);
    fieldc2.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc2);

    // Making label Issuer Bank
    label3 = new JLabel("Issuer Bank:");
    label3.setBounds(35, 85, 200, 35);
    label3.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label3);

    // Making textfield for Issuer Bank
    fieldc3 = new JTextField();
    fieldc3.setBounds(130, 85, 150, 30);
    fieldc3.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc3);

    // Making label Bank Account
    label4 = new JLabel("Bank Account:");
    label4.setBounds(300, 85, 200, 35);
    label4.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label4);

    // Making textfield for Bank Account
    fieldc4 = new JTextField();
    fieldc4.setBounds(400, 85, 150, 30);
    fieldc4.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc4);

    // Making label Balance Amount
    label5 = new JLabel("Balance Amount:");
    label5.setBounds(35, 135, 200, 35);
    label5.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label5);

    // Making textfield for Balance Amount
    fieldc5 = new JTextField();
    fieldc5.setBounds(140, 135, 150, 30);
    fieldc5.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc5);

    // Making label CVC Number
    labelc6 = new JLabel("CVC Number:");
    labelc6.setBounds(310, 135, 200, 35);
    labelc6.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(labelc6);

    // Making textfield for CVC Number
    fieldc6 = new JTextField();
    fieldc6.setBounds(400, 135, 150, 30);
    fieldc6.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc6);

    // Making label Interest Rate
    labelc8 = new JLabel("Interest Rate:");
    labelc8.setBounds(35, 190, 200, 35);
    labelc8.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(labelc8);

    // Making textfield for Interest Rate
    fieldc8 = new JTextField();
    fieldc8.setBounds(130, 190, 150, 30);
    fieldc8.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc8);

    // Making label Credit Limit
    labelc7 = new JLabel("Credit Limit:");
    labelc7.setBounds(310, 380, 200, 35);
    labelc7.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(labelc7);

    // Making textfield for Credit limit
    fieldc7 = new JTextField();
    fieldc7.setBounds(400, 380, 150, 30);
    fieldc7.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc7);

    // Making label Grace Period
    labelc9 = new JLabel("Grace Period:");
    labelc9.setBounds(35, 380, 200, 35);
    labelc9.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(labelc9);

    // Making textfield for Grace Period
    fieldc9 = new JTextField();
    fieldc9.setBounds(130, 380, 150, 30);
    fieldc9.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc9);

    // Making label Expiration Date
    labelc10 = new JLabel("Expiration Date:");
    labelc10.setBounds(35, 235, 270, 30);
    labelc10.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(labelc10);

    // Making combobox for Expiration Date
    String[] Yearc = { "Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
        "2011", "2012", "2013", "2014", "2015",
        "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" };
    comboc1 = new JComboBox<>(Yearc);
    comboc1.setBounds(150, 235, 100, 30);
    comboc1.setFont(new Font("Cambria", Font.BOLD, 13));
    comboc1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(comboc1);

    String[] Monthc = { "Month", "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov",
        "Dec" };
    comboc2 = new JComboBox<>(Monthc);
    comboc2.setBounds(270, 235, 100, 30);
    comboc2.setFont(new Font("Cambria", Font.BOLD, 13));
    comboc2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(comboc2);

    String[] Dayc = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
        "17", "18", "19", "20", "21",
        "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    comboc3 = new JComboBox<>(Dayc);
    comboc3.setBounds(390, 235, 100, 30);
    comboc3.setFont(new Font("Cambria", Font.BOLD, 13));
    comboc3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(comboc3);

    // Making label Card ID for cancel credit card
    label1 = new JLabel("Card ID:");
    label1.setBounds(35, 490, 270, 35);
    label1.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label1);

    // Making textfield for Card ID of cancel credit card
    fieldc10 = new JTextField();
    fieldc10.setBounds(130, 490, 150, 30);
    fieldc10.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc10);

    // Making label for cardID of set credit Limit
    label1 = new JLabel("Card ID:");
    label1.setBounds(35, 330, 200, 35);
    label1.setFont(new Font("Cambria", Font.BOLD, 13));
    panelCredit.add(label1);

    // Making textfield for Card ID of set credit limit
    fieldc11 = new JTextField();
    fieldc11.setBounds(130, 330, 150, 30);
    fieldc11.setFont(new Font("Cambria", Font.BOLD, 13));
    fieldc11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    panelCredit.add(fieldc11);

    // Creating button add credit card
    buttonc1 = new JButton("Add Credit Card");
    buttonc1.setBounds(250, 285, 130, 30);
    buttonc1.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc1.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc1);

    buttonc1.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            creditCard();
          }
        });

    buttonc2 = new JButton("Set Credit Limit");
    buttonc2.setBounds(35, 430, 130, 30);
    buttonc2.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc2.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc2);

    buttonc2.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            creditLimit();
          }
        });

    // button to clear credit limit
    buttonc7 = new JButton("Clear");
    buttonc7.setBounds(400, 430, 130, 30);
    buttonc7.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc7.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc7);

    // making anonymous class for clearing the set credit limit
    buttonc7.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonc7)
            fieldc9.setText("");
            fieldc7.setText("");
            fieldc11.setText("");
          }
        });

    // button to cancel credit card
    buttonc3 = new JButton("Cancel Credit Card");
    buttonc3.setBounds(35, 540, 130, 30);
    buttonc3.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc3.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc3);

    // anonymous class to cancel the credit card
    buttonc3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cancelCreditCard();
      }
    });

    // button to display credit card details
    buttonc4 = new JButton("Display");
    buttonc4.setBounds(200, 430, 130, 30);
    buttonc4.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc4.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc4);

    // anonymous class for button display of credit card
    buttonc4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        creditDisplay();
      }
    });

    // to clear all credit field
    buttonc5 = new JButton("Clear");
    buttonc5.setBounds(400, 580, 130, 30);
    buttonc5.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc5.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc5);

    // making anonymous button for clearing the credit card
    buttonc5.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonc5)

              // clear textfield of credit card
            fieldc1.setText("");
            fieldc2.setText("");
            fieldc3.setText("");
            fieldc4.setText("");
            fieldc5.setText("");
            fieldc6.setText("");
            fieldc7.setText("");
            fieldc8.setText("");
            fieldc9.setText("");
            fieldc10.setText("");
            fieldc11.setText("");

            // clear combobox of credit card
            comboc1.setSelectedIndex(0);
            comboc2.setSelectedIndex(0);
            comboc3.setSelectedIndex(0);
          }
        });

    // to clear first field of credit card
    buttonc6 = new JButton("Clear");
    buttonc6.setBounds(400, 285, 130, 30);
    buttonc6.setFont(new Font("Cambria", Font.BOLD, 13));
    buttonc6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    buttonc6.setBackground(new Color(23, 152, 227));
    panelCredit.add(buttonc6);

    // making anonymous button for clearing the credit card buttonc6
    buttonc6.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonc6)

              // clear textfield of credit card
            fieldc1.setText("");
            fieldc2.setText("");
            fieldc3.setText("");
            fieldc4.setText("");
            fieldc5.setText("");
            fieldc6.setText("");
            fieldc8.setText("");

            // clear combobox of credit card
            comboc1.setSelectedIndex(0);
            comboc2.setSelectedIndex(0);
            comboc3.setSelectedIndex(0);
          }
        });

    // button to clear debit and credit card
    button = new JButton("Clear");
    button.setBounds(660, 700, 130, 30);
    button.setFont(new Font("Cambria", Font.BOLD, 13));
    button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
    button.setBackground(new Color(23, 152, 227));
    frame.add(button);

    // making amonymous button for clearing the textfield of credit card and debit
    // card
    button.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button)

              // clear textfield of debit card
            fieldd1.setText("");
            fieldd2.setText("");
            fieldd3.setText("");
            fieldd4.setText("");
            fieldd5.setText("");
            fieldd6.setText("");
            fieldd7.setText("");
            fieldd8.setText("");
            fieldd9.setText("");

            // clear combobox of debit card
            combod1.setSelectedIndex(0);
            combod2.setSelectedIndex(0);
            combod3.setSelectedIndex(0);

            // clear textfield of credit card
            fieldc1.setText("");
            fieldc2.setText("");
            fieldc3.setText("");
            fieldc4.setText("");
            fieldc5.setText("");
            fieldc6.setText("");
            fieldc7.setText("");
            fieldc8.setText("");
            fieldc9.setText("");
            fieldc10.setText("");
            fieldc11.setText("");

            // clear combobox of credit card
            comboc1.setSelectedIndex(0);
            comboc2.setSelectedIndex(0);
            comboc3.setSelectedIndex(0);
          }

        });

    frame.setVisible(true);

  }

  // method of display debit
  public void debitDisplay() {
    boolean check = false;

    for (BankCard obj : list)

      if (obj instanceof DebitCard) {
        DebitCard d = (DebitCard) obj;
        d.display();
        check = true;

      }
    if (check) {
      JOptionPane.showMessageDialog(panelDebit, "Please visit terminal for the details.", "Success Box",
          JOptionPane.INFORMATION_MESSAGE);
    }
  }

  // method of display credit
  public void creditDisplay() {
    boolean check = false;
    for (BankCard obj : list)

      if (obj instanceof CreditCard) {
        CreditCard c = (CreditCard) obj;
        c.display();
        check = true;

      }
    if (check) {
      JOptionPane.showMessageDialog(panelCredit, "Please visit terminal for the details.", "Success Box",
          JOptionPane.INFORMATION_MESSAGE);
    }
  }

  // validation for debitCard
  public void debitCard() {
    int cardID = getCardID();
    if (cardID == INVALID) {
      JOptionPane.showMessageDialog(panelDebit, "Enter valid Card ID \n It should be greater than 0.",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;

    }

    String clientName = getClientName();
    if (clientName.isEmpty()) {
      JOptionPane.showMessageDialog(panelDebit, "Fill the Client Name field.",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    String issuerBank = getIssuerBank();
    if (issuerBank.isEmpty()) {
      JOptionPane.showMessageDialog(panelDebit, "Fill the issuer bank field.",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    String bankAccount = getBankAccount();
    if (bankAccount.isEmpty()) {
      JOptionPane.showMessageDialog(panelDebit, "Fill the Bank Account field",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    int balanceAmount = getBalanceAmount();
    {
      if (balanceAmount == INVALID) {
        JOptionPane.showMessageDialog(panelDebit,
            "Balance amount is invalid.\n It should be positive integer value ",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return;

      }

    }

    int PINNumber = getPINNumber();
    {
      if (PINNumber == INVALID) {
        JOptionPane.showMessageDialog(panelDebit,
            "Enter valid PIN Number \n It should be greater than 0.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
    }

    boolean result = checkCardIDUnique(cardID);
    if (result == false) {
      DebitCard obj = new DebitCard(issuerBank, bankAccount, cardID, balanceAmount, clientName, PINNumber);
      list.add(obj);
      JOptionPane.showMessageDialog(panelDebit, "Object of Debit Card is added to the arraylist. ", 
      "success box",
      JOptionPane.INFORMATION_MESSAGE) ; 
    }
    else
    {
      JOptionPane.showMessageDialog(panelDebit, "Card ID should be unique.", "Warning Box", 0);
    }
  }

  public void creditCard() {

    int cardID = getCardID1();
    if (cardID == INVALID) {
      JOptionPane.showMessageDialog(panelCredit, "Enter valid Card ID \n Greater than 0.",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;

    }

    String clientName = getClientName1();
    if (clientName.isEmpty()) {
      JOptionPane.showMessageDialog(panelCredit, "Fill the Client Name field.",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    String issuerBank = getIssuerBank1();
    if (issuerBank.isEmpty()) {
      JOptionPane.showMessageDialog(panelCredit, "Fill the issuer bank field.",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    String bankAccount = getBankAccount1();
    if (bankAccount.isEmpty()) {
      JOptionPane.showMessageDialog(panelCredit, "Fill the Bank Account field",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    int balanceAmount = getBalanceAmount1();
    {
      if (balanceAmount == INVALID) {
        JOptionPane.showMessageDialog(panelCredit,
            "The Balance Amount is invalid.\n Provide positive integer value.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return;

      }

    }

    int CVCNumber = getCVCNumber();
    {
      if (CVCNumber == INVALID) {
        JOptionPane.showMessageDialog(panelCredit, "The CVC Number is invalid. /n It cannot be negative value.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return;

      }
    }

    String expirationDate = getExpirationDate();
    {
      if (expirationDate == null) {
        JOptionPane.showMessageDialog(panelCredit, "Date field is not selected. \n Select Expiration date",
            "Error box",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
    }

    double interestRate = getInterestRate();
    {
      if (interestRate == INVALID) {
        JOptionPane.showMessageDialog(panelCredit, "The Interest rate is not valid. ",
            "Error box",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
    }

    boolean result = checkCardID1Unique(cardID);
    if (result == false) {
      CreditCard obj = new CreditCard(issuerBank, bankAccount, cardID, balanceAmount, clientName, CVCNumber,
          interestRate, expirationDate);
      list.add(obj);
      JOptionPane.showMessageDialog(panelCredit, "Object of Credit Card is added to the arraylist. ",
      "Success box",
      JOptionPane.INFORMATION_MESSAGE);
    }
    else 
    {
      JOptionPane.showMessageDialog(panelCredit, "Card ID should be unique.", "Warning Box", 0);
    }
  }

  public boolean checkCardIDUnique(int cardID) {
    boolean result = false;
    for (BankCard obj : list)

      if (obj instanceof DebitCard) {
        DebitCard d = (DebitCard) obj;
        if (d.getCardID() == cardID) {
          result = true;
          // JOptionPane.showMessageDialog(panelDebit,"Object is added to the
          // arraylist","success box", 0);
        }
      }
    return result;
  }

  public boolean checkCardID1Unique(int cardID) {
    boolean result = false;
    for (BankCard obj : list)

      if (obj instanceof CreditCard) {
        CreditCard c = (CreditCard) obj;
        if (c.getCardID() == cardID) {
          result = true;
          // JOptionPane.showMessageDialog(panelDebit,"Object is added to the
          // arraylist","success box", 0);
        }
      }
    return result;
  }

  // getter method for card id of debit card
  public int getCardID() {
    int cardID = INVALID;
    try {
      cardID = Integer.parseInt(fieldd1.getText().trim());
      if (cardID <= 0) {
        cardID = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelDebit,
          "Fill the Card ID field.", 
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return cardID;
  }

  // getter method for card id of creditCard
  public int getCardID1() {
    int cardID = INVALID;
    try {
      cardID = Integer.parseInt(fieldc1.getText().trim());
      if (cardID <= 0) {
        cardID = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Fill the Card ID field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return cardID;
  }

  // getter method for client name of debit card
  public String getClientName() {
    return fieldd2.getText().trim();

  }

  // getter method for client name of credit card
  public String getClientName1() {
    return fieldc2.getText().trim();

  }

  // getter method for issuer bank of debit card
  public String getIssuerBank() {
    return fieldd3.getText().trim();
  }

  // getter method for user bank of credit card
  public String getIssuerBank1() {
    return fieldc3.getText().trim();
  }

  // getter method for bank account of debit card
  public String getBankAccount() {
    return fieldd4.getText().trim();
  }

  // getter method for bank account of credit card
  public String getBankAccount1() {
    return fieldc4.getText().trim();
  }

  // getter method for balance amount of debit card
  public int getBalanceAmount() {
    int balanceAmount = INVALID;
    try {
      balanceAmount = Integer.parseInt(fieldd5.getText().trim());
      if (balanceAmount < 0) {
        balanceAmount = INVALID;
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(panelDebit,
          "Fill the Balance Amount field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return balanceAmount;
  }

  // getter method for balance amount of credit card
  public int getBalanceAmount1() {
    int balanceAmount = INVALID;
    try {
      balanceAmount = Integer.parseInt(fieldc5.getText().trim());
      if (balanceAmount < 0) {
        balanceAmount = INVALID;
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(panelCredit,
          "Fill the Balance Amount field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return balanceAmount;
  }

  // getter method for pinnumber of debit card
  public int getPINNumber() {
    int PINNumber = INVALID;
    try {
      PINNumber = Integer.parseInt(fieldd6.getText().trim());
      if (PINNumber <= 0) {
        PINNumber = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelDebit,
          "Please fill the PIN Number field",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return PINNumber;
  }

  public int getWPINNumber() {
    int PINNumber = INVALID;
    try {
      PINNumber = Integer.parseInt(fieldd8.getText().trim());
      if (PINNumber <= 0) {
        PINNumber = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelDebit,
          "Please fill the PIN Number field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return PINNumber;
  }

  // getter method for withdraw cardID
  public int getWCardID() {
    int cardID = INVALID;
    try {
      cardID = Integer.parseInt(fieldd9.getText().trim());
      if (cardID <= 0) {
        cardID = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      /*
       * JOptionPane.showMessageDialog(panelDebit,
       * "Fill the Card ID field.",
       * "Error Box",
       * JOptionPane.ERROR_MESSAGE);
       */
    }
    return cardID;
  }

  // getter method for CVC Number of credit card

  public int getCVCNumber() {
    int CVCNumber = INVALID;
    try {
      CVCNumber = Integer.parseInt(fieldc6.getText().trim());
      if (CVCNumber < 0) {
        CVCNumber = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Fill the CVC Number field",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return CVCNumber;
  }

  // getter method for withdrawal date
  public String getWithdrawalDate() {
    String date = "";
    String Year = combod1.getSelectedItem().toString();
    String Month = combod2.getSelectedItem().toString();
    String Day = combod3.getSelectedItem().toString();

    if (Year.equals("Year") || Month.equals("Month") || Day.equals("Day")) {
      date = null;
    } else {
      date = (Year + "-" + Month + "-" + Day);
    }
    return date;
  }

  // getter method for withdrawal amount
  public int getWithdrawalAmount() {
    int withdrawalAmount = INVALID;
    try {
      withdrawalAmount = Integer.parseInt(fieldd7.getText().trim());
      if (withdrawalAmount < 0) {
        withdrawalAmount = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelDebit,
          "Please fill the Withdrawal Amount field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return withdrawalAmount;
  }

  // getter method for expiration date for credit card
  public String getExpirationDate() {
    String expirationDate = "";
    String Yearc = comboc1.getSelectedItem().toString();
    String Monthc = comboc2.getSelectedItem().toString();
    String Dayc = comboc3.getSelectedItem().toString();

    if (Yearc.equals("Year") || Monthc.equals("Month") || Dayc.equals("Day")) {
      expirationDate = null;
    } else {
      expirationDate = (Yearc + "-" + Monthc + "-" + Dayc);
    }
    return expirationDate;
  }

  // getter method for interest rate of credit card
  public double getInterestRate() {
    double interestRate = INVALID;
    try {
      interestRate = Double.parseDouble(fieldc6.getText().trim());
      if (interestRate < 0) {
        interestRate = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Please fill the Interest Rate field",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return interestRate;
  }

  // getter method for grace period of credit card
  public int getGracePeriod() {
    int gracePeriod = INVALID;
    try {
      gracePeriod = Integer.parseInt(fieldc9.getText().trim());
      if (gracePeriod <= 0) {
        gracePeriod = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Please fill the grace period field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return gracePeriod;
  }

  // getter method of card id for cancel credit card
  public int getCCardID() {
    int cardID = INVALID;
    try {
      cardID = Integer.parseInt(fieldc10.getText().trim());
      if (cardID <= 0) {
        cardID = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Please fill the Card ID field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return cardID;
  }

  public double getCreditLimit() {
    double creditLimit = INVALID;
    try {
      creditLimit = Double.parseDouble(fieldc7.getText().trim());
      if (creditLimit < 0) {
        creditLimit = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Please fill the Credit Limit field",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return creditLimit;
  }

  public int getSCardID() {
    int cardID = INVALID;
    try {
      cardID = Integer.parseInt(fieldc11.getText().trim());
      if (cardID <= 0) {
        cardID = INVALID;
      }
    } catch (NumberFormatException e) {
      // Exception handling
      JOptionPane.showMessageDialog(panelCredit,
          "Please fill the Card ID field.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);
    }
    return cardID;
  }

  public void creditLimit()
  {
    int cardID = getSCardID();
      if (cardID == INVALID) {
      JOptionPane.showMessageDialog(panelCredit,
          "Card ID must be valid positive integer value.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }

    int gracePeriod = getGracePeriod();
      if (gracePeriod == INVALID) {
      JOptionPane.showMessageDialog(panelCredit,
          "Grace Period field is empty.\n Please fill it.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }

    double creditLimit = getCreditLimit();
    if (creditLimit == INVALID) {

      JOptionPane.showMessageDialog(panelCredit,
          "Credit Limit is not valid.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }

    boolean isFound = false;
    for (BankCard obj : list) {
      if (obj instanceof CreditCard) {
        CreditCard c = (CreditCard) obj;
        if (c.getCardID() == cardID) {
          isFound = true;
          c.setCreditLimit(creditLimit, gracePeriod);
          break;

        }

      }
    }
    if (isFound == false) {
      JOptionPane.showMessageDialog(panelCredit, "Please use same Card ID to set Credit Limit.", "Error",
          JOptionPane.ERROR_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(panelCredit, "Credit Limit is set. \n Please visit terminal for the verification.",
          "Information Message",
          JOptionPane.INFORMATION_MESSAGE);
    }
  }

  public void cancelCreditCard() {
    int cardID = getCCardID();
    if (cardID == INVALID) {
      JOptionPane.showMessageDialog(panelCredit,
          "Card ID must be valid positive integer value.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }
    boolean isFound = false;
    for (BankCard obj : list) {
      if (obj instanceof CreditCard) {
        CreditCard c = (CreditCard) obj;
        if (c.getCardID() == cardID) {
          isFound = true;
          c.cancelCreditCard();
          break;

        }

      }
    }
    if (isFound == false) {
      JOptionPane.showMessageDialog(panelCredit, "Please use same Card ID to cancel credit card.",
         "Error",
          JOptionPane.ERROR_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(panelCredit,
          "Credit Card is cancelled. \n Please visit terminal for the verification.", 
          "Information Message",
          JOptionPane.INFORMATION_MESSAGE);
    }
  }

  public void withdrawDebit() {

    int cardID = getWCardID();
    if (cardID == INVALID) {
      JOptionPane.showMessageDialog(panelDebit,
          "Card ID must be valid positive integer value.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }

    int PINNumber = getWPINNumber();
    if (PINNumber == INVALID) {
      JOptionPane.showMessageDialog(panelDebit,
          "PIN Number field is empty. \n Please fill it.", 
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }

    String withdrawalDate = getWithdrawalDate();
    if (withdrawalDate == null) {

      JOptionPane.showMessageDialog(panelDebit,
          "Withdrawal Date is not selected.\n Please select the date.",
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;

    }

    int withdrawalAmount = getWithdrawalAmount();
    if (withdrawalAmount == INVALID) {
      JOptionPane.showMessageDialog(panelDebit,
          "Withdrawal Amount field is empty./n Please fill the amount you want to withdraw.", 
          "Error Box",
          JOptionPane.ERROR_MESSAGE);

      return;
    }

    boolean isFound = false;
    for (BankCard obj : list) {
      if (obj instanceof DebitCard) {
        DebitCard d = (DebitCard) obj;
        if (d.getCardID() == cardID) {
          isFound = true;
          d.withdraw(withdrawalAmount, withdrawalDate, PINNumber);
          break;

        }

      }
    }
    if (isFound == false) {
      JOptionPane.showMessageDialog(panelDebit, "Please use same Card ID for the withdraw of amount.",
         "Error",
          JOptionPane.ERROR_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(panelDebit,
          "Amount is succesfully withdrawn. \n See in terminal for the verification.", "Information Message",
          JOptionPane.INFORMATION_MESSAGE);
    }

  }

  // main method
  public static void main(String[] args) {
    new BankGUI();

  }

}

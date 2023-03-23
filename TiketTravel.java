import java.awt.event.*;
import javax.swing.*;

public class TiketTravel implements ActionListener{
    private JLabel lAtas, l1, l2, l3, l4, l5;
    private JTextField tf1, tf2, tf3;
    private JRadioButton rb1, rb2, rb3;
    private JCheckBox cb1, cb2, cb3;
    private ButtonGroup bg;
    private JButton btnHapus, btnPesan;
    private String tujuan, fas1, fas2, fas3;
        
    public TiketTravel(){

        JFrame frame = new JFrame();
        frame.setBounds(400,200,500,400);
        frame.setTitle("JASA TRAVEL MALANG");

        //Tombol 
        btnPesan = new JButton("PESAN");
        btnPesan.setBounds(150,320,90,30);
        frame.add(btnPesan);

        btnHapus = new JButton("HAPUS");
        btnHapus.setBounds(260,320,90,30);
        frame.add(btnHapus);

        //Label
        lAtas = new JLabel("   PEMESANAN TIKET TRAVEL");
        lAtas.setBounds(150, 10, 300, 30);
        frame.add(lAtas);

        l1 = new JLabel("Nama Pemesanan : ");
        l1.setBounds(20, 40, 200, 30);
        frame.add(l1);

        l2 = new JLabel("Alamat Pemesan : ");
        l2.setBounds(20, 80, 200, 30);
        frame.add(l2);

        l3 = new JLabel("No.HP / Telepon : ");
        l3.setBounds(20, 120, 200, 30);
        frame.add(l3);

        l4 = new JLabel("Tujuan : ");
        l4.setBounds(20, 160, 200, 30);
        frame.add(l4);

        l5 = new JLabel("Fasilitas : ");
        l5.setBounds(220, 160, 200, 30);
        frame.add(l5);

        //Input Text 
        tf1 = new JTextField();
        tf1.setText("ENDAH PUJI ROHMAWATI");
        tf1.setBounds(150, 45, 300, 30);
        frame.add(tf1);
 
        tf2 = new JTextField();
        tf2.setText("KAUMAN, SRENGAT, BLITAR");
        tf2.setBounds(150, 85, 300, 30);
        frame.add(tf2);

        tf3 = new JTextField();
        tf3.setText("085678901234");
        tf3.setBounds(150, 125, 300, 30);
        frame.add(tf3);

        //Radio Button
        rb1 = new JRadioButton("Blitar");
        rb1.setBounds(20, 190, 100, 30);
        frame.add(rb1);
        
        rb2 = new JRadioButton("Surabaya");
        rb2.setBounds(20, 220, 100, 30);
        frame.add(rb2);
        
        rb3 = new JRadioButton("Kediri");
        rb3.setBounds(20, 250, 100, 30);
        frame.add(rb3);
        
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        //CheckBox
        cb1 = new JCheckBox("AC.");
        cb1.setBounds(220, 190, 100, 30);
        frame.add(cb1);

        cb2 = new JCheckBox("TV.");
        cb2.setBounds(220, 220, 100, 30);
        frame.add(cb2);

        cb3 = new JCheckBox("WiFi.");
        cb3.setBounds(220, 250, 100, 30);
        frame.add(cb3);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnPesan.addActionListener(this);
        btnHapus.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnPesan){

            if (cb1.isSelected()) {
                this.fas1 = "AC.";
            }else{
                this.fas1 = "";
            }
            
            if(cb2.isSelected()){
                this.fas2 = "TV.";
            }else{
                this.fas2 = "";
            }

            if(cb3.isSelected()){
                this.fas3 = "WiFi";
            }else{
                this.fas3 = "";
            }
            
            if (rb1.isSelected()) {
                tujuan = rb1.getText();
            }else if(rb2.isSelected()){
                tujuan = rb2.getText();
            }else if(rb3.isSelected()){
                tujuan = rb3.getText();
            }else{
                tujuan = "Anda Belom Memilih";
            }

            String nama   = tf1.getText();
            String alamat = tf2.getText();
            String noHP   = tf3.getText();
            
            JOptionPane.showMessageDialog(null, "Nama Pemesan : "+nama+
                                                                "\nAlamat Pemesan : "+alamat+
                                                                "\nNo. HP / Telepon : "+noHP+
                                                                "\nTujuan : "+tujuan+
                                                                "\nFasilitas : "+fas1+fas2+fas3 ,"INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }else if(e.getSource()==btnHapus){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            cb1.setSelected(false);
            cb2.setSelected(false);
            cb3.setSelected(false);
            bg.clearSelection();
        }
    }

    public static void main(String[] args) {
        TiketTravel develop = new TiketTravel();
    }
}



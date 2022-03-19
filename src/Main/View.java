/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.InputMismatchException;
import java.awt.event.ActionListener;
import javax.swing.*;
import ruang.Balok;
/**
 *
 * @author asus
 */
public class View extends JFrame implements ActionListener{
    JLabel lHeading = new JLabel("Kalkulator Segi Empat");
    JLabel lPanjang = new JLabel("Panjang   : ");
    JTextField fPanjang = new JTextField(10); //utk input
    
    JLabel lLebar   = new JLabel ("Lebar       : ");
    JTextField fLebar = new JTextField(10);
   
    JLabel lTinggi  = new JLabel ("Tinggi      : ");
    JTextField fTinggi = new JTextField(10);
    
    JLabel lResult = new JLabel ("Hasil: ");
    JLabel lLuasPersegiPanjang     = new JLabel();
    JLabel lKelilingPersegiPanjang = new JLabel();
    JLabel lVolumeBalok            = new JLabel();
    JLabel lLuasPermukaanBalok     = new JLabel();
    
    JButton btnHitung = new JButton("Hitung");
    JButton btnReset = new JButton("Reset");
    
    public View(){
        setTitle("123200152_Tugas3");
        setSize(510,500);
        
        setLayout(null);
        
        add(lHeading);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lResult);
        add(lLuasPersegiPanjang);
        add(lKelilingPersegiPanjang);
        add(lVolumeBalok);
        add(lLuasPermukaanBalok);
        add(btnHitung);
        add(btnReset);
        
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
        //x y a b
        //note: yg y nya sama berati sejajar
        lHeading.setBounds(185,35,200,20);
        lPanjang.setBounds(120,100,120,20);
        fPanjang.setBounds(195,100,150,20);
        
        lLebar.setBounds(120,135,120,20);
        fLebar.setBounds(195,135,150,20);//35+35=70
                
        lTinggi.setBounds(120,170,120,20);
        fTinggi.setBounds(195,170,150,20);
        
        lResult.setBounds(225,215,210,20);
        lLuasPersegiPanjang.setBounds(120,255,200,20);
        lKelilingPersegiPanjang.setBounds(120,285,200,20);
        lVolumeBalok.setBounds(120,315,200,20);
        lLuasPermukaanBalok.setBounds(120,345,200,20);
        
        btnHitung.setBounds(120,395,100,20);
        btnReset.setBounds(275,395,100,20);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btnHitung){
            if(fTinggi.getText().equals("") && fLebar.getText().equals("") && fTinggi.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Belum Ada Data Yang Diinput!");
            }else if(fPanjang.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Kolom Panjang Tidak Boleh Kosong");
            }else if(fLebar.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Kolom Lebar Tidak Boleh Kosong");
            }else if(fTinggi.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Kolom Tinggi Tidak Boleh Kosong");
            }else{ 
                try{                    
                    int hasilPanjang= Integer.parseInt(fPanjang.getText());
                    int hasilLebar= Integer.parseInt(fLebar.getText());
                    int hasilTinggi= Integer.parseInt(fTinggi.getText());
                    Balok balok = new Balok(hasilTinggi, hasilPanjang, hasilLebar);
                    lLuasPersegiPanjang.setText     ("Luas Persegi Panjang       : " + balok.luas());
                    lKelilingPersegiPanjang.setText ("Keliling Persegi Panjang  : " + balok.keliling());
                    lVolumeBalok.setText            ("Volume Balok                     : " + balok.volume());
                    lLuasPermukaanBalok.setText     ("Luas Permukaan Balok     : " + balok.luasPermukaan());
                }catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Error: " +exception.getMessage());
                }
            }
        }
        else if (actionEvent.getSource() == btnReset){
            fPanjang.setText("");
            fLebar.setText("");
            fTinggi.setText("");
            lLuasPersegiPanjang.setText("");
            lKelilingPersegiPanjang.setText("");
            lVolumeBalok.setText("");
            lLuasPermukaanBalok.setText("");
        } 
    }
}

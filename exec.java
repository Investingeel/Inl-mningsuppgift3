package Sprint3.InlämningsUppgift1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class exec extends RandomNumber implements ActionListener {

    JButton jb1 = new JButton(String.valueOf(getN1()));
    JButton jb2 = new JButton(String.valueOf(getN2()));
    JButton jb3 = new JButton(String.valueOf(getN3()));
    JButton jb4 = new JButton(String.valueOf(getN4()));
    JButton jb5 = new JButton(String.valueOf(getN5()));
    JButton jb6 = new JButton(String.valueOf(getN6()));
    JButton jb7 = new JButton(String.valueOf(getN7()));
    JButton jb8 = new JButton(String.valueOf(getN8()));
    JButton jb9 = new JButton(String.valueOf(getN9()));
    JButton jb10 = new JButton(String.valueOf(getN10()));
    JButton jb11 = new JButton(String.valueOf(getN11()));
    JButton jb12 = new JButton(String.valueOf(getN12()));
    JButton jb13 = new JButton(String.valueOf(getN13()));
    JButton jb14 = new JButton(String.valueOf(getN14()));
    JButton jb15 = new JButton(String.valueOf(getN15()));
    JButton jb16 = new JButton("");
    JButton newGame = new JButton("Nytt spel");
    JButton jb0 = new JButton("");

    public exec() {


        add(newGame);
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jb7);
        add(jb8);
        add(jb9);
        add(jb10);
        add(jb11);
        add(jb12);
        add(jb13);
        add(jb14);
        add(jb15);
        add(jb16);
        add(jb0);


        jb1.setBounds(20,10,100,80);
        jb2.setBounds(140,10,100,80);
        jb3.setBounds(260,10,100,80);
        jb4.setBounds(380,10,100,80);
        jb5.setBounds(20,110,100,80);
        jb6.setBounds(140,110,100,80);
        jb7.setBounds(260,110,100,80);
        jb8.setBounds(380,110,100,80);
        jb9.setBounds(20,210,100,80);
        jb10.setBounds(140,210,100,80);
        jb11.setBounds(260,210,100,80);
        jb12.setBounds(380,210,100,80);
        jb13.setBounds(20,310,100,80);
        jb14.setBounds(140,310,100,80);
        jb15.setBounds(260,310,100,80);
        jb16.setBounds(380,310,100,80);

        newGame.setBounds(125,410,250,50);




        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);
        jb10.addActionListener(this);
        jb11.addActionListener(this);
        jb12.addActionListener(this);
        jb13.addActionListener(this);
        jb14.addActionListener(this);
        jb15.addActionListener(this);
        jb16.addActionListener(this);
        newGame.addActionListener(this);



    }
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == newGame){


            Random random = new Random();

            setN1(random.nextInt(15) + 1);
            jb1.setText(String.valueOf(getN1()));


            setN2(random.nextInt(15) + 1);
            while(getN1() == getN2()) {
                setN2(random.nextInt(15) + 1);
            }
            jb2.setText(String.valueOf(getN2()));


            setN3(random.nextInt(15) + 1);
            while(getN1() == getN3() || getN2() == getN3()){
                setN3(random.nextInt(15) + 1);
            }
            jb3.setText(String.valueOf(getN3()));


            setN4(random.nextInt(15) + 1);
            while(getN1() == getN4() || getN2() == getN4() || getN3() == getN4()){
                setN4(random.nextInt(15) + 1);
            }
            jb4.setText(String.valueOf(getN4()));


            setN5(random.nextInt(15) + 1);
            while(getN1() == getN5() || getN2() == getN5() || getN3() == getN5() || getN4() == getN5()){
                setN5(random.nextInt(15) + 1);
            }
            jb5.setText(String.valueOf(getN5()));


            setN6(random.nextInt(15) + 1);
            while(getN1() == getN6() || getN2() == getN6() || getN3() == getN6() || getN4() == getN6() || getN5() == getN6()){
                setN6(random.nextInt(15) + 1);
            }
            jb6.setText(String.valueOf(getN6()));


            setN7(random.nextInt(15) + 1);
            while(getN1() == getN7() || getN2() == getN7() || getN3() == getN7() || getN4() == getN7() || getN5() == getN7() || getN6() == getN7()){
                setN7(random.nextInt(15) + 1);
            }
            jb7.setText(String.valueOf(getN7()));


            setN8(random.nextInt(15) + 1);
            while(getN1() == getN8() || getN2() == getN8() || getN3() == getN8() || getN4() == getN8() || getN5() == getN8() || getN6() == getN8() || getN7() == getN8()){
                setN8(random.nextInt(15) + 1);
            }
            jb8.setText(String.valueOf(getN8()));


            setN9(random.nextInt(15) + 1);
            while(getN1() == getN9() || getN2() == getN9() || getN3() == getN9() || getN4() == getN9() || getN5() == getN9() || getN6() == getN9() || getN7() == getN9() || getN8() == getN9()){
                setN9(random.nextInt(15) + 1);
            }
            jb9.setText(String.valueOf(getN9()));


            setN10(random.nextInt(15) + 1);
            while(getN1() == getN10() || getN2() == getN10() || getN3() == getN10() || getN4() == getN10() || getN5() == getN10() || getN6() == getN10() || getN7() == getN10() || getN8() == getN10() || getN9() == getN10()){
                setN10(random.nextInt(15) + 1);
            }
            jb10.setText(String.valueOf(getN10()));


            setN11(random.nextInt(15) + 1);
            while(getN1() == getN11() || getN2() == getN11() || getN3() == getN11() || getN4() == getN11() || getN5() == getN11() || getN6() == getN11() || getN7() == getN11() || getN8() == getN11() || getN9() == getN11() || getN10() == getN11()){
                setN11(random.nextInt(15) + 1);
            }
            jb11.setText(String.valueOf(getN11()));


            setN12(random.nextInt(15) + 1);
            while(getN1() == getN12() || getN2() == getN12() || getN3() == getN12() || getN4() == getN12() || getN5() == getN12() || getN6() == getN12() || getN7() == getN12() || getN8() == getN12() || getN9() == getN12() || getN10() == getN12() || getN11() == getN12()){
                setN12(random.nextInt(15) + 1);
            }
            jb12.setText(String.valueOf(getN12()));


            setN13(random.nextInt(15) + 1);
            while(getN1() == getN13() || getN2() == getN13() || getN3() == getN13() || getN4() == getN13() || getN5() == getN13() || getN6() == getN13() || getN7() == getN13() || getN8() == getN13() || getN9() == getN13() || getN10() == getN13() || getN11() == getN13() || getN12() == getN13()){
                setN13(random.nextInt(15) + 1);
            }
            jb13.setText(String.valueOf(getN13()));


            setN14(random.nextInt(15) + 1);
            while(getN1() == getN14() || getN2() == getN14() || getN3() == getN14() || getN4() == getN14() || getN5() == getN14() || getN6() == getN14() || getN7() == getN14() || getN8() == getN14() || getN9() == getN14() || getN10() == getN14() || getN11() == getN14() || getN12() == getN14() || getN13() == getN14()){
                setN14(random.nextInt(15) + 1);
            }
            jb14.setText(String.valueOf(getN14()));


            setN15(random.nextInt(15) + 1);
            while(getN1() == getN15() || getN2() == getN15() || getN3() == getN15() || getN4() == getN15() || getN5() == getN15() || getN6() == getN15() || getN7() == getN15() || getN8() == getN15() || getN9() == getN15() || getN10() == getN15() || getN11() == getN15() || getN12() == getN15() || getN13() == getN15() || getN14() == getN15()){
                setN15(random.nextInt(15) + 1);
            }
            jb15.setText(String.valueOf(getN15()));


            jb16.setText("");

        }


        if (e.getSource() == jb1) {
            String numberPressed = jb1.getText();
            if (jb2.getText().equals("")) {
                jb2.setText(numberPressed);
                jb1.setText("");
            }
            if (jb5.getText().equals("")) {
                jb5.setText(numberPressed);
                jb1.setText("");
            }
        }

        if (e.getSource() == jb2) {
            String numberPressed = jb2.getText();
            if (jb1.getText().equals("")) {
                jb1.setText(numberPressed);
                jb2.setText("");
            }
            if (jb3.getText().equals("")) {
                jb3.setText(numberPressed);
                jb2.setText("");
            }
            if (jb6.getText().equals("")) {
                jb6.setText(numberPressed);
                jb2.setText("");
            }
        }

        if (e.getSource() == jb3) {
            String numberPressed = jb3.getText();
            if (jb2.getText().equals("")) {
                jb2.setText(numberPressed);
                jb3.setText("");
            }
            if (jb4.getText().equals("")) {
                jb4.setText(numberPressed);
                jb3.setText("");
            }
            if (jb7.getText().equals("")) {
                jb7.setText(numberPressed);
                jb3.setText("");
            }
        }

        if (e.getSource() == jb4) {
            String numberPressed = jb4.getText();
            if (jb3.getText().equals("")) {
                jb3.setText(numberPressed);
                jb4.setText("");
            }
            if (jb8.getText().equals("")) {
                jb8.setText(numberPressed);
                jb4.setText("");
            }
        }

        if (e.getSource() == jb5) {
            String numberPressed = jb5.getText();
            if (jb1.getText().equals("")) {
                jb1.setText(numberPressed);
                jb5.setText("");
            }
            if (jb6.getText().equals("")) {
                jb6.setText(numberPressed);
                jb5.setText("");
            }
            if (jb9.getText().equals("")) {
                jb9.setText(numberPressed);
                jb5.setText("");
            }
        }

        if (e.getSource() == jb6) {
            String numberPressed = jb6.getText();
            if (jb2.getText().equals("")) {
                jb2.setText(numberPressed);
                jb6.setText("");
            }
            if (jb5.getText().equals("")) {
                jb5.setText(numberPressed);
                jb6.setText("");
            }
            if (jb7.getText().equals("")) {
                jb7.setText(numberPressed);
                jb6.setText("");
            }
            if (jb10.getText().equals("")) {
                jb10.setText(numberPressed);
                jb6.setText("");
            }
        }

        if (e.getSource() == jb7) {
            String numberPressed = jb7.getText();
            if (jb3.getText().equals("")) {
                jb3.setText(numberPressed);
                jb7.setText("");
            }
            if (jb6.getText().equals("")) {
                jb6.setText(numberPressed);
                jb7.setText("");
            }
            if (jb8.getText().equals("")) {
                jb8.setText(numberPressed);
                jb7.setText("");
            }
            if (jb11.getText().equals("")) {
                jb11.setText(numberPressed);
                jb7.setText("");
            }
        }

        if (e.getSource() == jb8) {
            String numberPressed = jb8.getText();
            if (jb4.getText().equals("")) {
                jb4.setText(numberPressed);
                jb8.setText("");
            }
            if (jb7.getText().equals("")) {
                jb7.setText(numberPressed);
                jb8.setText("");
            }
            if (jb12.getText().equals("")) {
                jb12.setText(numberPressed);
                jb8.setText("");
            }
        }

        if (e.getSource() == jb9) {
            String numberPressed = jb9.getText();
            if (jb5.getText().equals("")) {
                jb5.setText(numberPressed);
                jb9.setText("");
            }
            if (jb10.getText().equals("")) {
                jb10.setText(numberPressed);
                jb9.setText("");
            }
            if (jb13.getText().equals("")) {
                jb13.setText(numberPressed);
                jb9.setText("");
            }
        }

        if (e.getSource() == jb10) {
            String numberPressed = jb10.getText();
            if (jb6.getText().equals("")) {
                jb6.setText(numberPressed);
                jb10.setText("");
            }
            if (jb9.getText().equals("")) {
                jb9.setText(numberPressed);
                jb10.setText("");
            }
            if (jb11.getText().equals("")) {
                jb11.setText(numberPressed);
                jb10.setText("");
            }
            if (jb14.getText().equals("")) {
                jb14.setText(numberPressed);
                jb10.setText("");
            }
        }

        if (e.getSource() == jb11) {
            String numberPressed = jb11.getText();
            if (jb7.getText().equals("")) {
                jb7.setText(numberPressed);
                jb11.setText("");
            }
            if (jb10.getText().equals("")) {
                jb10.setText(numberPressed);
                jb11.setText("");
            }
            if (jb12.getText().equals("")) {
                jb12.setText(numberPressed);
                jb11.setText("");
            }
            if (jb15.getText().equals("")) {
                jb15.setText(numberPressed);
                jb11.setText("");
            }
        }

        if (e.getSource() == jb12) {
            String numberPressed = jb12.getText();
            if (jb8.getText().equals("")) {
                jb8.setText(numberPressed);
                jb12.setText("");
            }
            if (jb11.getText().equals("")) {
                jb11.setText(numberPressed);
                jb12.setText("");
            }
            if (jb16.getText().equals("")) {
                jb16.setText(numberPressed);
                jb12.setText("");
            }
        }

        if (e.getSource() == jb13) {
            String numberPressed = jb13.getText();
            if (jb9.getText().equals("")) {
                jb9.setText(numberPressed);
                jb13.setText("");
            }
            if (jb14.getText().equals("")) {
                jb14.setText(numberPressed);
                jb13.setText("");
            }
        }

        if (e.getSource() == jb14) {
            String numberPressed = jb14.getText();
            if (jb10.getText().equals("")) {
                jb10.setText(numberPressed);
                jb14.setText("");
            }
            if (jb13.getText().equals("")) {
                jb13.setText(numberPressed);
                jb14.setText("");
            }
            if (jb15.getText().equals("")) {
                jb15.setText(numberPressed);
                jb14.setText("");
            }
        }

        if (e.getSource() == jb15) {
            String numberPressed = jb15.getText();
            if (jb11.getText().equals("")) {
                jb11.setText(numberPressed);
                jb15.setText("");
            }
            if (jb14.getText().equals("")) {
                jb14.setText(numberPressed);
                jb15.setText("");
            }
            if (jb16.getText().equals("")) {
                jb16.setText(numberPressed);
                jb15.setText("");
            }
        }

        if (e.getSource() == jb16) {
            String numberPressed = jb16.getText();
            if (jb12.getText().equals("")) {
                jb12.setText(numberPressed);
                jb16.setText("");
            }
            if (jb15.getText().equals("")) {
                jb15.setText(numberPressed);
                jb16.setText("");
            }
        }


        if (jb1.getText().equals("1") && jb2.getText().equals("2") && jb3.getText()
                .equals("3") && jb4.getText().equals("4") && jb5.getText().equals("5")
                && jb6.getText().equals("6") && jb7.getText().equals("7") && jb8.getText()
                .equals("8") && jb9.getText().equals("9") && jb10.getText().equals("10") && jb11.getText().equals("11")
                && jb12.getText().equals("12") && jb13.getText().equals("13") && jb14.getText().equals("14")
                && jb15.getText().equals("15") && jb16.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Grattis, du vann!");

        }
    }

}

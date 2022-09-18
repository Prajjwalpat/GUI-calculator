package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
public class calculator implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JTextArea textarea=new JTextArea(2,10);
	
	JButton bt1=new JButton("1");
	JButton bt2=new JButton("2");
	JButton bt3=new JButton("3");
	JButton bt4=new JButton("4");
	JButton bt5=new JButton("5");
	JButton bt6=new JButton("6");
	JButton bt7=new JButton("7");
	JButton bt8=new JButton("8");
	JButton bt9=new JButton("9");
	JButton btadd=new JButton("+");
	JButton bt0=new JButton("0");
	
	JButton btsub=new JButton("-");
	JButton btmul=new JButton("*");
	JButton btdiv=new JButton("/");
	JButton btclear=new JButton("AC");
	JButton btdot=new JButton(".");
	JButton btequal=new JButton("=");
	
	double n1,n2,result=0;
	int addc=0,mulc=0,divc=0,subc=0,a;
	
	public calculator() {
		frame.setSize(350,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("best calculator of the year");
		frame.setResizable(true);
		frame.add(panel);
		panel.setBackground(Color.RED);
	//	Border border=BorderFactory.createLineBorder(Color.RED,4);
		panel.add(textarea);
		textarea.setBackground(Color.BLACK);
		Border tborder=BorderFactory.createLineBorder(Color.BLUE,2);
		textarea.setBorder(tborder);
		Font font=new Font("Gotham",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.RED);
		textarea.setPreferredSize(new Dimension(2,12));
		textarea.setLineWrap(true);
		
		bt1.setPreferredSize(new Dimension(100,40));
		//bt1.setIcon(new ImageIcon(""));
		bt2.setPreferredSize(new Dimension(100,40));
		bt3.setPreferredSize(new Dimension(100,40));
		bt4.setPreferredSize(new Dimension(100,40));
		bt5.setPreferredSize(new Dimension(100,40));
		bt6.setPreferredSize(new Dimension(100,40));
		bt7.setPreferredSize(new Dimension(100,40));
		bt8.setPreferredSize(new Dimension(100,40));
		bt9.setPreferredSize(new Dimension(100,40));
		bt0.setPreferredSize(new Dimension(100,40));
		btadd.setPreferredSize(new Dimension(100,40));
		btsub.setPreferredSize(new Dimension(100,40));
		btmul.setPreferredSize(new Dimension(100,40));
		btdiv.setPreferredSize(new Dimension(100,40));
		btdot.setPreferredSize(new Dimension(100,40));
		btequal.setPreferredSize(new Dimension(100,40));
		btclear.setPreferredSize(new Dimension(100,40));
		
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(bt5);
		panel.add(bt6);
		panel.add(bt7);
		panel.add(bt8);
		panel.add(bt9);
		panel.add(bt0);
		panel.add(btadd);
		
		panel.add(btsub);
		panel.add(btmul);
		panel.add(btdiv);
		
		panel.add(btdot);
		panel.add(btclear);
		panel.add(btequal);
		
		bt1.addActionListener((ActionListener) this);
		bt2.addActionListener((ActionListener) this);
		bt3.addActionListener((ActionListener) this);
		bt4.addActionListener((ActionListener) this);
		bt5.addActionListener((ActionListener) this);
		bt6.addActionListener((ActionListener) this);
		bt7.addActionListener((ActionListener) this);
		bt8.addActionListener((ActionListener) this);
		bt9.addActionListener((ActionListener) this);
		bt0.addActionListener((ActionListener) this);
		btadd.addActionListener((ActionListener) this);
		btsub.addActionListener((ActionListener) this);
		btmul.addActionListener((ActionListener) this);
		btdiv.addActionListener((ActionListener) this);
		btequal.addActionListener((ActionListener) this);
		btdot.addActionListener((ActionListener) this);
		btclear.addActionListener((ActionListener) this);
		
		
	}
	public calculator(int a) {
		this.a=a;
		System.out.println("passed parametric constructor"+this.a);
	}
	public void actionPerformed(ActionEvent e) {
		//Object source=new e.getSource();
		Object s = (Object) e.getSource();
		//n1=number_reader();
		if(s==btclear) {
			n1=0.0;
			n2=0.0;
			textarea.setText("");
		}
		if(s==bt1) {
			textarea.append("1");
		}
		if(s==bt2) {
			textarea.append("2");
		}
		if(s==bt3) {
			textarea.append("3");
		}
		if(s==bt4) {
			textarea.append("4");
		}
		if(s==bt5) {
			textarea.append("5");
		}
		if(s==bt6) {
			textarea.append("6");
		}
		if(s==bt7) {
			textarea.append("7");
		}
		if(s==bt8) {
			textarea.append("8");
		}
		if(s==bt9) {
			textarea.append("9");
		}
		if(s==bt0) {
			textarea.append("0");
		}
		if(s==btdot) {
			textarea.append(".");
		}
		if(s==btadd) {
			n1=number_reader();
			textarea.setText("+");
			addc=1;
			divc=0;
			subc=0;
			mulc=0;
		}
		else if(s==btsub) {
			n1=number_reader();
			textarea.setText("-");
			addc=0;
			divc=0;
			subc=1;
			mulc=0;
		}
		else if(s==btmul) {
			n1=number_reader();
			textarea.setText("*");
			addc=0;
			divc=0;
			subc=0;
			mulc=1;
		}
		else if(s==btdiv) {
			n1=number_reader();
			textarea.setText("/");
			addc=0;
			divc=1;
			subc=0;
			mulc=0;
		}
		if(s==btequal) {
			n2=number_reader();
			if(addc>0) {
				result=n1+n2;
				textarea.setText(Double.toString(result));
				//addc=0;
			}
			if(subc>0) {
				n2=
				result = n1+n2;
				textarea.setText(Double.toString(result));
			}
			if(mulc>0) {
				result = n1 * n2;
				textarea.setText(Double.toString(result));
			}
			if(divc>0) {
				result=n1/n2;
				textarea.setText(Double.toString(result));
			}
		}
	}	
	public double number_reader() {
		double num1;
		String s;
		s=textarea.getText();
		if(s.charAt(0)=='*' || s.charAt(0)=='/') {
			s=s.substring(1);
		}
		num1=Double.valueOf(s);
		return num1;
	}

}

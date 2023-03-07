package Laba2; //����� Java �������

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {

	private Object logo;
	private Image icon;

	
	public Image getIcon() {
		return this.icon;
	}
	
	public subversion getStudent () {
		return this.student;
	}

Poick poick = new Poick();
RandomArray array = new RandomArray();
Sort s = new Sort(array.getArray());

	JFrame main_GUI;
	JPanel main_panel;
	subversion student;
	JComboBox combo_student;




	
	public subversion() {
	final JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(600,600,600,500);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
	laba_info.setBounds(215,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(240,250,100,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("����������"); // ��������� ������
	button_info.setBounds(30,250,150,40);
	ActionListener info_listener = new ListenerOptionPane(); //������� ���������
	button_info.addActionListener(info_listener);
	main_panel.add(button_info);
	poick.setPoick("");
	final int n = JOptionPane.INFORMATION_MESSAGE;
	button_info.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { 
			main_GUI.setVisible(false);
			JOptionPane.showMessageDialog(main_GUI, "1. ������ �����������. ����� �������� ������ - 0207\n2. �������� ��������. ����� �������� ������ - 0003\n "  + poick.getPoick(),"������ � ����������", n);
			if(n == JOptionPane.INFORMATION_MESSAGE) {
				main_GUI.setVisible(true);
			}
		}
	});

	
	JMenu menu = new JMenu("�������"); // ��������� ���������� ����
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1 = new JMenuItem("���������� ������� �����"); // ��������� ������
	JMenuItem menu2 = new JMenuItem("�����"); // ��������� ������
	JMenuItem menu3 = new JMenuItem("��������� ���� � ������ 8");

	
	menu3.addActionListener(new ListenerButton() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			poick.setPoick("");
			JFileChooser fileopen = new JFileChooser();
			int ret = fileopen.showDialog(null, "������� ����");
			if (ret == JFileChooser.APPROVE_OPTION) {
				File file = fileopen.getSelectedFile();
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				String line;
				try {
					while((line = br.readLine()) != null){
						poick.setPoick(poick.getPoick() + line + "\n");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					br.close();
					fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	});
	
	
	JLabel triangle_side = new JLabel("������� ������� ������������"); // ����������� ������ ��� �����������
	triangle_side.setBounds(10,300,200,40);
	main_panel.add(triangle_side);
	
	final JTextField vvod = new JTextField();
	vvod.setBounds(10,330,100,40);
	main_panel.add(vvod);
	
	final JButton vivod = new JButton("���������"); // ��������� ������ ����������
	vivod.setBounds(130,330,150,40);
	
	ActionListener vivod_listener = new ListenerOptionPane(); //������� ���������
	vivod.addActionListener(vivod_listener); // ��������� ��������� � ������
	main_panel.add(vivod);
	
	vivod.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

	double st = Double.parseDouble(vvod.getText());
	double per = 3*st;
	String result = String.format("%.1f",per);
	
	JOptionPane.showMessageDialog(vivod, "�������� ��������������� ������������ ����������:  "+ result,"���������� ���������", -1);
	}
		   });
	

	final JLabel sortedMasLabel = new JLabel();
	sortedMasLabel.setBounds(10, 360, 500, 100);
	main_panel.add(sortedMasLabel);
	sortedMasLabel.setVisible(false);
	
	String massiv = "";
	for(int num : array.getArray()) massiv += String.valueOf(num) + " ";
	JLabel arrayLabel = new JLabel("������: " + massiv);
	arrayLabel.setBounds(10, 340, 500, 100);
	main_panel.add(arrayLabel);
	
	
	
	menu2.addActionListener(actionListener);
	ActionListener logo_image = new ListenerButton();
	
	menu.add(menu1);
	menu.add(menu2);
	menu.add(menu3);
	menuBar.add(menu);
	main_GUI.setJMenuBar(menuBar);
	
	icon = new Image(); // ��������� ������� 
	main_panel.add(icon);
	icon.setBounds(350,20, 250,150); // ����������� ��������� ��������
	icon.setVisible(false);
	
	
	
	ActionListener logo = new ListenerButton() {
		public void actionPerformed(ActionEvent e) {
			icon.setVisible(true);
		}
	};
	
	menu1.addActionListener(logo);
	
	String[] positions = { "����������� ������� ����� � ������� ������ ����", "����������� ������� ����� � ��������", "����������� ������� ����� � ����� ������� ����", "������������� ������ � ������� 8"};
	JComboBox menu4 = new JComboBox(positions); // ��������� ���������� ������ � ������� ������� ��������
	menu4.setBounds(120,200,350,30);
	

	
	menu4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			JComboBox menu4 = (JComboBox) e.getSource();
			String item = (String) menu4.getSelectedItem();
		
			if (item=="����������� ������� ����� � ������� ������ ����") {
				icon.setLocation(350, 20);
			}
			
			if (item=="����������� ������� ����� � ��������") {
				icon.setLocation(180, 20);
			}
			
			if (item=="����������� ������� ����� � ����� ������� ����") {
				icon.setLocation(10, 20);
			}
			if (item=="������������� ������ � ������� 8") {

				String massiv1 = "";
				for(int num : s.getSortedMas()) massiv1 += String.valueOf(num) + " ";
				sortedMasLabel.setText("������������� ������: " + massiv1);
				sortedMasLabel.setVisible(true);
			}
			}
		
	});
	
	
	
	menu4.setVisible(true);
	main_panel.add(menu4);	
	
	
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	
	}

}

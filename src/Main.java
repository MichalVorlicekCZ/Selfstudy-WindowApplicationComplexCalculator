import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class Main {

	public static int resultNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();

		JPanel panel1 = new JPanel();
		frame.add(panel1, BorderLayout.CENTER);

		JPanel panel2 = new JPanel();
		frame.add(panel2, BorderLayout.SOUTH);

		Color color = new Color(173, 216, 255);
		panel1.setBackground(color);
		panel2.setBackground(color);

		JLabel label1 = new JLabel(
				"<html>Do prvniho radku zadejte relanou a<br/>imaginarni cast prvniho komplexniho cisla.<br/>Do druheho radku zadejte realnou a<br/>imaginarni cast druheho komplexniho cisla.</html");
		panel1.add(label1);

		SpinnerModel value1 = new SpinnerNumberModel(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
		JSpinner spiner1 = new JSpinner(value1);
		panel1.add(spiner1);

		SpinnerModel value2 = new SpinnerNumberModel(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
		JSpinner spiner2 = new JSpinner(value2);
		panel1.add(spiner2);

		SpinnerModel value3 = new SpinnerNumberModel(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
		JSpinner spiner3 = new JSpinner(value3);
		panel1.add(spiner3);

		SpinnerModel value4 = new SpinnerNumberModel(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
		JSpinner spiner4 = new JSpinner(value4);
		panel1.add(spiner4);

		JButton butonSum = new JButton("Scitani");
		panel1.add(butonSum);

		JButton butonSub = new JButton("Odcitani");
		panel1.add(butonSub);

		JButton butonMult = new JButton("Nasobeni");
		panel1.add(butonMult);

		JButton butonDiv = new JButton("Deleni");
		panel1.add(butonDiv);

		JLabel label2 = new JLabel("Po zadani hodnot zmacknete danou matematickou operaci.");
		panel2.add(label2);

		frame.setTitle("Calculator - Complex Numeber");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(380, 250);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

		butonSum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent actEvent) {
				// TODO Auto-generated method stub

				int a1 = (int) spiner1.getValue();
				int b1 = (int) spiner2.getValue();
				int a2 = (int) spiner3.getValue();
				int b2 = (int) spiner4.getValue();

				int real = a1 + a2;
				int imaginary = b1 + b2;

				String complexN = "";

				if (real == 0 && imaginary == 0) {
					complexN = "0";
				} else if (real == 0 && imaginary < 0) {
					complexN = "- " + Math.abs(imaginary) + "i";
				} else if (real == 0 && imaginary > 0) {
					complexN = imaginary + "i";
				} else if ((real < 0 || real > 0) && imaginary == 0) {
					complexN = real + "";
				} else if ((real < 0 || real > 0) && imaginary < 0) {
					complexN = real + " - " + Math.abs(imaginary) + "i";
				} else {
					complexN = real + " + " + imaginary + "i";
				}

				resultNumber = resultNumber + 1;

				System.out.println(resultNumber + ". vysledek: " + complexN);
				label2.setText(String.valueOf("Vysledek: " + complexN));

			}
		});

		butonSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int a1 = (int) spiner1.getValue();
				int b1 = (int) spiner2.getValue();
				int a2 = (int) spiner3.getValue();
				int b2 = (int) spiner4.getValue();

				int real = a1 - a2;
				int imaginary = b1 - b2;

				String complexN = "";

				if (real == 0 && imaginary == 0) {
					complexN = "0";
				} else if (real == 0 && imaginary < 0) {
					complexN = "- " + Math.abs(imaginary) + "i";
				} else if (real == 0 && imaginary > 0) {
					complexN = imaginary + "i";
				} else if ((real < 0 || real > 0) && imaginary == 0) {
					complexN = real + "";
				} else if ((real < 0 || real > 0) && imaginary < 0) {
					complexN = real + " - " + Math.abs(imaginary) + "i";
				} else {
					complexN = real + " + " + imaginary + "i";
				}

				resultNumber = resultNumber + 1;

				System.out.println(resultNumber + ". vysledek: " + complexN);
				label2.setText(String.valueOf("Vysledek: " + complexN));

			}
		});

		butonMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int a1 = (int) spiner1.getValue();
				int b1 = (int) spiner2.getValue();
				int a2 = (int) spiner3.getValue();
				int b2 = (int) spiner4.getValue();

				int real = (a1 * a2 - b1 * b2);
				int imaginary = (a1 * b2 + a2 * b1);

				String complexN = "";

				if (real == 0 && imaginary == 0) {
					complexN = "0";
				} else if (real == 0 && imaginary < 0) {
					complexN = "- " + Math.abs(imaginary) + "i";
				} else if (real == 0 && imaginary > 0) {
					complexN = imaginary + "i";
				} else if ((real < 0 || real > 0) && imaginary == 0) {
					complexN = real + "";
				} else if ((real < 0 || real > 0) && imaginary < 0) {
					complexN = real + " - " + Math.abs(imaginary) + "i";
				} else {
					complexN = real + " + " + imaginary + "i";
				}

				resultNumber = resultNumber + 1;

				System.out.println(resultNumber + ". vysledek: " + complexN);
				label2.setText(String.valueOf("Vysledek: " + complexN));

			}
		});

		butonDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int a1 = (int) spiner1.getValue();
				int b1 = (int) spiner2.getValue();
				int a2 = (int) spiner3.getValue();
				int b2 = (int) spiner4.getValue();

				int denominatorReal = (a1 * a2) + (b1 * b2);
				int denominatorImaginary = (a1 * (-b2)) + (b1 * a2);
				double numerator = (a2 * a2) + (b2 * b2);

				double real = denominatorReal / numerator;
				double imaginary = denominatorImaginary / numerator;

				String complexN = "";

				if (real == 0 && imaginary == 0) {
					complexN = "0";
				} else if (real == 0 && imaginary < 0) {
					complexN = "- " + Math.abs(imaginary) + "i";
				} else if (real == 0 && imaginary > 0) {
					complexN = imaginary + "i";
				} else if ((real < 0 || real > 0) && imaginary == 0) {
					complexN = real + "";
				} else if ((real < 0 || real > 0) && imaginary < 0) {
					complexN = real + " - " + Math.abs(imaginary) + "i";
				} else {
					complexN = real + " + " + imaginary + "i";
				}

				resultNumber = resultNumber + 1;

				System.out.println(resultNumber + ". vysledek: " + complexN);
				label2.setText(String.valueOf("Vysledek: " + complexN));

			}
		});

	}

}

package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class ScreenObj extends JFrame {

	private static final long serialVersionUID = -8647386001813388856L;

	Boolean[] status = { false, false, false, false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false, false, false, false };

	private List<Integer> ToRemove = new ArrayList<>(); // Lista de numeros a serem removidos;

	public List<Integer> getRemoved() { // Retorna a lista de numeros a serem removidos;
		return ToRemove;

	}

	private boolean StatusCount(Boolean[] stts) { // Verifica se somente 7 numeros foram removidos;

		int count = 0;

		for (int i = 0; i < stts.length; i++) {

			if (stts[i] == true) {

				count++;

			}

		}

		if (count >= 7) {

			JOptionPane.showMessageDialog(null, "Somente 7 numeros podem ser excluidos!", "Limite",
					JOptionPane.ERROR_MESSAGE);

			return false;

		}

		else {

			return true;
		}

	}

	public JPanel CardNumber() { // Cria um "Cartão" onde o usuario escolhe os 7 numeros que serão removidos das
									// apostas;

		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel.setBorder(new TitledBorder("Exclua 7 números"));
		((TitledBorder) panel.getBorder()).setTitleJustification(TitledBorder.CENTER);
		panel.setBounds(31, 40, 265, 220);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JButton button = new JButton("01");
		button.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button.setFocusable(false);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[0] == false && StatusCount(status) == true) {

					status[0] = true;
					button.setBackground(Color.green);

				} else {

					status[0] = false;
					button.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button);

		JButton button_1 = new JButton("02");
		button_1.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_1.setFocusable(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[1] == false && StatusCount(status) == true) {

					status[1] = true;
					button_1.setBackground(Color.green);

				} else {

					status[1] = false;
					button_1.setBackground(new JButton().getBackground());

				}

			}

		});
		panel.add(button_1);

		JButton button_2 = new JButton("03");
		button_2.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_2.setFocusable(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[2] == false) {

					status[2] = true;
					button_2.setBackground(Color.green);

				} else {

					status[2] = false;
					button_2.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_2);

		JButton button_3 = new JButton("04");
		button_3.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_3.setFocusable(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[3] == false && StatusCount(status) == true) {

					status[3] = true;
					button_3.setBackground(Color.green);

				} else {

					status[3] = false;
					button_3.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_3);

		JButton button_4 = new JButton("05");
		button_4.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_4.setFocusable(false);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[4] == false && StatusCount(status) == true) {

					status[4] = true;
					button_4.setBackground(Color.green);

				} else {

					status[4] = false;
					button_4.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_4);

		JButton button_5 = new JButton("06");
		button_5.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_5.setFocusable(false);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[5] == false && StatusCount(status) == true) {

					status[5] = true;
					button_5.setBackground(Color.green);

				} else {

					status[5] = false;
					button_5.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_5);

		JButton button_6 = new JButton("07");
		button_6.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_6.setFocusable(false);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[6] == false && StatusCount(status) == true) {

					status[6] = true;
					button_6.setBackground(Color.green);

				} else {

					status[6] = false;
					button_6.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_6);

		JButton button_7 = new JButton("08");
		button_7.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_7.setFocusable(false);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[7] == false && StatusCount(status) == true) {

					status[7] = true;
					button_7.setBackground(Color.green);

				} else {

					status[7] = false;
					button_7.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_7);

		JButton button_8 = new JButton("09");
		button_8.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_8.setFocusable(false);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[8] == false && StatusCount(status) == true) {

					status[8] = true;
					button_8.setBackground(Color.green);

				} else {

					status[8] = false;
					button_8.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_8);

		JButton button_9 = new JButton("10");
		button_9.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_9.setFocusable(false);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[9] == false && StatusCount(status) == true) {

					status[9] = true;
					button_9.setBackground(Color.green);

				} else {

					status[9] = false;
					button_9.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_9);

		JButton button_10 = new JButton("11");
		button_10.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_10.setFocusable(false);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[10] == false && StatusCount(status) == true) {

					status[10] = true;
					button_10.setBackground(Color.green);

				} else {

					status[10] = false;
					button_10.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_10);

		JButton button_11 = new JButton("12");
		button_11.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_11.setFocusable(false);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[11] == false && StatusCount(status) == true) {

					status[11] = true;
					button_11.setBackground(Color.green);

				} else {

					status[11] = false;
					button_11.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_11);

		JButton button_12 = new JButton("13");
		button_12.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_12.setFocusable(false);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[12] == false && StatusCount(status) == true) {

					status[12] = true;
					button_12.setBackground(Color.green);

				} else {

					status[12] = false;
					button_12.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_12);

		JButton button_13 = new JButton("14");
		button_13.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_13.setFocusable(false);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[13] == false && StatusCount(status) == true) {

					status[13] = true;
					button_13.setBackground(Color.green);

				} else {

					status[13] = false;
					button_13.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_13);

		JButton button_14 = new JButton("15");
		button_14.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_14.setFocusable(false);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[14] == false && StatusCount(status) == true) {

					status[14] = true;
					button_14.setBackground(Color.green);

				} else {

					status[14] = false;
					button_14.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_14);

		JButton button_15 = new JButton("16");
		button_15.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_15.setFocusable(false);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[15] == false && StatusCount(status) == true) {

					status[15] = true;
					button_15.setBackground(Color.green);

				} else {

					status[15] = false;
					button_15.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_15);

		JButton button_16 = new JButton("17");
		button_16.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_16.setFocusable(false);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[16] == false && StatusCount(status) == true) {

					status[16] = true;
					button_16.setBackground(Color.green);

				} else {

					status[16] = false;
					button_16.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_16);

		JButton button_17 = new JButton("18");
		button_17.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_17.setFocusable(false);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[17] == false && StatusCount(status) == true) {

					status[17] = true;
					button_17.setBackground(Color.green);

				} else {

					status[17] = false;
					button_17.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_17);

		JButton button_18 = new JButton("19");
		button_18.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_18.setFocusable(false);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[18] == false && StatusCount(status) == true) {

					status[18] = true;
					button_18.setBackground(Color.green);

				} else {

					status[18] = false;
					button_18.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_18);

		JButton button_19 = new JButton("20");
		button_19.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_19.setFocusable(false);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[19] == false && StatusCount(status) == true) {

					status[19] = true;
					button_19.setBackground(Color.green);

				} else {

					status[19] = false;
					button_19.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_19);

		JButton button_20 = new JButton("21");
		button_20.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_20.setFocusable(false);
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[20] == false && StatusCount(status) == true) {

					status[20] = true;
					button_20.setBackground(SystemColor.green);

				} else {

					status[20] = false;
					button_20.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_20);

		JButton button_21 = new JButton("22");
		button_21.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_21.setFocusable(false);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[21] == false && StatusCount(status) == true) {

					status[21] = true;
					button_21.setBackground(Color.green);

				} else {

					status[21] = false;
					button_21.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_21);

		JButton button_22 = new JButton("23");
		button_22.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_22.setFocusable(false);
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[22] == false && StatusCount(status) == true) {

					status[22] = true;
					button_22.setBackground(Color.green);

				} else {

					status[22] = false;
					button_22.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_22);

		JButton button_23 = new JButton("24");
		button_23.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_23.setFocusable(false);
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[23] == false && StatusCount(status) == true) {

					status[23] = true;
					button_23.setBackground(Color.green);

				} else {

					status[23] = false;
					button_23.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_23);

		JButton button_24 = new JButton("25");
		button_24.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		button_24.setFocusable(false);
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (status[24] == false && StatusCount(status) == true) {

					status[24] = true;
					button_24.setBackground(Color.green);

				} else {

					status[24] = false;
					button_24.setBackground(new JButton().getBackground());

				}

			}
		});
		panel.add(button_24);

		JButton Excluir = new JButton("Excluir"); // Botão que adiciona os numeros selecionados à lista de excluidos -
													// "ToRemove"
		Excluir.setFocusable(false);
		Excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ToRemove.clear();

				for (int i = 0; i < status.length; i++) {

					if (status[i] == true) {

						ToRemove.add(i + 1);

					}
				}

			}
		});
		Excluir.setBounds(61, 195, 59, 23);
		panel.add(Excluir);

		JButton Reset = new JButton("Reset"); // Botão para limpar todos as variavies e iniciar um nova seleção "limpa";
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Boolean[] statusClear = { false, false, false, false, false, false, false, false, false, false, false,
						false, false, false, false, false, false, false, false, false, false, false, false, false,
						false };

				ToRemove.clear();

				status = statusClear;

				button.setBackground(new JButton().getBackground());
				button_1.setBackground(new JButton().getBackground());
				button_2.setBackground(new JButton().getBackground());
				button_3.setBackground(new JButton().getBackground());
				button_4.setBackground(new JButton().getBackground());
				button_5.setBackground(new JButton().getBackground());
				button_6.setBackground(new JButton().getBackground());
				button_7.setBackground(new JButton().getBackground());
				button_8.setBackground(new JButton().getBackground());
				button_9.setBackground(new JButton().getBackground());
				button_10.setBackground(new JButton().getBackground());
				button_11.setBackground(new JButton().getBackground());
				button_12.setBackground(new JButton().getBackground());
				button_13.setBackground(new JButton().getBackground());
				button_14.setBackground(new JButton().getBackground());
				button_15.setBackground(new JButton().getBackground());
				button_16.setBackground(new JButton().getBackground());
				button_17.setBackground(new JButton().getBackground());
				button_18.setBackground(new JButton().getBackground());
				button_19.setBackground(new JButton().getBackground());
				button_20.setBackground(new JButton().getBackground());
				button_21.setBackground(new JButton().getBackground());
				button_22.setBackground(new JButton().getBackground());
				button_23.setBackground(new JButton().getBackground());
				button_24.setBackground(new JButton().getBackground());

			}
		});
		Reset.setFocusable(false);
		Reset.setBounds(140, 195, 59, 23);
		panel.add(Reset);

		return panel;

	}

	public JPanel Results(List<Integer> aposta, int bet) { // Metodo que retorna o cartão com os numeros de cada aposta;

		JPanel ResultPanel = new JPanel();
		ResultPanel.setBackground(Color.white);
		ResultPanel.setBounds(31, 85, 100, 120);
		ResultPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JButton button = new JButton("01");
		button.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(1))
			button.setBackground(Color.green);
		button.setFocusable(false);
		ResultPanel.add(button);

		JButton button_1 = new JButton("02");
		button_1.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(2))
			button_1.setBackground(Color.green);
		button_1.setFocusable(false);
		ResultPanel.add(button_1);

		JButton button_2 = new JButton("03");
		button_2.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(3))
			button_2.setBackground(Color.green);
		button_2.setFocusable(false);
		ResultPanel.add(button_2);

		JButton button_3 = new JButton("04");
		button_3.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(4))
			button_3.setBackground(Color.green);
		button_3.setFocusable(false);
		ResultPanel.add(button_3);

		JButton button_4 = new JButton("05");
		button_4.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(5))
			button_4.setBackground(Color.green);
		button_4.setFocusable(false);
		ResultPanel.add(button_4);

		JButton button_5 = new JButton("06");
		button_5.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(6))
			button_5.setBackground(Color.green);
		button_5.setFocusable(false);
		ResultPanel.add(button_5);

		JButton button_6 = new JButton("07");
		button_6.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(7))
			button_6.setBackground(Color.green);
		button_6.setFocusable(false);
		ResultPanel.add(button_6);

		JButton button_7 = new JButton("08");
		button_7.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(8))
			button_7.setBackground(Color.green);
		button_7.setFocusable(false);
		ResultPanel.add(button_7);

		JButton button_8 = new JButton("09");
		button_8.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(9))
			button_8.setBackground(Color.green);
		button_8.setFocusable(false);
		ResultPanel.add(button_8);

		JButton button_9 = new JButton("10");
		button_9.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(10))
			button_9.setBackground(Color.green);
		button_9.setFocusable(false);
		ResultPanel.add(button_9);

		JButton button_10 = new JButton("11");
		button_10.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(11))
			button_10.setBackground(Color.green);
		button_10.setFocusable(false);
		ResultPanel.add(button_10);

		JButton button_11 = new JButton("12");
		button_11.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(12))
			button_11.setBackground(Color.green);
		button_11.setFocusable(false);
		ResultPanel.add(button_11);

		JButton button_12 = new JButton("13");
		button_12.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(13))
			button_12.setBackground(Color.green);
		button_12.setFocusable(false);
		ResultPanel.add(button_12);

		JButton button_13 = new JButton("14");
		button_13.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(14))
			button_13.setBackground(Color.green);
		button_13.setFocusable(false);
		ResultPanel.add(button_13);

		JButton button_14 = new JButton("15");
		button_14.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(15))
			button_14.setBackground(Color.green);
		button_14.setFocusable(false);
		ResultPanel.add(button_14);

		JButton button_15 = new JButton("16");
		button_15.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(16))
			button_15.setBackground(Color.green);
		button_15.setFocusable(false);
		ResultPanel.add(button_15);

		JButton button_16 = new JButton("17");
		button_16.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(17))
			button_16.setBackground(Color.green);
		button_16.setFocusable(false);
		ResultPanel.add(button_16);

		JButton button_17 = new JButton("18");
		button_17.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(18))
			button_17.setBackground(Color.green);
		button_17.setFocusable(false);
		ResultPanel.add(button_17);

		JButton button_18 = new JButton("19");
		button_18.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(19))
			button_18.setBackground(Color.green);
		button_18.setFocusable(false);
		ResultPanel.add(button_18);

		JButton button_19 = new JButton("20");
		button_19.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(20))
			button_19.setBackground(Color.green);
		button_19.setFocusable(false);
		ResultPanel.add(button_19);

		JButton button_20 = new JButton("21");
		button_20.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(21))
			button_20.setBackground(Color.green);
		button_20.setFocusable(false);
		ResultPanel.add(button_20);

		JButton button_21 = new JButton("22");
		button_21.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(22))
			button_21.setBackground(Color.green);
		button_21.setFocusable(false);
		ResultPanel.add(button_21);

		JButton button_22 = new JButton("23");
		button_22.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(23))
			button_22.setBackground(Color.green);
		button_22.setFocusable(false);
		ResultPanel.add(button_22);

		JButton button_23 = new JButton("24");
		button_23.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(24))
			button_23.setBackground(Color.green);
		button_23.setFocusable(false);
		ResultPanel.add(button_23);

		JButton button_24 = new JButton("25");
		button_24.setFont(new Font("Dubai Medium", Font.PLAIN, 10));
		if (aposta.contains(25))
			button_24.setBackground(Color.green);
		button_24.setFocusable(false);
		ResultPanel.add(button_24);
		
		JLabel text = new JLabel("Cartão " + bet);
		text.setBounds(138, 383, 48, 14);
		ResultPanel.add(text);
		
		
		return ResultPanel;

	}

	
}
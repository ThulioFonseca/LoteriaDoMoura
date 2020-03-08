package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

import model.Number;

public class MainScreen {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainScreen() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("A Grande Loteria do Moura Maravilhosa de Bunita e rica de raio Laser");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ScreenObj card = new ScreenObj();
		// JPanel auxPanel = card.CardNumber();
		// auxPanel.setBounds(50, 50, 300, 300);
		frame.getContentPane().add(card.CardNumber());
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(50, 2));
		scrollPane.setBorder(new TitledBorder(null, "Combina\u00E7\u00F5es Poss\u00EDveis", TitledBorder.CENTER,
				TitledBorder.TOP, null, null));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(325, 40, 400, 430);
		frame.getContentPane().add(scrollPane);

		JPanel panel = new JPanel();
		panel.setLocation(new Point(0, 5));
		panel.setAlignmentY(Component.CENTER_ALIGNMENT);
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.setMinimumSize(new Dimension(3500, 100));
		panel.setPreferredSize(new Dimension(3400, 300));
		panel.setBounds(new Rectangle(0, 10, 3500, 200));
		panel.setBackground(SystemColor.controlHighlight);
		panel.setLayout(new GridLayout(2, 12, 5, 5));

		JButton btnGerar = new JButton("Gerar");
		btnGerar.setFocusable(false);
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panel.removeAll();

				Number n = new Number();

				List<List<Integer>> aposta = new ArrayList<>();

				for (int i = 0; i < 24; i++) {

					aposta.add(n.getBet(card.getRemoved()));
					panel.add(card.Results(aposta.get(i), i + 1));

				}

				scrollPane.setViewportView(panel);

			}

		});

		btnGerar.setBounds(116, 262, 89, 23);
		frame.getContentPane().add(btnGerar);

		JTextArea txtrRascunho = new JTextArea();
		txtrRascunho.setText("Rascunho");
		txtrRascunho.setBounds(38, 301, 259, 169);
		frame.getContentPane().add(txtrRascunho);

	}
}
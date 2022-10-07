package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;

	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelAgregarPeliculas panel = new PanelAgregarPeliculas();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPeliculas.add(mntmListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

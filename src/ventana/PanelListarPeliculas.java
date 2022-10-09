package ventana;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PanelListarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JList<Peliculas> jList;
	private DefaultListModel<Peliculas> listModel;
	

	/**
	 * Create the panel.
	 */
	public void dibujarControles() {
		
		Font fuenteComun = new Font("Tahoma", Font.PLAIN, 22);
			
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 0, 0, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 30, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblListado = new JLabel("Peliculas disponibles");
		lblListado.setFont(fuenteComun);
		GridBagConstraints gbc_lblListado = new GridBagConstraints();
		gbc_lblListado.anchor = GridBagConstraints.WEST;
		gbc_lblListado.insets = new Insets(0, 0, 5, 5);
		gbc_lblListado.gridx = 1;
		gbc_lblListado.gridy = 1;
		add(lblListado, gbc_lblListado);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);
		
		jList = new JList<Peliculas>();
		jList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (jList.getSelectedIndex() != -1) {
					listModel.remove(jList.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Se eleimino la Pelicula Seleccionada");
				}
			}
		});
		listModel = new DefaultListModel<Peliculas>();
		jList.setModel(Principal.listModel);
		jList.setFont(new Font("Tahoma", Font.PLAIN, 22));
		scrollPane.setViewportView(jList);
	}
	
	public PanelListarPeliculas() {
		dibujarControles();
	}
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.listModel = listModelRecibido;
	}

}

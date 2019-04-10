/**
 * 
 */
package edu.lev.ymf.slam4.swing;

import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import edu.lev.ymf.slam4.bo.Personne;
import edu.lev.ymf.slam4.dao.PersonneDAO;

/**
 * @author ymf
 *
 */
public class PersonnesModelJtable extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7584867789143192692L;

	SimpleDateFormat pourConvertir = new SimpleDateFormat("yyyy-MM-dd");
	
	String[] columns = new String[] { "Nom", "Prenom", "Date Naissance", "Adresse" };

	Object[][] data = new Object[][] { 
		{ 1, "FONTENOY", "Yann", "2018-10-01", "5 rue Elie Vinet - 16300 - Barbezieux" },
		{ 1, "FONTENOY", "Yann2", "2018-10-01", "5 rue Elie Vinet - 16300 - Barbezieux" }
	};
	
	Vector<Personne> datasS = null;
	
	public PersonnesModelJtable() {
		PersonneDAO monPDao = new PersonneDAO();
		datasS = monPDao.search();
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		
		// V1 return data.length;
		
		return datasS.size();
		
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		
		return columns.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		// V1 return data[rowIndex][columnIndex +1];
		
		switch (columnIndex) {
		case 0:
			return datasS.elementAt(rowIndex).getNom();
		case 1:
			return datasS.elementAt(rowIndex).getPrenom();
		case 2:
			return datasS.elementAt(rowIndex).getNaissance();
		case 3:
			return datasS.elementAt(rowIndex).getAdresse().toString();
		default:
			return "err";
		}
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
	 */
	@Override
	public String getColumnName(int column) {
		
		return columns[column];
	}

}

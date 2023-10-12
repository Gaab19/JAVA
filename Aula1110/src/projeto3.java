import javax.swing.JOptionPane;

public class projeto3 {

	public static void main(String[] args) {
		String y;
		y = JOptionPane.showInputDialog("Digite um Numero: ");
		
		int x;
		x = Integer.parseInt(y);
		
		switch (x) {
		case 0:
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
		case 1:
		    JOptionPane.showMessageDialog(null, "Terça");
		    break;
		case 2:
		JOptionPane.showMessageDialog(null, "Quarta");
		    break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Sexta");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sabado");
		case 6: 
			JOptionPane.showMessageDialog(null, "Domingo");
			break;

		default:
			break;
		}
		

	}

}

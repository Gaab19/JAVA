import javax.swing.JOptionPane;

public class projeto2 {

	public static void main(String[] args) {
		String y;
		y = JOptionPane.showInputDialog("Digite um n�mero: ");
		int x;
		x = Integer.parseInt(y);

		switch (x) {
		case 0:

			JOptionPane.showInputDialog("Digite um n�mero: ");
			JOptionPane.showMessageDialog(null, "X � 0");
			break;
		case 1:
			JOptionPane.showInputDialog("Digite um n�mero: ");
			JOptionPane.showMessageDialog(null, "X � 1");
			break;

		default:
			JOptionPane.showInputDialog("Digite um n�mero: ");
			JOptionPane.showMessageDialog(null, "X tem um valor diferente de 0 e 1");
			break;
		}

	}

}

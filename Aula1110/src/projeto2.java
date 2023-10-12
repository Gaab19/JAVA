import javax.swing.JOptionPane;

public class projeto2 {

	public static void main(String[] args) {
		String y;
		y = JOptionPane.showInputDialog("Digite um número: ");
		int x;
		x = Integer.parseInt(y);

		switch (x) {
		case 0:

			JOptionPane.showInputDialog("Digite um número: ");
			JOptionPane.showMessageDialog(null, "X é 0");
			break;
		case 1:
			JOptionPane.showInputDialog("Digite um número: ");
			JOptionPane.showMessageDialog(null, "X é 1");
			break;

		default:
			JOptionPane.showInputDialog("Digite um número: ");
			JOptionPane.showMessageDialog(null, "X tem um valor diferente de 0 e 1");
			break;
		}

	}

}

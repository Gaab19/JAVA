import javax.swing.JOptionPane;

public class Adivinhacao2 {

	public static void main(String[] args) {
		String y;
        y = JOptionPane.showInputDialog("Advinhacao, Digite o Valor Correto Entre 1 e 5: ");
		
		int x;
		x = Integer.parseInt(y);
		
		switch (x) {
		case 1:
			JOptionPane.showMessageDialog(null, "Errado");
			break;
		case 2:
		    JOptionPane.showMessageDialog(null, "Acertou, A Mizeraavi !!");
		    break;
		case 3:
		JOptionPane.showMessageDialog(null, "Errado");
		    break;
		case 4:
			JOptionPane.showMessageDialog(null, "Errado");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Errado");
		default:
			JOptionPane.showMessageDialog(null, "É so de 1 a 5 ANALFABETO !!!!");
			break;
			

	}

   }
}

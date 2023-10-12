import javax.swing.JOptionPane;

public class projeto4 {

	public static void main(String[] args) {
		
		String y;
		y = JOptionPane.showInputDialog("Digite um Numero de 1 a 12");
		
		int x;
		x = Integer.parseInt(y);
		
		switch (x) {
		case 1:
			JOptionPane.showMessageDialog(null, "Janeiro");
			break;
		case 2:
		    JOptionPane.showMessageDialog(null, "Fevereiro ");
		    break;
		case 3:
		JOptionPane.showMessageDialog(null, "Março");
		    break;
		case 4:
			JOptionPane.showMessageDialog(null, "Abril");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Maio");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Junho");
		case 7: 
			JOptionPane.showMessageDialog(null, "Julho");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Agosto");
            break;
		case 9:
			JOptionPane.showMessageDialog(null, "Setembro");
			break;
		case 10: 
			JOptionPane.showMessageDialog(null, "Outubro");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "Novembro");
			break;
		case 12: 
			JOptionPane.showMessageDialog(null, "Dezembro");
		default:
			JOptionPane.showMessageDialog(null, "Chegamos ao Final !!");
			break;
		}
		

	}

}



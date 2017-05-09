import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {

		String month = JOptionPane.showInputDialog("What month were you born");

		if (month.equalsIgnoreCase("january")) {

			JOptionPane.showMessageDialog(null, "You are a pics, and you're weird");
		}

		else if (month.equalsIgnoreCase("february")) {

			JOptionPane.showMessageDialog(null, "You are an Aqarius, and you're weird");
		}

		else if (month.equalsIgnoreCase("march")) {

			JOptionPane.showMessageDialog(null, "You are an Aries, and you're weird");
		}

		else if (month.equalsIgnoreCase("april")) {

			JOptionPane.showMessageDialog(null, "You are an Taurus, and you're weird");
		} else if (month.equalsIgnoreCase("May")) {

			JOptionPane.showMessageDialog(null, "You are an Gemini, and you're weird");
		} else if (month.equalsIgnoreCase("june")) {

			JOptionPane.showMessageDialog(null, "You are a cancer, and you're weird");
		} else if (month.equalsIgnoreCase("july")) {

			JOptionPane.showMessageDialog(null, "You are a Leo, and you're weird");
		} else if (month.equalsIgnoreCase("august")) {

			JOptionPane.showMessageDialog(null, "You are a Virgo, and you're weird");
		}

		else if (month.equalsIgnoreCase("september")) {

			JOptionPane.showMessageDialog(null, "You are a Libra, and you're weird");
		}

		else if (month.equalsIgnoreCase("October")) {

			JOptionPane.showMessageDialog(null, "You are a Scorpio, and you're weird");
		}

		else if (month.equalsIgnoreCase("November")) {

			JOptionPane.showMessageDialog(null, "You are a saggitarius, and you're weird");
		}

	}

}

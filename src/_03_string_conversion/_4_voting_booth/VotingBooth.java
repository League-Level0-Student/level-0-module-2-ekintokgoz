package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("To vote, how old are you?");
	int ageAsInt = Integer.parseInt(age);
	if(ageAsInt>=18) {
		JOptionPane.showInputDialog("You are old enough to vote! Who should be the next president?");} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}

}
}

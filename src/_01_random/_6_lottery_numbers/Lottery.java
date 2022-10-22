package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		Random numbers = new Random();
		String output = "";
		for (int i = 0; i<6; i++) {
			int lottery = numbers.nextInt(100); 
			output = output + lottery + " ";
		}
		JOptionPane.showMessageDialog(null, output);
	}
}
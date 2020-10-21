package hw.l03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class red_packet {
	public static void main(String[] args) {
		boolean nextRound = true;
		
		Scanner input = new Scanner(System.in);

		while (nextRound) {
			// Prompt the user to enter total money and packet count
			System.out.print("�������ܽ��: ");
			double money = 0;
			try {
				money = Double.parseDouble(input.nextLine());
				money = Math.floor(money * 100) / 100;
			} catch (Exception e) {
				System.out.println("����ֵ�������������롣");
				continue;
			}
			
			if (money < 0) {
				// Input error
				System.out.println("����ֵ���󣨲���Ϊ��ֵ�������������롣");
				continue;
			}

			System.out.print("����������: ");
			int count = 0;
			try {
				count = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("����ֵ�������������롣");
				continue;
			}
			
			if (count < 0) {
				// Input error
				System.out.println("����ֵ���󣨲���Ϊ��ֵ�������������롣");
				continue;
			}
			
			int remain_count = count;
			double remain_money = money;
			double get_money = 0;

			while(remain_count > 0) {
				if(remain_count == 1){
					get_money = remain_money;
					get_money = (double)Math.round(get_money * 100) / 100;
				} else {
					Random r = new Random();
					double max = remain_money / remain_count * 2;
					get_money = r.nextDouble() * max;
					get_money = get_money <= 0.01 ? 0.01 : get_money;
					get_money = (double)Math.floor(get_money * 100) / 100;
				}
				System.out.println("�����˺��" + get_money + "Ԫ");
				remain_money -= get_money;
				remain_count --;
			}

			boolean retype = true;
			while (retype) {
				System.out.print("�Ƿ������������Y��N��");
				try {
					String answer = input.nextLine();
					if (answer.toLowerCase().equals("y")){
						break;
					} else if (answer.toLowerCase().equals("n")){
						nextRound = false;
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("����ֵ�������������롣");
					continue;
				}
			}
		}
		
		System.out.println("ллʹ�ã�");
		input.close();
	}
}

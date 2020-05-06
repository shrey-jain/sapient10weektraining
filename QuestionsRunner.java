package practice;

import java.util.ArrayList;
import java.util.Scanner;

class deamonThread implements Runnable {
	private boolean exit;

	public void run() {
		try {
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stop() {
		exit = true;
	}
}

class Task implements Runnable {
	private boolean exit;

	public void run() {
		ArrayList<Questions> bank = new ArrayList<>();
		bank.add(new Questions("who is president of india", "Donald Trump", "Ramnath Kovind", "Narendra Modi", "None",
				"b"));
		bank.add(new Questions("In which year sikkim became part of India", "1972", "1975", "1977", "1980", "b"));
		bank.add(new Questions("The UPSC of India has been established under the article?", "122", "178", "273", "315",
				"d"));
		bank.add(new Questions("The National Human Rights Commision is formed in the year", "1990", "1993", "1995",
				"1997", "b"));
		bank.add(new Questions("The National Human Roghts Commision is a", "Autonomous public body",
				"Constitutional Body", "Extra Contitutional Body", "None", "a"));
		bank.add(new Questions("Who was the first Comptroller and Auditor General of India", "Ak Chandra ", "Ak Roy",
				"S Raganathan", "V Narahari Rao", "d"));
		bank.add(new Questions("Maximum no of Public Account Committe can be", "10", "12", "22", "25", "c"));
		bank.add(new Questions("Which one of the 28th state of India", "Uttarakhand ", "Goa", "Jharkhand",
				"Chhattisgarh", "c"));
		bank.add(new Questions("A money bill in the parliament can be introduced with the recommmendation of ",
				"Prime Minister", "President", "Speaker of Lok Sabha", "Finance Minister", "b"));
		bank.add(new Questions("State of emergency in India was declared in the year", "1972", "1975", "1977", "1973",
				"b"));
		Scanner s = new Scanner(System.in);
		while (!exit) {
			for (int i = 0; i < 10; i++) {
				Thread d = new Thread(new deamonThread());
				d.setDaemon(true);
				d.start();

				System.out.println((i + 1) + " " + bank.get(i).getQuestion());
				System.out.println("a. " + bank.get(i).getOpt1());
				System.out.println("b. " + bank.get(i).getOpt2());
				System.out.println("c. " + bank.get(i).getOpt3());
				System.out.println("d. " + bank.get(i).getOpt4());
				System.out.println("Choose the Correct option");

				String ans = s.nextLine();
				if (d.isAlive()) {
					d.stop();
					if (ans.equals(bank.get(i).getCorrectOpt()))
						System.out.println("yes u r right");
					else
						System.out.println("Sorry Wrong answer");
				} else {
					System.out.println("TimeOut!!!!!!!!!");
					exit = true;
					break;
				}

			}
		}
	}

	public void stop() {
		exit = true;
	}
}

public class QuestionsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Task());
		t.start();
		// deamonThread d = new deamonThread();
		// d.setDaemon(true);
		// d.start();
	}

}

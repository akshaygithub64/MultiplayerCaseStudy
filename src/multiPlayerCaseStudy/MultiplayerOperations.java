package multiPlayerCaseStudy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MultiplayerOperations {

//	creating the array list for storing the object
	static ArrayList songList = new ArrayList();

	// create object for Scanner class to get input from the user
	static Scanner scanner = new Scanner(System.in);

	// creating object for updating the properties
//	static Song song = new Song();
	private static int choose;

	public void menuList() {

//		this method is used for menu showing 

		boolean menu1 = true; // use to control the while loop

		while (menu1) {
			System.out.println("MENU \n\t1. Play Song \n\t2. Add/Remove Song \n\t3. Update Song \n\t4. Exit");

			int a = scanner.nextInt(); // get the integer input from the user

//			switch case is used to perform the above operation simultaneously
			switch (a) {
			case 1:
				System.out.println("playing song in order ");
				playSongs();
				break;

			case 2:
				System.out.println("2 add / remove songs");
				addRemoveSong();
				break;

			case 3:
				System.out.println("3 update songs");
				updateSongs();
				break;

			case 4:
				System.out.println("4 Exit");
				menu1 = false;
				break;

			default:
				System.out.println("Give some valid input");
				break;
			}
		}
	}

//	crating the method for the 1  play song
	public static void playSongs() {

		boolean playsong = true;

		while (playsong) {
			System.out.println(
					"\nPlaySong MENU \n\t1. Play All Songs \n\t2. Choose Song \n\t3. Play Random Song \n\t4. Go Back");

			int a = scanner.nextInt();

			switch (a) {
			case 1:
				System.out.println("Playing all songs in sequence");
				displaySongs();
				break;

			case 2:
				System.out.println("Choose song form list");
				displaySongs();
				chooseSong();
				break;

			case 3:
				System.out.println("Play random");
				playRandom();
				break;

			case 4:
				System.out.println("Go Back");
				playsong = false;
				break;

			default:
				System.out.println("give some valid input");
				break;
			}
		}
	}

//	creating the method for the add / remove songs
	public static void addRemoveSong() {

		boolean addremove = true;

		while (addremove) {
			System.out.println("\nAdd/Remove Songs MENU \n\t1. Add Song \n\t2. Remove Song \n\t3. Go Back");

			int a = scanner.nextInt();

			switch (a) {
			case 1:
				System.out.println("Adding the songs");
				addSongs();
				displaySongs();
				break;

			case 2:
				System.out.println("which song Remove from list");
				displaySongs();
				removeSong();
				break;

			case 3:
				System.out.println("Go Back");
				addremove = false;
				break;

			default:
				System.out.println("give some valid input");
				break;
			}
		}
	}

//	creating the method for update songs
	public static void updateSongs() {

		boolean update = true;

		while (update) {
			System.out.println(
					"\nUpdateSong MENU \n\t1. Name \n\t2. Singer \n\t3. Movie/Album \n\t4. Duration \n\t5. Go Back");

			int a = scanner.nextInt();

			switch (a) {
			case 1:
				System.out.println("Name update");

				System.out.println("Enter song no. want to choose for update");
				choose = scanner.nextInt();

				for (int i = 0; i <= choose; i++) {
					if (i == choose) {
						System.out.println("Enter the new name");
						String n = scanner.next();
						((Song) songList.get(i - 1)).setName(n);
					}
					System.out.println(songList.get(i - 1));
				}

				break;

			case 2:
				System.out.println("singer updating");

				System.out.println("Enter song no. want to choose for update");
				choose = scanner.nextInt();

				for (int i = 0; i <= choose; i++) {
					if (i == choose) {
						System.out.println("Enter the new name");
						String n = scanner.next();
						((Song) songList.get(i - 1)).setSinger(n);
					}
					System.out.println(songList.get(i - 1));
				}
				break;

			case 3:
				System.out.println("change movie/album");

				System.out.println("Enter song no. want to choose for update");
				choose = scanner.nextInt();

				for (int i = 0; i <= choose; i++) {
					if (i == choose) {
						System.out.println("Enter the new name");
						String n = scanner.next();
						((Song) songList.get(i - 1)).setMovie(n);
					}
					System.out.println(songList.get(i - 1));
				}
				break;

			case 4:
				System.out.println("Duration Change");

				System.out.println("Enter song no. want to choose for update");
				choose = scanner.nextInt();

				for (int i = 0; i <= choose; i++) {
					if (i == choose) {
						System.out.println("Enter the new name");
						double n = scanner.nextDouble();
						((Song) songList.get(i - 1)).setDuration(n);
					}
					System.out.println(songList.get(i - 1));
				}

				break;

			case 5:
				System.out.println("Go Back");
				update = false;
				break;

			default:
				System.out.println("give some valid input");
				break;
			}
		}
	}

//	this is method is created for displaying the all songs 
//	here we need to  create the array 

	public static void displaySongs() {
		for (int i = 0; i < songList.size(); i++) {
			System.out.println("Song" + (i + 1) + songList.get(i));
		}
	}

//	add songs to array list
	public static void addSongs() {
		System.out.println("how many songs do u want to add");
		int a = scanner.nextInt();
		for (int i = 1; i <= a; i++) {

			System.out.println("Enter the id of song");
			int id = scanner.nextInt();

			System.out.println("Enter the song name");
			String name = scanner.next();

			System.out.println("Enter the song duration");
			double duration = scanner.nextDouble();

			System.out.println("Enter the song movie");
			String movie = scanner.next();

			System.out.println("Enter the song singer");
			String singer = scanner.next();

			Song song1 = new Song();
			song1.setId(id);
			song1.setName(name);
			song1.setDuration(duration);
			song1.setMovie(movie);
			song1.setSinger(singer);

			// crating object for the song class and store all songs in that
//			Song song1 = new Song(id, name, duration, movie, singer);
//			Song song2 = new Song(101, "Malang", 3, "abc1", "xyz1");

			// add object into the array list
			songList.add(song1);
//			songList.add(song2);
		}
	}

//	remove song from the list 
	public static void removeSong() {
		System.out.println("Enter song no. to remove");
		int a = scanner.nextInt();
		for (int i = 0; i < songList.size(); i++) {
			if (i == a - 1) {
				songList.remove(i);
			}
		}

	}

	// creating the method for choose the song from song list to play
	public static void chooseSong() {
		System.out.println("Enter song no. want to choose for play");
		choose = scanner.nextInt();
		for (int i = 0; i < songList.size(); i++) {
			if (i == choose - 1) {
				System.out.println(songList.get(i));
			}
		}
		System.out.println("Playing the song which you want to play ");
	}

//	playing random song from the play list
	public static void playRandom() {
		Random random = new Random();
		int a = 0;

		for (int i = 0; i < songList.size(); i++) {
			a = random.nextInt(songList.size());
		}
		System.out.println(songList.get(a));

	}

}

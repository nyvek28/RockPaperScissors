package com.development.test;
import com.development.rockpaperscissors.Interface;
import com.development.rockpaperscissors.Match;
import com.development.rockpaperscissors.RPSList;
import com.development.rockpaperscissors.Tournament;

//import com.development.rockpaperscissors;

public class Tester {

	public static void main(String[] args) {
		
		String[][][] t = {
				{{"David","p"},{"Armando","r"}},
				{{"Orlando","s"},{"Mateo","r"}},
				{{"Diego","s"},{"Julia","r"}},
				{{"Julian","s"},{"Karla","p"}},
				{{"Amanda","p"},{"Andres","r"}},
				{{"Pablo","s"},{"Santino","r"}},
				{{"Ernesto","p"},{"Matilde","s"}},
				{{"Jim","R"},{"Nick","P"}}
				};
		
		String[][] g = {{"David","p"},{"John","s"}};
		
		Interface i = new Interface();
		System.out.println(i.playMatch(g));
		System.out.println(i.playTournament(t)[0]);
		
	}

}

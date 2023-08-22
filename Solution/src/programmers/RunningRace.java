package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
		 String[] answer = {};
		 
		 List<String> players_list = new ArrayList<>(Arrays.asList(players));
		 
		 changeRank(callings, players_list);
		 
		 return players_list.toArray(answer);
		 
	 }
	 
	 private static void changeRank(String[] callings, List<String> players_list) {
		 for(int i=0;i<callings.length;i++) {
			 int rank = players_list.indexOf(callings[i]);
			 
             players_list.remove(rank);
			 players_list.add(rank-1,callings[i]);
		 }
	 }
}

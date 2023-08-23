package programmers.level_1;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
		 String[] answer = new String[players.length];
	        
		 Map<String, Integer> byRunner = new HashMap<>();
		 Map<Integer, String> byRank= new HashMap<>();
		 
		 for(int i=0;i<players.length;i++) {
			 byRunner.put(players[i], i);
			 byRank.put(i, players[i]);
		 }
		 
		 for(int i=0;i<callings.length;i++) {
			 int currentRank = byRunner.get(callings[i]);
			 String runner = byRank.get(currentRank);
			 
			 String frontRunner = byRank.get(currentRank-1);
			 
			 //RankMap에서 바꾸기
			 byRank.replace(currentRank-1, runner);
			 byRank.replace(currentRank, frontRunner);
			 
			 //RunnerMap에서 바꾸기
			 byRunner.replace(frontRunner, currentRank);
			 byRunner.replace(runner, currentRank-1);
		 }
		 
		 for(int i=0;i<players.length;i++) {
			 answer[i] = byRank.get(i);
		 }
		 
		 return answer;
	 }
}

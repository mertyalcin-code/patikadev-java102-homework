
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FixtureGenerator {

    public List<List<Match>> getFixtures(List<String> teams) {
        int numberOfTeams = teams.size();
        if (numberOfTeams % 2 != 0) {
            numberOfTeams++;
            teams.add("Bay"); // if odd number of team exist we add ghost team
        }
        Collections.shuffle(teams); //randomize the index

        int totalRounds = numberOfTeams - 1;
        int matchesPerRound = numberOfTeams / 2;
        List<List<Match>> rounds = new LinkedList<>();
        for (int round = 0; round < totalRounds; round++) {
            List<Match> matches = new LinkedList<>();
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (numberOfTeams - 1);                      //0 1 2 - 1 2 3 - 2 3 4 - 3 4 0 - 4 0 1
                int away = (numberOfTeams - 1 - match + round) % (numberOfTeams - 1); // 5 4 3 - 5 0 4 - 5 1 0 - 5 2 1 - 5 3 2
                // Last teams stay in the last position others shifting
                if (match == 0) {
                    away = numberOfTeams - 1;
                }
                matches.add(new Match(teams.get(home), teams.get(away)));
            }
            rounds.add(matches);
        }

        // Last team can't be away for every game so flip them
        // to home on odd rounds.
        for (int roundNumber = 0; roundNumber < rounds.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Match match = rounds.get(roundNumber).get(0); // last team always in the first game
                rounds.get(roundNumber).set(0, new Match(match.getAwayTeam(), match.getHomeTeam())); // flip it
            }
        }
        // second half of the season
        List<List<Match>> reverseFixtures = new LinkedList<>();
        for(List<Match> round: rounds){
            List<Match> reverseRound = new LinkedList<>();
            for(Match match : round){
                reverseRound.add(new Match(match.getAwayTeam(), match.getHomeTeam())); // flip it
            }
            reverseFixtures.add(reverseRound);
        }
        rounds.addAll(reverseFixtures);
        return rounds;
    }

    public void print(List<List<Match>> all) {
        int count=1;
        for(List<Match> round: all){
            System.out.println("----"+count+". Round -----");
            count++;
            for(Match match:round){
                System.out.println(match.getHomeTeam()+"-"+match.getAwayTeam());
            }

        }
    }
}
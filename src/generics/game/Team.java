package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participantList.add(participant);
        System.out.println(participant.getName() + " was added to team " + name);
    }

    public void playWith(Team<T> team) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winner = this.name;
        }
        else {
            winner = team.name;
        }
        System.out.println("Winners: " + winner);
    }
}

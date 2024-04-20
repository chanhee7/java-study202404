package day08.enum_.quiz1;

import static day08.enum_.quiz1.TeamRole.*;

// Main class: 팀원 생성과 작업 할당을 시뮬레이션
public class Main {

    public static void main(String[] args) {
        TeamMember alice = new TeamMember("Alice", DEVELOPER);
        TeamMember bob = new TeamMember("Bob", DESIGNER);
        TeamMember charlie = new TeamMember("Charlie", LEADER);
        TeamMember david = new TeamMember("David", TESTER);

        alice.assignTask(); // Alice is assigned to Develops the software.
        bob.assignTask();   // Bob is assigned to Designs the user interface.
        charlie.assignTask(); // Charlie is assigned to Manages the team and coordinates.
        david.assignTask();  // David is assigned to Tests the software for bugs.
    }
}

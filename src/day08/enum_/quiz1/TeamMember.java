package day08.enum_.quiz1;

// TeamMember class: 팀원의 이름과 역할을 관리
public class TeamMember {
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        // 이하를 작성하세요
        System.out.printf("%s is assigned to %s\n", this.name, this.role.getDescription());
    }

}
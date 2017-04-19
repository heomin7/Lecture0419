package salary.module;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Salary {
    //yearID,teamID,lgID,playerID,salary
    private String yearId;
    private String teamId;
    private String lgId;
    private String playerId;
    private long salary;

    public Salary() {
    }

    public Salary(String yearId, String teamId, String lgId, String playerId, long salary) {
        this.yearId = yearId;
        this.teamId = teamId;
        this.lgId = lgId;
        this.playerId = playerId;
        this.salary = salary;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getLgId() {
        return lgId;
    }

    public void setLgId(String lgId) {
        this.lgId = lgId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "yearId='" + yearId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", lgId='" + lgId + '\'' +
                ", playerId='" + playerId + '\'' +
                ", salary=" + salary +
                '}';
    }
}

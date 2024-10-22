import java.util.ArrayList;
import java.util.List;

class Project {
    private String projectId;
    private String projectName;
    private List<Employee> participantEmployees;

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.participantEmployees = new ArrayList<>();
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void addParticipant(Employee employee) {
        participantEmployees.add(employee);
    }

    public List<Employee> getParticipants() {
        return participantEmployees;
    }
}
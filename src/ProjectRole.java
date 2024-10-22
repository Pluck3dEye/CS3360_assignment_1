import java.util.List;

class ProjectRole {
    private String name;
    private String projectId;
    private List<Permission> permissions;

    public ProjectRole(String name, String projectId, List<Permission> permissions) {
        this.name = name;
        this.projectId = projectId;
        this.permissions = permissions;
    }

    public String getProjectId() {
        return projectId;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }
}

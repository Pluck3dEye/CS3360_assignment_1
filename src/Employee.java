import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    private String name;
    private DepartmentRole departmentRole;
    private Map<String, ProjectRole> projectRoles;

    public Employee(String name) {
        this.name = name;
        this.projectRoles = new HashMap<>();
    }

    public void setDepartmentRole(DepartmentRole departmentRole) {
        this.departmentRole = departmentRole;
    }

    public void addProjectRole(ProjectRole projectRole) {
        this.projectRoles.put(projectRole.getProjectId(), projectRole);
    }

    public String getName() {
        return name;
    }

    public List<Permission> getPermissionsForProject(String projectId) {
        ProjectRole projectRole = projectRoles.get(projectId);
        return projectRole != null ? projectRole.getPermissions() : new ArrayList<>();
    }

    public void executePermission(String projectId, Permission permission, String item) {
        List<Permission> permissions = getPermissionsForProject(projectId);
        if (permissions.contains(permission)) {
            permission.execute(item);
        } else {
            System.out.println(name + " does not have permission to " + permission.name().toLowerCase() + " " + item + " in project " + projectId + ".");
        }
    }
}

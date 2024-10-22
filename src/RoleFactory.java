import java.util.Arrays;

class RoleFactory {
    public static DepartmentRole createDepartmentRole(String roleName, String departmentName) {
        switch (roleName) {
            case "Head":
                return new DepartmentRole("Head", departmentName, Arrays.asList(Permission.ADD, Permission.EDIT, Permission.DELETE, Permission.VIEW));
            case "Intern":
                return new DepartmentRole("Intern", departmentName, Arrays.asList(Permission.VIEW));
            default:
                return new DepartmentRole("Regular", departmentName, Arrays.asList(Permission.VIEW));
        }
    }

    public static ProjectRole createProjectRole(String roleName, String projectId) {
        switch (roleName) {
            case "Leader":
                return new ProjectRole("Leader", projectId, Arrays.asList(Permission.ADD, Permission.EDIT, Permission.DELETE, Permission.VIEW));
            case "Inspector":
                return new ProjectRole("Inspector", projectId, Arrays.asList(Permission.VIEW));
            default:
                return new ProjectRole("Contributor", projectId, Arrays.asList(Permission.VIEW, Permission.EDIT));
        }
    }
}

// Maybe we can use interface or abstract here but i'm lazy

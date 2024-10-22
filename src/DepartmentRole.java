import java.util.List;

class DepartmentRole {
    private String name;
    private String departmentName;
    private List<Permission> permissions;

    public DepartmentRole(String name, String departmentName, List<Permission> permissions) {
        this.name = name;
        this.departmentName = departmentName;
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

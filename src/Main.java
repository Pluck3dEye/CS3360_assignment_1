
public class Main {
    public static void main(String[] args) {
        // Create departments
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");

        // Create employees
        Employee employee1 = new Employee("Teo");
        Employee employee2 = new Employee("Chim");

        // Add employees to departments
        itDepartment.addEmployee(employee1);
        hrDepartment.addEmployee(employee2);

        // Assign department roles with department context
        employee1.setDepartmentRole(RoleFactory.createDepartmentRole("Head", itDepartment.getName()));
        employee2.setDepartmentRole(RoleFactory.createDepartmentRole("Intern", hrDepartment.getName()));

        // Create projects
        Project project1 = new Project("project_1", "Save The World");
        Project project2 = new Project("project_2", "I dont want to work in this company");

        // Add Teo, Chim -> project_1 | Add Chim -> project_2
        project1.addParticipant(employee1);
        project1.addParticipant(employee2);

        project2.addParticipant(employee2);

        // Teo is Leader of project_1, Chim is contributor of project_1
        employee1.addProjectRole(RoleFactory.createProjectRole("Leader", "project_1"));
        employee2.addProjectRole(RoleFactory.createProjectRole("Contributor", "project_1"));

        // Chim is contributor of project_2
        employee2.addProjectRole(RoleFactory.createProjectRole("Inspector", "project_2"));


        // Display employees in each department
        System.out.println("Employees in " + itDepartment.getName() + " Department:");
        for (Employee emp : itDepartment.getEmployees()) {
            System.out.println(emp.getName());
        }

        System.out.println("Employees in " + hrDepartment.getName() + " Department:");
        for (Employee emp : hrDepartment.getEmployees()) {
            System.out.println(emp.getName());
        }

        System.out.print("\n\n");


        // Display participants in each project
        System.out.println("Participants in " + project1.getProjectName() + ":");
        for (Employee participant : project1.getParticipants()) {
            System.out.println(participant.getName());
        }

        System.out.println("Participants in " + project2.getProjectName() + ":");
        for (Employee participant : project2.getParticipants()) {
            System.out.println(participant.getName());
        }


        System.out.print("\n\n");

        // Check permission

        // Execute permissions for project_1
        System.out.println(employee1.getName() + " permissions for project_1:");
        employee1.executePermission("project_1", Permission.VIEW, "Document A");
        employee1.executePermission("project_1", Permission.ADD, "Document B");
        employee1.executePermission("project_1", Permission.EDIT, "Document A");
        employee1.executePermission("project_1", Permission.DELETE, "Document B");

        System.out.print("\n\n");


        System.out.println(employee2.getName() + " permissions for project_1:");
        employee2.executePermission("project_1", Permission.VIEW, "Document C");
        employee2.executePermission("project_1", Permission.ADD, "Document D");
        employee2.executePermission("project_1", Permission.EDIT, "Document A");
        employee2.executePermission("project_1", Permission.DELETE, "Document B");

        System.out.print("\n\n");


        // Execute permissions for project_2
        System.out.println(employee2.getName() + " permissions for project_2:");
        employee2.executePermission("project_2", Permission.VIEW, "Document E");
        employee2.executePermission("project_2", Permission.ADD, "Document F"); // F
        employee2.executePermission("project_2", Permission.EDIT, "Document A");
        employee2.executePermission("project_2", Permission.DELETE, "Document G"); // F

    }
}
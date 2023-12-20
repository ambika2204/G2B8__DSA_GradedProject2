import com.greatlearning.GLTech.AdminDepartment;
import com.greatlearning.GLTech.HrDepartment;
import com.greatlearning.GLTech.TechDepartment;

public class Main {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        adminDepartment.getAdminDeptFunctionalities();
        System.out.println("-----------------------------------------------------------------");
        hrDepartment.getHrDeptFunctionalities();
        System.out.println("-----------------------------------------------------------------");
        techDepartment.getTechDeptFunctionalities();
    }
}

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roshan
 */
@ManagedBean
@ApplicationScoped
public class Service {
    
    private static final List<Student> studentList;
    
    static {
        studentList=new ArrayList<>();
    }
    
    public void add(Student student){
        studentList.add(student);
    }
    
    public Student getStudent(int id){
        return studentList.get(id);
    }
    
    public List<Student> getStudentList(){
        return studentList;
    }
    
    public void updateStudent(Student student){
       
    }
    
    public void delete(Student student){
        studentList.remove(student);
    }
}

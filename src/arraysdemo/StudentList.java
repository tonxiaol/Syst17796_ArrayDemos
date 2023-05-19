
package arraysdemo;

public class StudentList {
    public static void main(String[] args){
        Student s1 = new Student("s1", "ronak");
        
        Student[] studentList = new Student[4];
        studentList[0] = s1;
        studentList[1] = new Student("s2", "abc");
        studentList[2] = new Student("s3", "def");
        studentList[3] = new Student("s4", "ghi");
        
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getsName());
        }
        
    }//end of main
    
}//end of class

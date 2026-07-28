public class StudentMarks {
    public static void main(String[] args) {
        String studentName = "Saisri Gandla";
        int javaMarks = 85;
        int sqlMarks= 90;
        int htmlMarks=88;
        int cssMarks=82;
        String result= "PASS";
        int total=javaMarks+sqlMarks+htmlMarks+cssMarks;
        float average=(total/4f);
        float percentage=((total/400f)*100);
        System.out.println("========== STUDENT MARKS ==========");
        System.out.println("Student Name : "+ studentName);
        System.out.println("Java Marks   : "+javaMarks);
        System.out.println("SQL Marks    : "+sqlMarks);
        System.out.println("HTML Marks   : "+htmlMarks);
        System.out.println("CSS Marks    : "+cssMarks);
        System.out.println();
        System.out.println("Total        :"+ total);
        System.out.println("Average      :"+ average);
        System.out.println("Percentage   :"+ percentage+"%");
        System.out.println();
        System.out.println("Result       :" + result);
        System.out.println("===================================");
    }
}

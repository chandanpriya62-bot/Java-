class Basics{
  public static void main(String[] args){
    int m1 = 80;
    int m2 = 99;
    int m3 = 97;
    int attendance= 80;
    int total = m1+m2+m3;
    double avg = total/3;
    double per = (total / 300.0)*100 ;

    char grade;
    if(avg >=90){
      grade = 'A';
    }else if (avg>=75){
      grade = 'B';
    }else if(avg>=60){
      grade = 'C';
    }else if(avg>=40){
      grade = 'D';
    }else{
      grade='F';
    }
    
   


    System.out.println("Student: "+ "Chandana");
    System.out.println("Total: "+total);
    System.out.println("Average: "+avg);
    System.out.println("Percentage: "+per+"%");
    System.out.println("Grade: "+grade);
     if (m1>=40 && m2>=40 && m3>=40) {
      System.out.println("Result: Pass");
    }else{
      System.out.println("Result: Fail");
    }

    if(avg >= 85 && attendance >= 75){
      System.out.print("Scholarship: Eligible");
    }else{
      System.out.print("Scholarship: Not Eligible");
    }


  }
}




public class ArrayOperations {
 public static void main(String[] args) {

    String[] employees = {"ghouse", "mohamed ghouse", "mohamed"};
    int[] scores = {85, 92, 78};

    String[] copyEmp = new String[employees.length];
    int[] copyScore = new int[scores.length];
    System.arraycopy(employees, 0, copyEmp, 0, employees.length);
    System.arraycopy(scores, 0, copyScore, 0, scores.length);

    System.out.println("Copied Data:");
    for (int i = 0; i < copyEmp.length; i++) {
        System.out.println(copyEmp[i] + ": " + copyScore[i]);
    }
          String[] employees1 = {"ghouse", "mohamed ghouse", "mohamed"};
                int[] scores1 = {85, 92, 78};
                  
                String[] merageEmp = new String[employees1.length + copyEmp.length];
                int[] merageScore = new int[scores1.length + copyScore.length];
               int  k=0;
               for (int i = 0; i < employees1.length; i++) {
                   merageEmp[k] = employees1[i];
                   merageScore[k] = scores1[i];
                   k++;
               }
               for (int i = 0; i < copyEmp.length; i++) {
                   merageEmp[k] = copyEmp[i];
                   merageScore[k] = copyScore[i];
                   k++;
               }
                System.out.println("Merged Data:");
                for (int i = 0; i < merageEmp.length; i++) {
                    System.out.println(merageEmp[i] + ": " + merageScore[i]);

}
          

  String[] employees2 = {"ghouse", "mohamed", "mohamed ghouse", "ghouse mohamed"};
int[] scores2 = {85, 92, 78, 95};

for (int i = 0; i < scores2.length - 1; i++) {

    for (int j = 0; j < scores2.length - 1 - i; j++) {

        if (scores2[j] < scores2[j + 1]) {

            int tempScore = scores2[j];
            scores2[j] = scores2[j + 1];
            scores2[j + 1] = tempScore;

            String tempName = employees2[j];
            employees2[j] = employees2[j + 1];
            employees2[j + 1] = tempName;
        }
    }
}

System.out.println("Descending Order:");

for (int i = 0; i < scores2.length; i++) {
    System.out.println(employees2[i] + " : " + scores2[i]);

}       
      String[] employees3= {"ghouse", "mohamed", "mohamed ghouse", "ghouse mohamed"};
int[] scores3= {85, 92, 78, 95};

for (int i = 0; i < scores3.length - 1; i++) {

    for (int j = 0; j < scores3.length - 1 - i; j++) {

        if (scores3[j] > scores3[j + 1]) {

            int tempScore = scores3[j];
            scores3[j] = scores3[j + 1];
            scores3[j + 1] = tempScore;

            String tempName = employees3[j];
            employees3[j] = employees3[j + 1];
            employees3[j + 1] = tempName;
        }
    }
}

System.out.println("Ascending Order:");

for (int i = 0; i < scores3.length; i++) {
    System.out.println(employees3[i] + " : " + scores3[i]);
}


    
}
}
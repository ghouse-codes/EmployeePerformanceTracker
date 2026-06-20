public class main {
    public static void main (String[] args) {
      String[] empolyees ={"ghouse", "mohamed","moahmed ghouse","ghouse mohamed"};
      int [] scores = { 85, 92, 78, 95, 88};
     for(int i = 0 ;i < empolyees.length;i++){
      System.out.println( empolyees[i] +":"+ scores[i] );
    }
        int sum =0;
        for ( int scor:scores){
        sum+=scor;
}
        double averagecount = sum/scores.length;

    System.out.println ("total of sum:"+sum);
    System.out.println ("total of average:"+averagecount); 

    String topempolyee = empolyees[0];
     int max =scores[0];
     for(int i=0;i<scores.length;i++){
     if(scores[i]>max){ 
        max=scores[i];
    topempolyee = empolyees[i];
    }
}
System.out.println("topempolyees:"+ topempolyee );
System.out.println("topscores:"+max);


String lowempolyee = empolyees[0];
     int min =scores[0];
     for(int i=0;i<scores.length;i++){
     if(scores[i]<min){ 
        min=scores[i];
    lowempolyee = empolyees[i];
     }
    }
System.out.println("lowempolyee:"+ lowempolyee );
System.out.println("lowscore:"+min);
 
String search ="ghouse";
boolean found =false;
for(int i=0 ; i<empolyees.length;i++){
 if (empolyees[i].equals(search)){
 
    System.out.println("element is found");   
    System.out.println("name:" +empolyees[i]);
    System.out.println("score:"+scores[i]);
   
    found = true;
    break;
 }     
}
if(!found) {
    System.out.println("elements is not found");
}

System.out.println("/n reverse ranking");
for (int i=empolyees.length-1; i >=-0;i--){

System.out.println(empolyees[i]+":" + scores[i]);
}
    int excellent=0;
    int good=0;
    int average =0;
      
    for(int score:scores){
        if(score>=90){
            excellent++;
        } else if (score>=80){
                   good++;

        } else average++;            
         } 
         System.out.println("exceellent empolyees:"+excellent );  
        System.out.println("good empolyees:"+good ); 
         System.out.println("average empolyees:"+average); 
       
            int highest =scores [0];
            int secondHighest = scores [0];
            for(int score:scores){
                if(score >highest){
                    secondHighest=highest;
                    highest=score; 
                }else if (score>secondHighest && score!=highest){

                             secondHighest=score;
                }    
                }
                 System.out.println("Highest Score: " + highest); 
                    System.out.println("Second Highest Score: " + secondHighest); 

                int lowest =scores [0];
            int secondlowest = scores [0];
            for(int score:scores){
                if(score >lowest){
                    secondlowest=lowest;
                    lowest=score; 
                }else if (score>secondlowest && score!=lowest){

                             secondlowest=score;
                }    
                }
                 System.out.println("lowest Score: " + lowest); 
                    System.out.println("Second lowest Score: " + secondlowest); 
        }
    }
    




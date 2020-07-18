package com.company;

public class SimpleReflexAgent extends environment {
    private int score;

   // environment environment=new environment();
   public int  suck()
   {
       System.out.println("intially['A':0 ,'B':0 ]");
       if(getLocation()==0 && getCondition()==1)
       {
           System.out.println("Location is A and room is dirty");
           score+=1;
           System.out.println("room is clean and score : " + score);

       }
       else
       {
           moveRight();
       }
      if(getLocation()==1 && getCondition()==1)
      {
          System.out.println("Location is B and room is dirty");
          score+=1;
          System.out.println("room is clean and score: " +score);
      }


 return  score;

   }
 public void moveRight()
 {
     System.out.println("vacume cleaner is moved to right");
     score-=1;
     if(getCondition()==1)
     {
         System.out.println("location B is dirty");
         score+=1;
     }
     else
     {
         System.out.println("Location B is already clean");
     }
 }
 public void moveLeft()
 {
     System.out.println("vacume cleaner is moved to left");
     score-=1;
     if(getCondition()==1)
     {
         System.out.println("location B is dirty");
         score+=1;
     }
     else
     {
         System.out.println("Location A is already clean");
     }
 }


//    @Override
//    public String getLocation() {
//        return super.getLocation();
//    }

    @Override
    public int getCondition() {
        return super.getCondition();
    }
}

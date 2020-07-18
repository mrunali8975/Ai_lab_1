package com.company;

public class environment extends
Locations
{
    public environment() {

    }

    public int getLocation()
{
    int ch=(int)(Math.random()*2)+0;

    return ch;
}
public int getCondition()
{
    int ch=(int)(Math.random()*2)+0;
//    if(ch==0 && getLocation()==0)
//    {
//        System.out.println("Location A is clean");
//    }
//    else if(ch==1 && getLocation()==0)
//    {
//        System.out.println("Location A is  Dirty");
//    }
//    else
//    {
//        if(ch==1)
//        System.out.println("Location B is dirty ");
//        else
//        {
//            System.out.println("Location B is clean");
//        }
//    }
    return  ch;
}


}

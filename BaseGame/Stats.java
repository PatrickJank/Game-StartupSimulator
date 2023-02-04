package BaseGame;

import Projects.ProjectGenerator;

public class Stats {
    /*
     here are all stats for our player.
     This includes starting stats, but also stuff that changes as the user plays

     i'm not sure if this will ever be used.
    */
    ProjectGenerator projectGenerator = new ProjectGenerator();
    //starting value. Workers are paid weekly so every 7 days, cash is depleted by a specific value.
    public int cash = 1000;
    public int currentWorkers;

    public int daysWasted = 0;
    public void statInfo() {
        projectGenerator.ProjectInfo();
        System.out.println(cash);
        System.out.println(currentWorkers);
    }


}

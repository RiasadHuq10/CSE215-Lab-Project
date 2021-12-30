public class testmethods
{
    public static void test()
    {
        MainMethod.teams.add(new Team("Real Madrid")); //Adds Real Madrid

        MainMethod.teams.add(new Team("Barcelona")); //Adds Barcelona

        int index = MainMethod.searchTeam("Real Madrid"); //index = index of Real Madrid

        int index2 = MainMethod.searchTeam("Barcelona"); //index2 = index of Barcelona

        System.out.println(MainMethod.teams.get(index).getInfo()); // prints info of (index) Real Madrid

        MainMethod.teams.get(index).addGoalkeeper(new Goalkeeper("Courtois",1,2,3,4)); //Adds GK to (index) Real Madrid

        MainMethod.teams.get(index).addDefender(new Defender("Militao",4,3,2,1)); // Adds Def to (index) Real Madrid

        MainMethod.teams.get(index2).addMidfielder(new Midfielder("Xavi",5,6,7,8)); //Adds Mid to (index2) Barcelona

        MainMethod.teams.get(index2).addForward(new Forward("Messi",8,7,6,5)); // Adds FW to (index) Barcelona

        System.out.println(MainMethod.teams.get(index2).getPlayerInfo("Messi")); //Gets info of a (index2) Barcelona Player

        System.out.println(MainMethod.teams.get(index2).getPlayerInfo("Xavi")); //Gets info of a (index2) Barcelona Player

        System.out.println(MainMethod.teams.get(index).getPlayerInfo("Courtois")); //Gets info of a (index) Real Madrid Player

        System.out.println(MainMethod.teams.get(index).getPlayerInfo("Militao")); //Gets info of a (index) Real Madrid Player

        System.out.println(MainMethod.teams.get(index).getPlayerInfo("Haaland")); // Gets info of a player that is not in (index) Real Madrid

        System.out.println(MainMethod.teams.get(index2).removePlayer("Xavi")); //Removes (index2) Barcelona Player

        System.out.println(MainMethod.teams.get(index2).removePlayer("Haaland"));  //Tries to remove a player not in (index2) Barcelona Player

        System.out.println(MainMethod.teams.get(index2).getPlayerInfo("Xavi")); // Gets info of a player that is not in (index2) Barcelona

        MainMethod.teams.remove(index); // Removes Real Madrid

        index = MainMethod.searchTeam("Barcelona"); // index = index of Barcelona

        System.out.println(MainMethod.teams.get(index).getInfo()) ;// Gets info of (index) Barcelona
    }
}

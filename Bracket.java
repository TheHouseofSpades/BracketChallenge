import java.lang.*;
import java.util.*;
import java.io.*;
public class Bracket{
  
 Team teams[] = new Team[16];
 
 
 public void Bracket() throws IOException{
   Scanner fileReader =  new Scanner(new File("east.txt"));
   fileReader.nextLine();
   for(int i=0;i<16;i++){
    int rank = fileReader.nextInt();
    String teamName = fileReader.next();
    int wins = fileReader.nextInt();
    int losses = fileReader.nextInt();
    double pyth = fileReader.nextDouble();
    double adjO = fileReader.nextDouble();
    double adjORank = fileReader.nextDouble();
    double adjD = fileReader.nextDouble();
    double adjDRank = fileReader.nextDouble();
    double adjT = fileReader.nextDouble();
    double adjTRank = fileReader.nextDouble();
    double luckRank = fileReader.nextDouble();
    double sosPyth = fileReader.nextDouble();
    double sosPythRank = fileReader.nextDouble();
    double oppO = fileReader.nextDouble();
    double oppORank = fileReader.nextDouble();
    double oppD = fileReader.nextDouble();
    double oppDRank = fileReader.nextDouble();
    double ncsosPyth = fileReader.nextDouble();
    double ncsosPythRank = fileReader.nextDouble();
    fileReader.nextLine();
    teams[i] = new Team(rank, teamName, wins, losses, pyth, adjO, adjORank, adjD, adjDRank, adjT, adjTRank, luckRank, sosPyth, sosPythRank, oppO, oppORank, oppD, oppDRank, ncsosPyth, ncsosPythRank);
   }
 }
 public String toString(){
   for(Team t: teams){
    return(t.rank + ". " + t.teamName);
   }
   return"Potatoes";
 }
 int pointsA;
 int pointsB;
 int winsA = 0;
 int winsB = 0;
 public String playGame(int a, int b){
   for(int i=0;i<50;i++){
    pointsA = 0;
    pointsB = 0;
    if(teams[a].wins - teams[a].losses > teams[b].wins - teams[b].losses) pointsA += 30;
    else pointsB += 30;
    if(teams[a].sosPythRank > teams[b].sosPythRank) pointsA += 20;
    else pointsB += 20;
    if(teams[a].adjORank + teams[a].adjDRank < teams[b].adjORank + teams[b].adjDRank) pointsA += 20;
    else pointsB += 20;
    if(teams[a].oppORank + teams[a].oppDRank < teams[b].oppORank + teams[b].oppDRank) pointsA += 20;
    else pointsB += 20;
    for(int o=0;o<teams[a].adjT;o++){
     pointsA += (int)(Math.random()*4);
    }
    for(int d=0;d<teams[b].adjT;d++){
     pointsB += (int)(Math.random()*4);
    }
    if(pointsA > pointsB) winsA++;
     else winsB++;
   }
   if(winsA > winsB)
     return(teams[a].teamName);
    else return(teams[b].teamName);
 }
}
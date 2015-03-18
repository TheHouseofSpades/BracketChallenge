import java.io.*;
import java.lang.*;
import java.util.*;
public class Team{
 int rank, wins, losses;
 String teamName;
 double pyth, adjO, adjORank, adjD, adjDRank, adjT, adjTRank, luckRank, sosPyth, sosPythRank, oppO, oppORank, oppD, oppDRank, ncsosPyth, ncsosPythRank;
 int teamA=0, teamB=0;
 public static void main (String str[]) throws IOException{
   Scanner scan = new Scanner(System.in);
   teamA = scan.nextInt();
   teamB = scan.nextInt();
   Bracket.playGame(teamA, teamB);
 }
 
 
 public Team(int r,String tN,int wins,int losses,double pyth,double adjO,double adjORank,double adjD,double adjDRank,double adjT,double adjTRank,double luckRank,double sosPyth,double sosPythRank,double oppO,double oppORank,double oppD,double oppDRank,double ncsosPyth,double ncsosPythRank){
  rank = r; 
  teamName = tN;
  wins = wins;
  losses = losses;
  pyth = pyth;
  adjO = adjO;
  adjORank = adjORank;
  adjD = adjD;
  adjDRank = adjDRank;
  adjT = adjT;
  adjTRank = adjTRank;
  luckRank = luckRank;
  sosPyth = sosPyth;
  sosPythRank = sosPythRank;
  oppO = oppO;
  oppORank = oppORank;
  oppD = oppD;
  oppDRank = oppDRank;
  ncsosPyth = ncsosPyth;
  ncsosPythRank = ncsosPythRank;
 }
 
 public String toString(){
   return (rank + ". " + teamName); 
 }
}
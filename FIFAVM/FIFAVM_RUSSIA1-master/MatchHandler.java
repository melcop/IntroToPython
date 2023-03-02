package fifavm_russia;

import static fifavm_russia.FIFAVM_RUSSIA.matchC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Charlie
 */
public class MatchHandler {
    private static ArrayList<String> qualiferedCountries=new ArrayList<String>();
    private static ArrayList<Match> matches=new ArrayList<Match>();
    private static ArrayList<Integer> sumpoints=new ArrayList<Integer>();
   int totalsum=0;

    public int getNumberOfMatches(String Country){
        matches=matchC.getMatch(Country);
        int size=matches.size();
        return size;
    }
    public int getPointsFromCountry(String Country){
        //removetotalPoints();
        matches= matchC.getMatch(Country);
      System.out.println(matches);
       for(int i=0;i<matches.size();i++){
       String str =  matches.get(i).toString(); 
       String str2 =  matches.get(i).toString();  
        str = str.replaceAll("[^0-9]+", " ");
        str2 = str2.replaceAll("[^A-Za-z]+", " ");
        List list1= Arrays.asList(str.trim().split(" "));
        List list2= Arrays.asList(str2.trim().split(" "));
        
           String countryA=(String)list2.get(0);
           //System.out.println(list2.get(0));
           
           String countryB=(String)list2.get(1);
           //System.out.println(list2.get(1));
        
           int n = Integer.valueOf((String) list1.get(0));
           int m = Integer.valueOf((String) list1.get(1));
           
           if(countryA.equals(Country)){ 
           if(n>m){
                    sumpoints.add(3);
                   // System.out.println("3 points");
            }
            else if(n==m){
                sumpoints.add(1);
                   // System.out.println("1 point");
            }
            else{
                    }
           }
           
           if(countryB.equals(Country)){
           if(n<m){
                    sumpoints.add(3);
                   // System.out.println("3 points");
            }
            else if(n==m){
                sumpoints.add(1);
                   // System.out.println("1 point");
            }
            else{
                    //System.out.println("0 point");
           }}
           int sum=0;
          for(int k=0;k<sumpoints.size();k++){
              sum+=sumpoints.get(k);
           }
          totalsum=sum;
          // System.out.println(sum);
       }
         return totalsum;
    } 
    
    public void removetotalPoints(){
        int newpoints=0;
        sumpoints.clear();
        totalsum=newpoints;
    }
}

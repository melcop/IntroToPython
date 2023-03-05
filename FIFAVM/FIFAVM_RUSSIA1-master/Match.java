package fifavm_russia;

/**
 *
 * @author Charlie
 */
public class Match {
  String match;

    public Match(String match) {
        this.match=match;
    }  

    public String getMatch() {
        return match;
    }

    @Override
    public String toString() {
        return  ""+ match;
    }

    public void setMatch(String match) {
        this.match = match;
    }
    
}

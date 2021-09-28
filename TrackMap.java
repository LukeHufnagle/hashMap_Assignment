import java.util.HashMap;
import java.util.Set;

public class TrackMap{
    public static void main(String[] args){
        HashMap<String, String> trackMap = new HashMap<String, String>();

        trackMap.put("Purple Haze", "PURPLE HAZE ALL IN MY BRAIN");
        trackMap.put("9", "TURN THE 6 UPSIDE DOWN ITS A 9 NOW");
        trackMap.put("Lord I Need You", "WRAP YOUR ARMS AROUND IN MY MERCY");
        trackMap.put("Junya", "JUNYA WATCHIN I BE ON MY EEE");

        Set<String> keys = trackMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackMap.get(key));
        }
    }
}
public class DataLabRunnerPrevious {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        

        // use the Shell to verify the Sinbad library
        // javac -classpath ./lib/sinbad.jar Main.java
        // java -classpath ./lib/sinbad.jar Main.java
        // must do this every time to run the code

        // Sinbad tutorial #1
        // https://github.com/berry-cs/sinbad/blob/master/tutorials/java/welcome02-obj.md 

        // Sinbad tutorial #2
        // https://github.com/berry-cs/sinbad/blob/master/tutorials/java/welcome03-objs.md
        
        
        
        String id = "KATL";
        DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
        ds.setCacheTimeout(15 * 60);    
        ds.load();
        ds.printUsageString();
        float temp = ds.fetchFloat("temp_f");
        String loc = ds.fetchString("location");
        System.out.println("The temperature at " + loc + " is " + temp + "F");
        

        
    }
}


class Observation{

    
}



/*
 Represents information about a NWS weather station
*/

class WeatherStation {
    private String name;
    private String id;
    private String state;
    private double lat;
    private double lng;
     
    public WeatherStation(String name, String id, String state, double lat, double lng) {
        this.name = name;
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.state = state;     
    }
     
    /* Produce the id of this station */
    public String getId() { 
        return id;
    }
     
    /* Produce the name of this station */
    public String getName() { 
        return name;
    }
     
    /* Determine if this weather station is located in the given state */
    public boolean isLocatedInState(String st) {
        return this.state.equals(st);
    }
     
}

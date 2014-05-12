import java.util.*;

public class StateUtils {

  //
  // Generates an HTML select list that can be used to select a specific
  // U.S. state.
  //
public String[][] states_Data = new String[][] {{"ALABAMA", "AL"},
{"ALASKA", "AK"},
{"ARIZONA", "AZ"},
{"ARKANSAS", "AR"},
{"CALIFORNIA", "CA"},
{"COLORADO", "CO"},
{"CONNECTICUT", "CT"},
{"DELAWARE", "DE"},
{"FLORIDA", "FL"},
{"GEORGIA", "GA"},
{"HAWAII", "HI"},
{"IDAHO", "ID"},
{"ILLINOIS", "IL"},
{"INDIANA", "IN"},
{"IOWA", "IA"},
{"KANSAS", "KS"},
{"KENTUCKY", "KY"},
{"LOUISIANA", "LA"},
{"MAINE", "    ME"},
{"MARYLAND", "MD"},
{"MASSACHUSETTS", "MA"},
{"MICHIGAN", "MI"},
{"MINNESOTA", "MN"},
{"MISSISSIPPI", "MS"},
{"MISSOURI", "MO"},
{"MONTANA", "MT"},
{"NEBRASKA", "NE"},
{"NEVADA", "NV"},
{"NEW HAMPSHIRE", "NH"},
{"NEW JERSEY", "NJ"},
{"NEW MEXICO", "NM"},
{"NEW YORK", "NY"},
{"NORTH CAROLINA", "NC"},
{"NORTH DAKOTA", "ND"},
{"OHIO", "OH"},
{"OKLAHOMA", "OK"},
{"OREGON", "OR"},
{"PENNSYLVANIA", "PA"},
{"RHODE ISLAND", "RI"},
{"SOUTH CAROLINA", "SC"},
{"SOUTH DAKOTA", "SD"},
{"TENNESSEE", "TN"},
{"TEXAS", "TX"},
{"UTAH", "UT"},
{"VERMONT", "VT"},
{"VIRGINIA", "VA"},
{"WASHINGTON", "WA"},
{"WEST VIRGINIA", "WV"},
{"WISCONSIN", "WI"},
{"WYOMING", "WY"}};

     public int len = states_Data.length;
     
 public static void main(String []args)
     {
         System.out.println(parseSelectedState("ALABAMA"));
         System.out.println(displayStateFullName("CA"));
         System.out.println(createStateSelectList());
     }
     
     public String getData (String data)
    {
     HashMap<String, String> getFullName = new HashMap<String, String>();
     HashMap<String, String> getShortName = new HashMap<String, String>();
     HashMap<Integer, String> getState = new HashMap<Integer, String>(); 

     int imp = 0;
     if (imp == 0)
     {
     for (int i = 0 ; i < states_Data.length; i++) 
     {
     getFullName.put(states_Data[i][1], states_Data[i][0]);
     getShortName.put(states_Data[i][0], states_Data[i][1]); 
     getState.put(i, states_Data[i][0]);
     }
     }
     if ( data.length() == 2 )
     return getFullName.get(data);
     else 
     return getShortName.get(data);
    }

  public static String createStateSelectList()
  {
    StateUtils d = new StateUtils();
    StringBuilder stringb = new StringBuilder();
    
        stringb.append("<select name=\"state\">\n");
        for (int i = 0; i < d.len ; i++)
        {
        stringb.append("<option value=\"");    
        stringb.append(d.states_Data[i][0]);
        stringb.append("\">");
        stringb.append(d.states_Data[i][0]);
        stringb.append("</option>\n");
        }
        stringb.append("</select>\n");
        return stringb.toString();
  }

  //
  // Parses the state from an HTML form submission, converting it to
  // the two-letter abbreviation. We need to store the two-letter abbreviation
  // in our database.
  //
  public static String parseSelectedState(String s)
  {
    StateUtils d = new StateUtils();
    String answer = d.getData(s);
    return answer;
  }

  //
  // Displays the full name of the state specified by the two-letter code.
  //
  public static String displayStateFullName(String abbr) 
  {
    StateUtils d = new StateUtils();
    String answer = d.getData(abbr);
    return answer;
    
  }
  

}

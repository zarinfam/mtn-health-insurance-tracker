package ir.irancell.course.Insurance;
import android.util.Log;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hp on 8/27/2015.
 */
public class JSONParser {
    public JSONParser()
    {
        super();
    }



    public boolean parseUserAuth(JSONObject object)
    {	boolean userAtuh=false;
        try {
            userAtuh= object.getBoolean("Value");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("parseUserAuth", e.getMessage());
        }

        return userAtuh;
    }



}

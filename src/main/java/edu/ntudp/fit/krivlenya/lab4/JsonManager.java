package edu.ntudp.fit.krivlenya.lab4;

import com.google.gson.Gson;
import edu.ntudp.fit.krivlenya.lab4.model.*;


public class JsonManager {
    private static final Gson gson = new Gson();

    public static String universityToJson(University university) {
        return gson.toJson(university);
    }

    public static University jsonToUniversity(String json) {
        return gson.fromJson(json, University.class);
    }


}

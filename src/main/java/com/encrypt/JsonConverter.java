package com.encrypt;

import com.google.gson.Gson;

/**
 * Created by alan on 2014/11/4.
 */
public class JsonConverter {

    private static Gson gson = null;

    public String objectToJson(Object src) {
        return getGsonInstance().toJson(src);
    }

    public Object jsonToObject(String json, Class cls) {
        return getGsonInstance().fromJson(json, cls);
    }

    private static Gson getGsonInstance() {
        if (gson == null) {
            gson = new Gson();
        }

        return gson;
    }

}

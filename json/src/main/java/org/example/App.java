package org.example;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String jsonString = """
        {
          "content": {
            "eventType": "ValuationChange",
            "eventOccurredAt": 1707395089987,
            "internalId": 65082,
            "parentPrimaryId": {
              "id": "636342",
              "srcCd": "CLT"
            },
            "entityType": "Valuation",
            "changeType": "Update",
            "systemUserCd": "SUPERTEST",
            "changedFields": [
              {
                "fieldName": "valuation.nextValuationDate",
                "oldValue": "2025-02-08T00:00:00.000Z",
                "newValue": "2025-02-09T00:00:00.000Z"
              }
            ],
            "parentInternalId": 636342
          }
        }
        """;


        JSONObject obj=new JSONObject(jsonString);
//        obj.remove("eventType");
//        System.out.println(obj.toString(2));

        JSONObject obj2=obj.getJSONObject("content").getJSONObject("parentPrimaryId");
        obj2.remove("srcCd");
        System.out.println(obj.toString(2));


        JSONArray arr=obj.getJSONObject("content").getJSONArray("changedFields");

        JSONObject filed= arr.getJSONObject(0);
        filed.remove("oldValue");
        filed.remove("newValue");
        System.out.println(obj.toString(2));






//        JSONObject obj=new JSONObject(jsonString);
//        System.out.println(obj.get("name"));
//        System.out.println(obj.getInt("age"));
//        obj.put("dep","Ece");
//        System.out.println(obj.get("dep"));
//        obj.remove("age");
//        System.out.println(obj.toString(2));




    }
}

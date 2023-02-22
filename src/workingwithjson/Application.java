package workingwithjson;



/* 
Project: Lab 6
Purpose Details: Working with JSON
Course: IST 411
Author: AJ Germani
Date Developed: 2/21/2023
Last Date Changed: 2/22/2023
Revision: 1
*/
public class Application {

    public static void main(String[] args){
        // Create JsonUtil class
        JsonUtil jsonUtil = new JsonUtil();
        
        // Call method to get user input and write to .json file
        jsonUtil.objToJSON();
        // Call method to read .json file
        jsonUtil.displayJSON();
    }

}

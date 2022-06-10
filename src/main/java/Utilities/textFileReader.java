package Utilities;

import java.io.*;

public class textFileReader {

     static ConfigFileReader reader=new ConfigFileReader();

    public textFileReader(){

    }

    public static String[] getLocator(String elementname){
        String projecturl=System.getProperty("user.dir");
        String env=reader.configFile("environment");
        File file = new File(projecturl+"/src/resources/PageObjectLocators/"+env+"/PageObjectLocators.txt");
        String[] locator = new String[0];  //defining string type Array
        BufferedReader br = null;
        Boolean value=false;

        {
            try {
                br = new BufferedReader(new FileReader(file));
                // Declaring a string variable
                String st;

                while((st = br.readLine()) != null){
                    //System.out.println(st);

                    if (elementname.equalsIgnoreCase(st.split(";")[0])){

                        locator=st.split(";");
                        value=true;
                    }
                    //System.out.println(locator[0]);
                    

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {

                    br.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


        if (value=true){
            return locator;
        }else {
            return null;
        }
    }


}





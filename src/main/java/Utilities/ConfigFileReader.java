package Utilities;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader {

    public ConfigFileReader(){

    }

    public String configFile(String st){
        String projecturl=System.getProperty("user.dir");
        String configvalue = null;
        File file=new File(projecturl+"/Config.properties");
        try {
            InputStream in=new FileInputStream(file);
            Properties pro=new Properties();
            pro.load(in);
            configvalue=pro.getProperty(st);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return configvalue;
    }
}

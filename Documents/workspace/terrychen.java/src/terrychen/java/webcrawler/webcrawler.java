package terrychen.java.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class webcrawler {
	
	public static void main(String[] args)  {
        try {
            URL my_url = new URL("https://dl.dropboxusercontent.com/u/24048266/terrychen/index.htm");
            BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
            String strTemp = "";
            while(null != (strTemp = br.readLine())){
            System.out.println(strTemp);
        }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}

}

package com.cloudmersive;

import com.cloudmersive.client.gac.invoker.*;
import com.cloudmersive.client.gac.invoker.auth.*;
import com.cloudmersive.client.gac.model.*;
import com.cloudmersive.client.gac.ScanApi;
import java.io.*;
import org.springframework.core.io.*;

public class Main {

    public static void main(String[] args) {




        try
        {
            // Customer

            ApiClient defaultClient = Configuration.getDefaultApiClient();

            // Configure API key authorization: Apikey
            ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
            Apikey.setApiKey("YOUR-KEY");

            
            ScanApi apiInstance = new ScanApi();
                        
            ByteArrayResource inputStream = new ByteArrayResource(new byte[100]);
            
            try 
            {
                VirusScanResult result = apiInstance.scanFile(inputStream);
                System.out.println(result);
            } catch (Exception e) {
                System.err.println("Exception when calling ScanApi#scanFile");
                e.printStackTrace();
            }


        }
        catch (Exception e)
        {
            System.out.println("Error:" + e.toString() + e.getMessage() );
        }




    }
}

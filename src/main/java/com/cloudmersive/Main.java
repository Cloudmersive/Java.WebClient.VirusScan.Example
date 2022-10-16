package com.cloudmersive;

import com.cloudmersive.client.gac.invoker.*;
import com.cloudmersive.client.gac.invoker.auth.*;
import com.cloudmersive.client.gac.model.*;

import reactor.core.publisher.Mono;

import com.cloudmersive.client.gac.ScanApi;
import java.io.*;
import org.springframework.core.io.*;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class Main {

    public static void main(String[] args) {




        try
        {

            
            ScanApi apiInstance = new ScanApi();
            apiInstance.getApiClient().setApiKey("YOUR-API-KEY");
                        
            ByteArrayResource inputStream = new ByteArrayResource(new byte[100]);
            
            try 
            {
                VirusScanResult result = apiInstance.scanFile(inputStream).block();
                System.out.println(result.toString());
            } catch (Exception e) {
                System.err.println("Exception when calling ScanApi#scanFile");
                e.printStackTrace();
            }
            System.out.println("Done.");

        }
        catch (Exception e)
        {
            System.out.println("Error:" + e.toString() + e.getMessage() );
        }




    }
}

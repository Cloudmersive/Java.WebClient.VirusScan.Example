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
            // Customer

            ApiClient defaultClient = new ApiClient();

            // Configure API key authorization: Apikey
            defaultClient.setApiKey("YOUR-KEY");

            
            ScanApi apiInstance = new ScanApi();
                        
            ByteArrayResource inputStream = new ByteArrayResource(new byte[100]);
            
            try 
            {
                Mono<VirusScanResult> result = apiInstance.scanFile(inputStream);
                System.out.println(result.block().toString());
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

package com.zaekeon.mconline;

/**
 * Created by zaekeon 1/6/2015.
 */
public class Server {

   private final String mcVersion;  //Version of MC Client server pack is for
   private final String updateURL;  //URL to simple XML/TXT file with server details
   private final String mconlineVersion;  //version of MCOnline client

   public Server (String mcVersion, String updateURL, String mconlineVersion  )
   {
      this.mcVersion = mcVersion;
      this.updateURL = updateURL;
      this.mconlineVersion = mconlineVersion;
   }
}

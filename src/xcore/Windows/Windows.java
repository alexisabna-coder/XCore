// Declares a public class named Windows
// This class inherits from (extends) the OperatingSystem class
 public class Windows extends OperatingSystem
{
    // Stores the type of license used by Windows (e.g., OEM, Retail)
    private String licenseType;
    // Indicates whether Windows supports DirectX (true or false)
    private boolean directXSupport;
     // Stores the default web browser of Windows (e.g., Edge)
    private String defaultBrowser;
    
    //getters
    // Returns the license type of Windows
    public String getlicenseType(){
        return licenseType;// Sends back the value of licenseType
    }
    
    // Returns whether DirectX is supported
    public boolean getdirectXSupport(){
        return directXSupport; // Sends back the value of directXSupport
    }
    
     // Returns the default browser of Windows
    public String getdefaultBrowser(){
    return defaultBrowser;  // Sends back the value of defaultBrowser
    }
    
    //Setters
    
    public void setlicenseType(String licenseType){
        this.licenseType=licenseType;
    }
    
    public void setdirectXSupport(boolean directXSupport){
        this.directXSupport=directXSupport;
    }
    
    public void setdefaultBrowser(String defaultBrowser){
        this.defaultBrowser=defaultBrowser;
    }
}
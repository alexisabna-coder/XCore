// Abstract base class representing an Operating System
// This class contains common attributes shared by all operating systems
  public abstract class OperatingSystem
   {
    //Identity attributes
   private String name; // The name of the operating system (e.g., Windows, Linux)
   private String version; // The current version of the operating system (e.g., 10, 11, 20.04)
   private String manufacturer; // Manufacturer or developer of the OS (e.g., Microsoft, Apple)
   private int releaseYear;     // Year the OS was first released
   private String licenseType;  // Type of license (e.g., Proprietary, Free, Open Source)
   private boolean openSource;  // Indicates whether the OS is open source or not
   
   //Architecture attributes
   private String architecture; // CPU architecture supported by the OS (e.g., x86, X64, ARM)
   private String kernel;  // Type of kernel used by the OS (e.g., Monolithic, Hybrid, Microkernel)
   private String supportedFileSystem; // Supported file systems (e.g., NTFS, ext4, APFS)
   
   // Usage & experience attributes
    private String interfaceType; // Type of user interface provided by the OS (e.g., GUI, CLI, Mixed)
    private String targetDevices; // Types of devices the OS is designed for (e.g., Desktop, Mobile, Server)
    private String securityLevel;  // Security level or features of the OS (e.g., High, Medium, Low)
    private String updatePolicy;   // Policy for updates (e.g., Automatic, Manual, Periodic)
    
    //getters
    public String getname(){
        return name;
    }
    
    public String getversion(){
        return version;
    }
    
    public String getmanufacturer(){
        return manufacturer;
    }
    
    public int getreleaseYear(){
        return releaseYear;
    }
    
    public String getlicenseType(){
        return licenseType;
    }
    
    public boolean getopenSource(){
        return openSource;
    }
    
    public String getarchitecture(){
        return architecture;
    }
    
    public String getkernel(){
        return kernel;
    }
    
    public String getsupportedFileSystem(){
        return supportedFileSystem;
    }
    
    public String getinterfaceType(){
        return interfaceType;
    }
    
    public String gettargetDevices(){
        return targetDevices;
    }
    
    public String getsecurityLevel(){
        return securityLevel;
    }
    
    public String getupdatePolicy(){
        return updatePolicy;
    }
    
    //setters
    public void setname(String name){
        this.name=name;
    }
    
    public void setversion(String version){
        this.version=version;
    }
    
    public void setmanufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    
    public void setreleaseYear(int releaseYear){
        this.releaseYear=releaseYear;
    }
    
    public void setlicenseType(String licenseType){
        this.licenseType=licenseType;
    }
    
    public void setopenSource(boolean openSource){
        this.openSource=openSource;
    }
    
    public void setarchiteture(String architecture){
        this.architecture=architecture;
    }
    
    public void setkernel(String kernel){
        this.kernel=kernel;
    }
    
    public void supportedFileSystem(String supportedFileSystem){
        this.supportedFileSystem=supportedFileSystem;
    }
    
    public void setinterfaceType(String interfaceType){
        this.interfaceType=interfaceType;
    }
    
    public void settargetDevices(String targetDevices){
        this.targetDevices=targetDevices;
    }
    
    public void setsecurityLevel(String securityLevel){
        this.securityLevel=securityLevel;
    }
    
    public void setupdatePolicy(String updatePolicy){
        this.updatePolicy=updatePolicy;
    }
}
class Register{
    private String Name;
    private String UserName;
    private String Password;
    private String EMail;
    private Boolean VIPStatus;
    private String Package;

    public Register() {

    }

   public String getName() {
        return Name;
   }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getEMail() {
        return EMail;
    }
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    public Boolean getVIPStatus() {
        return VIPStatus;
    }
    public void setVIPStatus(Boolean VIPStatus) {
        this.VIPStatus = VIPStatus;
    }
    public void setPackage(String Package) {
        this.Package = Package;
    }
}
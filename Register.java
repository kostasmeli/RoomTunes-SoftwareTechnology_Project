class Register {
    private String Name;
    private String UserName;
    private String Password;
    private String EMail;
    private Boolean VIPStatus;

    public Register(String Name, String UserName, String Password, String EMail, Boolean VIPStatus) {
        this.Name = Name;
        this.UserName = UserName;
        this.Password = Password;
        this.EMail = EMail;
        this.VIPStatus = VIPStatus;
    }

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
}
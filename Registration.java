public class Registration {

    private String name;
    private String username;
    private String password;
    private String EMail;
    private Boolean VIPStatus;

    public Registration()
    {
    }
    public Registration(String nm,String user,String pass,String eml,Boolean Vip)
    {
        name = nm;
        username = user;
        password = pass;
        EMail = eml;
        VIPStatus = Vip;
    }

    public void setName(String nm)
    {
        name = nm;
    }

    public String getName()
    {
        return name;
    }

    public void setUsername(String user)
    {
        username = user;
    }

    public String getUsername()
    {
        return username;
    }

    public void setPassword(String pass)
    {
        password = pass;
    }

    public String getPassword()
    {
        return password;
    }

    public void setEMail(String eml)
    {
        EMail = eml;
    }

    public String getEMail()
    {
        return EMail;
    }

    public void setVIPStatus(Boolean Vip) {
        VIPStatus = Vip;
    }

    public Boolean getVIPStatus()
    {
        return VIPStatus;
    }
}

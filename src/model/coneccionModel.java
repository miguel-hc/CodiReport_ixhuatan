
package model;

/**
 *
 * @author MiguelCastellanos
 */
public class coneccionModel {
    
    String url;
    String pass;
    String user;

    public coneccionModel(String url, String pass, String user) {
        this.url = url;
        this.pass = pass;
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}

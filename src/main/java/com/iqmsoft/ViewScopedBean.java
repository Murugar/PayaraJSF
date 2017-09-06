package iqmsoft.payara;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ViewScopedBean implements Serializable {

    private String queryParameter = "This is a View Scoped Bean Test";

    public void init() {
        System.out.println("queryParameter = " + this.queryParameter);
    }

    public void setQueryParameter(String queryParameter) {
        this.queryParameter = queryParameter;
    }

    public String getQueryParameter() {
        return queryParameter;
    }
}

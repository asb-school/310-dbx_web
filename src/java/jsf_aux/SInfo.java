/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf_aux;

import authnz.AuthnAuthz;
import java.beans.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author villafan
 */
@ManagedBean(name = "sinfo")
@SessionScoped
public class SInfo implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    private String sampleProperty;
    private PropertyChangeSupport propertySupport;
    
    private boolean valid;
    
    AuthnAuthz aa;
    
    public SInfo() {
        propertySupport = new PropertyChangeSupport(this);
        valid = true;
        aa = new AuthnAuthz();
    }
    
    public boolean getValid()
    {
        return valid;
        //return aa.is_admin_authn;
    }
    
    public void setValid(boolean v)
    {
        valid = v;
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public String svgWorld()
    {
        // Generate the SVG text and put it in the string s
        String s = "";
        
        s = s + "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"100%\" height=\"100%\" viewBox=\"0 0 1000 1000\" >";
        s = s + "<circle cx=\"500\" cy=\"650\" r=\"30\" fill=\"rgb(38,255,38)\" stroke=\"#000000\" stroke-width=\"1\"/>";
        s = s + "</svg>";   

        return s;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}

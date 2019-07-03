
package beans;

import javax.enterprise.context.Dependent;
import javax.inject.Named;


@Named(value = "brojac")
@Dependent

public class brojac {
    
    public brojac(){
    
}
    public String poruka(){
        return "Nova poruka iz brojaca";
    }

}

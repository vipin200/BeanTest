package Employee;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;


public class Intro {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo ei=Introspector.getBeanInfo(employee.class);
        PropertyDescriptor pd[]= ei.getPropertyDescriptors();
        for(PropertyDescriptor d: pd)
        {
            System.out.println(d.getName());
        }
    }
}

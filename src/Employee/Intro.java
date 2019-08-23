package Employee;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;


public class Intro {
    public static void main(String[] args) throws IntrospectionException, ClassNotFoundException {
        Class emp = Class.forName("Employee.Employee");
        BeanInfo ei=Introspector.getBeanInfo(emp);
        PropertyDescriptor pd[]= ei.getPropertyDescriptors();
        for(PropertyDescriptor d: pd)
        {
            System.out.println(d.getName());
        }
        MethodDescriptor md[]=ei.getMethodDescriptors();
        for(MethodDescriptor m: md)
        {
            System.out.println(m.getName());
        }
    }
}

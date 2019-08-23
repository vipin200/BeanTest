package Employee;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.logging.Level;
import java.util.logging.Logger;


public class employeeBeanInfo extends SimpleBeanInfo{
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() 
    {
        try {
            PropertyDescriptor id=new PropertyDescriptor("id",employee.class);
            PropertyDescriptor salary=new PropertyDescriptor("salary",employee.class);
            PropertyDescriptor age=new PropertyDescriptor("age",employee.class);
            PropertyDescriptor[] pd={id,salary,age};
            return pd;
        } catch (IntrospectionException ex) {
            Logger.getLogger(employeeBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

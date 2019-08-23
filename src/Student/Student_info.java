package Student;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Student_info {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        Class St= Class.forName("Student.student");
        BeanInfo st_info=Introspector.getBeanInfo(St);
        PropertyDescriptor[] propertyDescriptor = st_info.getPropertyDescriptors();
        for(PropertyDescriptor pd : propertyDescriptor)
        {
            System.out.println(pd.getName());
        }
        
    }
}

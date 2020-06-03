# week9
Question: 

Consider you are asked to create servlets for below end points 
/getEmps 
/getCustomer
/getProducts

Eventually over course of time the company needs many such servlets due to this maintaining multiple servlets become difficult, create a single servlets which has the signature given below 


<servlet>
                <servlet-name>hi</servlet-name>
                <servlet-class>com.something.ClassName</servlet-class>
</servlet>

<servlet-mapping>
                <servlet-name>hi</servlet-name>
                <url-pattern>/*</url-pattern> 
</servlet-mapping>

You are asked to create a single servlet which will handle all the scenarios, use either switch case or if condition for routing. 


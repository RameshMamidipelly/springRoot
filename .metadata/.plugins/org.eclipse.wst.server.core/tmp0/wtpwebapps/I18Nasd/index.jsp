<%@page import="java.util.Locale" %>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@page	import="org.springframework.context.support.ResourceBundleMessageSource" %>
<%
String s=request.getHeader("accept-language");
System.out.println(s);
Locale l=new Locale(s);
System.out.println(l);
ApplicationContext ap=new ClassPathXmlApplicationContext("resource/spring.xml");
System.out.println(ap);
String value=ap.getMessage("lable",null,l);
System.out.println(value);
%>
<form action="./hello">
<%=value%><input type="text" name="name"/>
			<input type="submit" value="submit"/>			

</form>
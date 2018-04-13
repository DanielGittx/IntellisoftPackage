<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns ="http://w3.org/1999/xhtml"
      xmlns ="http://java.sun.com/jsf/htnl">
    <h:head>
             <title>Title</title>
    </h:head>

   <h:body>
    Hello from Facelets
    <br/>
    Message is: #{messageServerBean.message}
    <br/>
    Message Server Bean is: #{messageServerBean}
</h:body>
</html>

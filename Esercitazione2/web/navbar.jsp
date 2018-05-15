<%-- 
    Document   : navbar
    Created on : 10-apr-2018, 9.16.41
    Author     : bardoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <h3>Le pagine del sito</h3>
    <div id="div-search">
        <input type="text" id="search" name="search" value="Cerca..">
    </div>

    <div id="div-nav">
        <ul class="navbar">
            <li><a href="Index">Home</a></li>
            <li><a href="Login">Il tuo Profilo</a></li>
            <li><a href="Signup">Registrati</a></li>
        </ul>
    </div>
</nav> 

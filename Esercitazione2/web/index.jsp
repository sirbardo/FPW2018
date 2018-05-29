<%-- 
    Document   : index
    Created on : 10-apr-2018, 9.26.15
    Author     : bardoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Homepage</title>
        <meta charset="UTF-8">
        <meta name="author" content="Sara Casti">
        <meta name="keywords" content="html, css, java, webapplication">
        <meta name="description" content="Images, tables and forms">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style1.css" media="screen">
        
    </head>
    <body>
        
        <!-- Header Here! -->
        <jsp:include page="header.jsp" />
        
        <hr>
        
        <!-- NavBar Here! -->
        <jsp:include page="navbar.jsp" />
        
        <article>
            <div class="left-box">
            
            <h3>Lista ultime news</h3> 
            <ol>
                <li>Scandalo Facebook</li>
                <li>Pirati della strada investono bambino</li>
                <li>Nuovo samsung galaxy s9</li>
            </ol>
            <hr>
            <h3>
                Lista delle principali categorie
            </h3>
            <ol>
                <li>
                    Sport
                    <ol>
                        <li>Basket</li>
                        <li>Tennis</li>
                        <li>Calcio</li>
                    </ol>
                </li>
                <li>Musica</li>
                <li>Politica</li>
            </ol>
        </div>
        <div class="main-box">
            <c:forEach var="news" items="${listNews}">
                <div class="div-news" id="${news.getId()}-news">
                    Notizia di: ${news.getAutore().getName()}
                    <br>
                    ${news.getContent()}
                </div>
            </c:forEach>
        </div>
            <a href="http://www.google.com">Gooooogle</a>
        </article>
        <footer>Sito realizzato da Sara Casti! PhD Student at University of Cagliari</footer>
    </body>
</html>

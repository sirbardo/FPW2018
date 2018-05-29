<%-- 
    Document   : signup
    Created on : 15-mag-2018, 9.07.36
    Author     : bardoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style1.css" media="screen">
        <script src="js/Prova.js"></script>
    </head>
    <body>

        <jsp:include page="header.jsp" />

        <hr>
        
        <jsp:include page="navbar.jsp" />
        
        <article>
        <div class="left-box">
            
            
            <script type="text/javascript">
                
                var a = 2
                var b = 100
                
                print_sum(a, b)
                
            </script>
            
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
               
            <h3>Registrati:</h3>

                <form action='Signup' method="post">
                <label for="name"> Nome:</label>
                <input name ="name" id="name" type="text"> <br/>
                <label for="surname"> Cognome:</label>
                <input name ="surname" id="surname" type="text"> <br/>
                <label for="psw">Password:</label>
                <input name="psw" id="psw" type="password"> <br/>
                <label for="email"> Email:</label>
                <input name ="email" id="email" type="text"> <br/>
                <label for="urlProfImg"> Url Profile Image</label>
                <input name ="urlProfImg" id="urlProfImg" type="text"> <br/>

                <br>
                <input type="submit"/>
            </form>


                
                
            <hr>
            <section>
                <h6> Ultimi post </h6>
                <table>
                    <tr class="headerrow">                    
                        <th>
                        Post:
                        </th>
                        <th>
                        Data:
                        </th>
                    </tr>

                    <tr>
                        <td>
                            Buffon ride
                        </td>
                        <td>
                            30/01/2018 
                        </td>
                    </tr>
                    
                    <tr class="evenrow"> <!-- Riga pari-->
                        <td>
                            Le hits dell'estate 2017
                        </td>
                        <td>
                            30/06/2017
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Nuova news esclusiva!!
                        </td>
                        <td>
                            30/01/2018 
                        </td>
                    </tr>
                    <tr class="evenrow"> <!-- Riga pari-->
                        <td>
                            Ultimissima news di martedi 20 Marzo!
                        </td>
                        <td>
                            20/03/2018 
                        </td>
                    </tr>
                </table>
                <hr>
            </section>
            </div>
        </article>
                
        <footer>Sito realizzato da Sara Casti</footer>

    </body>
</html>

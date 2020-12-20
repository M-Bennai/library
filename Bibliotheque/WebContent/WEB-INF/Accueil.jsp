<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bibliotheque</title>
<link rel="stylesheet" href="./css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;700&display=swap" rel="stylesheet">
<link href="//db.onlinewebfonts.com/c/69dbc1186412d7831b88d8a78a360360?family=DIN+Condensed+Web" rel="stylesheet" type="text/css"/>
</head>
<body>
<nav>
        <h2 class="bibliotheque"><a href="./Accueil">Bibliotheque</a></h2>
        
        <ul class="nav-links">
            <li><a href="./Inscription">Inscription</a></li>
            <li><a href="./ListeAbonne">Liste Abonnés</a></li>
            <li><a href="./GestionA">Gestion Abonnés</a></li>
            
        </ul>
    </nav>
    
    <div class="container">
        <div class="img-biblio"><img src="./css/assets/Biblio2.jpg" alt="biblio" width="600px">
        </div>
        <div class="intro">
            <h1 class="title">BIBLIOTHEQUE</h1> 
            <h2 class="simplon">SIMPLON.CO</h2>
            <p class="introduction">Bienvenue sur le site de la bibliothèque Simplon.co ! <br>
            <br>
 Vous pouvez vous inscrire pour avoir la possibilité d’emprunter des livres. </p>
 <h1 class="new">DERNIERS AJOUTS</h2>
 <div class="livres">
    <div class="livre1"><img src="./css/assets/ickabog.png" alt="" class="livre"><p class="book">L’Ickabog</p></div>
    <div class="livre2"><img src="./css/assets/gulliver.png" alt="" class="livre"><p class="book">Les voyages de Gulliver</p></div>
    <div class="livre3"><img src="./css/assets/Doggerland.png" alt="" class="livre"><p class="book">Doggerland</p></div>
</div></div>
        
    </div>
</body>
</html>
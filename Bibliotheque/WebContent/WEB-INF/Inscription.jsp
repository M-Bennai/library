<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;700&display=swap" rel="stylesheet">
<link href="//db.onlinewebfonts.com/c/69dbc1186412d7831b88d8a78a360360?family=DIN+Condensed+Web" rel="stylesheet" type="text/css"/>
<title>Inscription</title>
</head>
<body>
<nav>
        <h2 class="bibliotheque"><a href="./Accueil">BIBLIOTHEQUE</a></h2>
        
        <ul class="nav-links">
            <li><a href="./Inscription">Inscription</a></li>
            <li><a href="./ListeAbonne">Liste Abonnés</a></li>
            <li><a href="./GestionA">Gestion Abonnés</a></li>
            
        </ul>
    </nav>
    <h1 class="inscrip">Formulaire d'inscription</h1>
    
  <form class="format" action ="Inscription" method="Post">
    

        <div class="formulaire">
        <label for="nom">Nom :</label>
        
        <input type="text"  name="nom" required maxlength="20" size="20" value="${ abonne.nom }"> 
        </div>

        <div class="formulaire">
        <label for="prenom">Prenom :</label>
        
        <input type="text"  name="prenom" required maxlength="20" size="20" value="${ abonne.prenom }">
    </div>
        <div class="formulaire">
        <label for="adresseEmail">Adresse email :</label>
        
        <input type="text"  name="adresseEmail" required maxlength="30" size="20" value="${ abonne.adresseEmail }">
    </div>

        <div class="formulaire">
        <label for="adressePostal">Adresse Postal :</label>
        
        <input type="text"  name="adressePostal" required maxlength="20" size="20" value="${ abonne.adressePostal }">
    </div>
        <div class="formulaire">
        <label for="dateNaissance">Date de Naissance :</label>
        
        <input type="text"  name="dateNaissance" required maxlength="20" size="20" value="${ abonne.dateNaissance }">
    </div>
        <div class="formulaire">
        <label for="telephone">Telephone :</label>
        
        <input type="text"  name="telephone" required maxlength="20" size="20" value="${ abonne.telephone }">
    </div>
        <div class="formulaire">
        <label for="dateAdhesion">Date D'Adhésion :</label>
        
        <input type="text"  name="dateAdhesion" required maxlength="20" size="20" value="${ abonne.dateAdhesion }">
    </div>
        <div class="formulaire">
        <label for="categorieProfessionnelle">Profession :</label>
        
        <input type="text"  name="categorieProfessionnelle" required maxlength="20" size="20" value="${ abonne.categorieProfessionnelle }">
    </div>
        <input type="hidden" name="id_abonne" value='${abonne.id_abonne}'><br>
        <button class="valider" type="submit" value="Valider" size="20">Valider</button>
        
       </form>

</body>
</html>
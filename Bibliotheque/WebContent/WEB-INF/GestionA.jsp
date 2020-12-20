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
<title>GestionBibliotheque</title>
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
    
    <h1 class="ListeAbo">Gestion Abonnés</h1>
    
    <section class="tableau-abonne">
    <table>
<tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Adresse Email</th>
            <th>Adresse Postal</th>
            <th>Date de Naissance</th>
            <th>Telephone</th>
            <th>Date Adhésion</th>
            <th>Profession</th>
</tr>
 <tr>
        <c:forEach var="abonne" items="${ allAbonne }">
        <td><c:out value="${ abonne.id_abonne }" /></td>
        <td><c:out value="${ abonne.nom }" /></td>
        <td><c:out value="${ abonne.prenom }" /></td>
        <td><c:out value="${ abonne.adresseEmail }"/></td>
        <td><c:out value="${ abonne.adressePostal }"/></td>
        <td><c:out value="${ abonne.dateNaissance }"/></td>
        <td><c:out value="${ abonne.telephone }"/></td>
        <td><c:out value="${ abonne.dateAdhesion }"/></td>
        <td><c:out value="${ abonne.categorieProfessionnelle }"/></td>
        
        <td>
        <form action="GestionA" method="post">
    	<input type="hidden" name="action" value="modifier"/>
    	<input type="hidden" name="id_abonne" value="${abonne.id_abonne}"/>
    	<button type="submit"><h5 class="modifier">Modifier</h5></button>
    	</form>
    	</td>
    	
        <td>
        <form action="GestionA" method="post">
    	<input type="hidden" name="action" value="supprimer"/>
    	<input type="hidden" name="id_abonne" value="${abonne.id_abonne}"/>
    	<button type="submit"><h5 class="desinscrire">Desinscrire</h5></button>
    	</form>
    	</td>
    	</tr>
    
    
    
    </c:forEach>
    </table>
 </section>
</body>
</html>
<%@ page language="java" contentType="application/vnd.google-earth.kml+xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<kml xmlns="http://www.opengis.net/kml/2.2"
xmlns:gx="http://www.google.com/kml/ext/2.2">
<Document>

<c:forEach var="city" items="${ciudades}">

<Placemark>

   <name><c:out value="${city.name}"/></name>
   <LookAt>
      <gx:TimeStamp>
        <when>2012</when>
      </gx:TimeStamp>
      <longitude><c:out value="${city.geoPoint.x}"/></longitude>
      <latitude><c:out value="${city.geoPoint.y - 0.4}"/></latitude>  
      <altitude>40000</altitude>  
      <range>500</range>   
      <tilt>45</tilt> 
      <heading>0</heading> 
      <altitudeMode>relativeToGround</altitudeMode>
    </LookAt> 
  <Point><coordinates><c:out value="${city.geoPoint.x}"/>,<c:out value="${city.geoPoint.y}"/></coordinates></Point>
  </Placemark>    
     
</c:forEach>
 
</Document>
</kml>

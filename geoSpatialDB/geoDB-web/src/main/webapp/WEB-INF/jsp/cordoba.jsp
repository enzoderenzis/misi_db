<%@ page language="java" contentType="application/vnd.google-earth.kml+xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<kml xmlns="http://www.opengis.net/kml/2.2"
xmlns:gx="http://www.google.com/kml/ext/2.2">
<Document>
		<Style id="poly">
        	<LineStyle>
            	<color>F0FFFF42</color>
	        </LineStyle>
    	    <PolyStyle>
        	    <color>A8ff9257</color>
        	</PolyStyle>
    	</Style>
    	<Style id="sn_ylw-pushpin">
		<IconStyle>
			<scale>1.1</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff0008ff</color>
		</LineStyle>
		<PolyStyle>
			<color>960000ff</color>
		</PolyStyle>
	</Style>
	<StyleMap id="msn_ylw-pushpin">
		<Pair>
			<key>normal</key>
			<styleUrl>#sn_ylw-pushpin3</styleUrl>
		</Pair>
		<Pair>
			<key>highlight</key>
			<styleUrl>#sh_ylw-pushpin0</styleUrl>
		</Pair>
	</StyleMap>
	<Style id="sn_ylw-pushpin0">
		<IconStyle>
			<scale>1.1</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff0055ff</color>
		</LineStyle>
		<PolyStyle>
			<color>6e0055ff</color>
		</PolyStyle>
	</Style>
	<StyleMap id="msn_ylw-pushpin0">
		<Pair>
			<key>normal</key>
			<styleUrl>#sn_ylw-pushpin0</styleUrl>
		</Pair>
		<Pair>
			<key>highlight</key>
			<styleUrl>#sh_ylw-pushpin3</styleUrl>
		</Pair>
	</StyleMap>
	<Style id="sn_ylw-pushpin1">
		<IconStyle>
			<scale>1.1</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff00ff55</color>
		</LineStyle>
		<PolyStyle>
			<color>4a00ff55</color>
		</PolyStyle>
	</Style>
	<Style id="sh_ylw-pushpin">
		<IconStyle>
			<scale>1.3</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff00ff55</color>
		</LineStyle>
		<PolyStyle>
			<color>4a00ff55</color>
		</PolyStyle>
	</Style>
	<Style id="sh_ylw-pushpin0">
		<IconStyle>
			<scale>1.3</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff0008ff</color>
		</LineStyle>
		<PolyStyle>
			<color>b40000ff</color>
		</PolyStyle>
	</Style>
	<Style id="sh_ylw-pushpin1">
		<IconStyle>
			<scale>1.3</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff0008ff</color>
		</LineStyle>
		<PolyStyle>
			<color>960000ff</color>
		</PolyStyle>
	</Style>
	<StyleMap id="msn_ylw-pushpin1">
		<Pair>
			<key>normal</key>
			<styleUrl>#sn_ylw-pushpin2</styleUrl>
		</Pair>
		<Pair>
			<key>highlight</key>
			<styleUrl>#sh_ylw-pushpin</styleUrl>
		</Pair>
	</StyleMap>
	<Style id="sn_ylw-pushpin2">
		<IconStyle>
			<scale>1.1</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff00ff55</color>
		</LineStyle>
		<PolyStyle>
			<color>4a00ff55</color>
		</PolyStyle>
	</Style>
	<Style id="sh_ylw-pushpin2">
		<IconStyle>
			<scale>1.3</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff00ff55</color>
		</LineStyle>
		<PolyStyle>
			<color>4a00ff55</color>
		</PolyStyle>
	</Style>
	<Style id="sn_ylw-pushpin3">
		<IconStyle>
			<scale>1.1</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff0008ff</color>
		</LineStyle>
		<PolyStyle>
			<color>b40000ff</color>
		</PolyStyle>
	</Style>
	<StyleMap id="msn_ylw-pushpin2">
		<Pair>
			<key>normal</key>
			<styleUrl>#sn_ylw-pushpin</styleUrl>
		</Pair>
		<Pair>
			<key>highlight</key>
			<styleUrl>#sh_ylw-pushpin1</styleUrl>
		</Pair>
	</StyleMap>
	<StyleMap id="msn_ylw-pushpin3">
		<Pair>
			<key>normal</key>
			<styleUrl>#sn_ylw-pushpin1</styleUrl>
		</Pair>
		<Pair>
			<key>highlight</key>
			<styleUrl>#sh_ylw-pushpin2</styleUrl>
		</Pair>
	</StyleMap>
	<Style id="sh_ylw-pushpin3">
		<IconStyle>
			<scale>1.3</scale>
			<Icon>
				<href>http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png</href>
			</Icon>
			<hotSpot x="20" y="2" xunits="pixels" yunits="pixels"/>
		</IconStyle>
		<LineStyle>
			<color>ff0055ff</color>
		</LineStyle>
		<PolyStyle>
			<color>6e0055ff</color>
		</PolyStyle>
	</Style>
<Placemark>
		<Point>
        	<coordinates>
        		-64.192880,-31.4423055222
			</coordinates>
		</Point>
</Placemark>
<!-- 

 -->
<c:forEach var="zona" items="${zonasCalor}">
<Placemark>
	<name><c:out value="${zona.nombre}"/></name>
	<styleUrl>#<c:out value="${zona.style}"/></styleUrl>
    <c:out value="${zona.rawKmlData}" escapeXml="false"/>
</Placemark> 
</c:forEach>
 
<c:forEach var="lugar" items="${lugares}">
<Placemark>
	<name><c:out value="${lugar.nombre}"/></name>
	<styleUrl>#poly</styleUrl>
    <c:out value="${lugar.rawKmlData}" escapeXml="false"/>
</Placemark>
</c:forEach>    	


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



<!-- 
<Placemark>
    <styleUrl>#poly</styleUrl>
        <Polygon>
            <altitudeMode>relativeToGround</altitudeMode>
            <outerBoundaryIs>
                <LinearRing>
                    <coordinates>
-77.05844056290393,38.86996206506943,400 -77.05552622493516,38.868757801256,400 
-77.05315536854791,38.87053267794386,400 -77.05465973756702,38.87291016281703,400 -77.05788457660967,38.87253259892824,400 -77.05844056290393,38.86996206506943,400 </coordinates>
                </LinearRing>
            </outerBoundaryIs>
        </Polygon>
</Placemark>

<Placemark>
    <styleUrl>#poly</styleUrl>
        <Polygon>
            <altitudeMode>relativeToGround</altitudeMode>
            <outerBoundaryIs>
                <LinearRing>
                    <coordinates>
 -77.05844056290393,38.86996206506943,500 -77.05844056290393,38.86996206506943,400 -77.05552622493516,38.868757801256,400  -77.05552622493516,38.868757801256,500  -77.05844056290393,38.86996206506943,500
</coordinates>
                </LinearRing>
            </outerBoundaryIs>
        </Polygon>
</Placemark>
  -->
</Document>
</kml>

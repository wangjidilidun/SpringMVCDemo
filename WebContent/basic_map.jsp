<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=7, IE=9, IE=10">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1,user-scalable=no"/>
    <title>Simple Map</title>
    <link rel="stylesheet" href="https://js.arcgis.com/3.21/esri/css/esri.css">
    <link rel = "stylesheet" href="https://js.arcgis.com/3.21/dijit/themes/tundra/tundra.css">
    <style>
      html, body, #map2 {
        height: 100%;
        width: 100%;
        margin: 0;
        padding: 0;
      }    
    </style>
    <script src="https://js.arcgis.com/3.21/"></script>
    <script>
      var map;

      require(["esri/map", "dojo/domReady!"], function(Map) {
        map = new Map("map2", {
          basemap: "hybrid",
          center: [116.371499,39.92556], // long, lat
          zoom: 13,
          sliderStyle: "small"
        });
      });
    </script>
  </head>

  <body class="claro">
    <div id="map2"></div>
  </body>
</html>

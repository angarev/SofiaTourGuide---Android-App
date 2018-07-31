package com.sofiatourguide.sofiatourguide;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import org.osmdroid.api.IMapController;
import org.osmdroid.bonuspack.overlays.Marker;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainmapActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmap);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);

        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        IMapController mapController = map.getController();
        mapController.setZoom(12);

        //NIM

        GeoPoint firstPoint = new GeoPoint(42.655156, 23.27091);
        mapController.setCenter(firstPoint);
        mapController.animateTo(firstPoint);

        Marker startMarker = new Marker(map);
        startMarker.setPosition(firstPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        startMarker.setTitle("National History Museum");

        //Basilica
        GeoPoint secondPoint = new GeoPoint(42.696532, 23.33135);
        mapController.setCenter(secondPoint);
        mapController.animateTo(secondPoint);

        Marker secondMarker = new Marker(map);
        secondMarker.setPosition(secondPoint);
        secondMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(secondMarker);
        secondMarker.setTitle("St. Sophia Basilica");

        //Ethnographic Museum
        GeoPoint echoPoint = new GeoPoint(42.696358, 23.32704);
        mapController.setCenter(echoPoint);
        mapController.animateTo(echoPoint);
        Marker echoMarker = new Marker(map);
        echoMarker.setPosition(echoPoint);
        echoMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(echoMarker);
        echoMarker.setTitle("National Gallery");

        //National Archaeological Museum
        GeoPoint archaeologicalPoint = new GeoPoint(42.696142, 23.324329);
        mapController.setCenter(archaeologicalPoint);
        Marker archaeologicalMarker = new Marker(map);
        archaeologicalMarker.setPosition(archaeologicalPoint);
        archaeologicalMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(archaeologicalMarker);
        archaeologicalMarker.setTitle("National Archaeological Museum");

        //Earth and Man National Museum
        GeoPoint earthPoint = new GeoPoint(42.679878, 23.320673);
        mapController.setCenter(earthPoint);
        Marker earthMarker = new Marker(map);
        earthMarker.setPosition(earthPoint);
        earthMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(earthMarker);
        earthMarker.setTitle("Earth and Man National Museum");

        //National Museum of Military History
        GeoPoint militaryPoint = new GeoPoint(42.688721, 23.35114);
        mapController.setCenter(militaryPoint);
        Marker militaryMarker = new Marker(map);
        militaryMarker.setPosition(militaryPoint);
        militaryMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(militaryMarker);
        militaryMarker.setTitle("National Museum of Military History");

        //Museum for Socialist Art
        GeoPoint socialistPoint = new GeoPoint(42.665551, 23.358157);
        mapController.setCenter(socialistPoint);
        Marker socialistMarker = new Marker(map);
        socialistMarker.setPosition(socialistPoint);
        socialistMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(socialistMarker);
        socialistMarker.setTitle("Museum for Socialist Art");

        //Museum of Contemporary Art
        GeoPoint contemporaryPoint = new GeoPoint(42.680424, 23.320177);
        mapController.setCenter(contemporaryPoint);
        Marker contemporaryMarker = new Marker(map);
        contemporaryMarker.setPosition(contemporaryPoint);
        contemporaryMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(contemporaryMarker);
        contemporaryMarker.setTitle("Museum of Contemporary Art");

        //The St.Alexander Nevski Cathedral' s Crypt
        GeoPoint cryptPoint = new GeoPoint(42.695791, 23.332804);
        mapController.setCenter(cryptPoint);
        Marker cryptMarker = new Marker(map);
        cryptMarker.setPosition(cryptPoint);
        cryptMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(cryptMarker);
        cryptMarker.setTitle("The St.Alexander Nevski Cathedral' s Crypt");

        //National Gallery – Square 500
        GeoPoint squarePoint = new GeoPoint(42.696209, 23.33415);
        mapController.setCenter(squarePoint);
        Marker squareMarker = new Marker(map);
        squareMarker.setPosition(squarePoint);
        squareMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(squareMarker);
        squareMarker.setTitle("National Gallery – Square 500");

        //The St.Alexander Nevski Cathedral
        GeoPoint nevskiPoint = new GeoPoint(42.695806, 23.332798);
        mapController.setCenter(nevskiPoint);
        Marker nevskiMarker = new Marker(map);
        nevskiMarker.setPosition(nevskiPoint);
        nevskiMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(nevskiMarker);
        nevskiMarker.setTitle("The St.Alexander Nevski Cathedral");

        //Banya Bashi Mosque
        GeoPoint bashiPoint = new GeoPoint(42.699512, 23.322531);
        mapController.setCenter(bashiPoint);
        Marker bashiMarker = new Marker(map);
        bashiMarker.setPosition(bashiPoint);
        bashiMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(bashiMarker);
        bashiMarker.setTitle("Banya Bashi Mosque");

        //Boyana Church
        GeoPoint boyanaPoint = new GeoPoint(42.644647, 23.266159);
        mapController.setCenter(boyanaPoint);
        Marker boyanaMarker = new Marker(map);
        boyanaMarker.setPosition(boyanaPoint);
        boyanaMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(boyanaMarker);
        boyanaMarker.setTitle("Boyana Church");

        //Catholic Cathedral St. Joseph
        GeoPoint cathedralPoint = new GeoPoint(42.69872, 23.31968);
        mapController.setCenter(cathedralPoint);
        Marker cathedralMarker = new Marker(map);
        cathedralMarker.setPosition(cathedralPoint);
        cathedralMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(cathedralMarker);
        cathedralMarker.setTitle("Catholic Cathedral St. Joseph");

        //St. Nedelya Church
        GeoPoint nedelyaPoint = new GeoPoint(42.696745, 23.321241);
        mapController.setCenter(nedelyaPoint);
        Marker nedelyaMarker = new Marker(map);
        nedelyaMarker.setPosition(nedelyaPoint);
        nedelyaMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(nedelyaMarker);
        nedelyaMarker.setTitle("St. Nedelya Church");


        //Russian Church
        GeoPoint russianPoint = new GeoPoint(42.695694, 23.328939);
        mapController.setCenter(russianPoint);
        Marker russianMarker = new Marker(map);
        russianMarker.setPosition(russianPoint);
        russianMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(russianMarker);
        russianMarker.setTitle("Russian Church");


        //Sofia Synagogue
        GeoPoint synagoguePoint = new GeoPoint(42.700261, 23.320852);
        mapController.setCenter(synagoguePoint);
        Marker synagogueMarker = new Marker(map);
        synagogueMarker.setPosition(synagoguePoint);
        synagogueMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(synagogueMarker);
        synagogueMarker.setTitle("Sofia Synagogue");

        //Rotunda of St. George
        GeoPoint georgePoint = new GeoPoint(42.696906, 23.322896);
        mapController.setCenter(georgePoint);
        Marker georgeMarker = new Marker(map);
        georgeMarker.setPosition(georgePoint);
        georgeMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(georgeMarker);
        georgeMarker.setTitle("Rotunda of St. George");

        //Church of St Paraskeva
        GeoPoint paraskevaPoint = new GeoPoint(42.70124, 23.329049);
        mapController.setCenter(paraskevaPoint);
        Marker paraskevaMarker = new Marker(map);
        paraskevaMarker.setPosition(paraskevaPoint);
        paraskevaMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(paraskevaMarker);
        paraskevaMarker.setTitle("Church of St. Paraskeva");

        //Romanian Orthodox Church
        GeoPoint promanianPoint = new GeoPoint(42.699853, 23.31998);
        mapController.setCenter(promanianPoint);
        Marker promanianMarker = new Marker(map);
        promanianMarker.setPosition(promanianPoint);
        promanianMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(promanianMarker);
        promanianMarker.setTitle("Romanian Orthodox Church");


        //Amphitheater of Serdica
        GeoPoint sofiaPoint = new GeoPoint(42.697451, 23.328318);
        mapController.setCenter(sofiaPoint);
        Marker sofiaMarker = new Marker(map);
        sofiaMarker.setPosition(sofiaPoint);
        sofiaMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(sofiaMarker);
        sofiaMarker.setTitle("Amphitheater of Serdica");

        //Ancient Serdica - East Gate
        GeoPoint serdicaeastPoint = new GeoPoint(42.697431, 23.324124);
        mapController.setCenter(serdicaeastPoint);
        Marker serdicaeastMarker = new Marker(map);
        serdicaeastMarker.setPosition(serdicaeastPoint);
        serdicaeastMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(serdicaeastMarker);
        serdicaeastMarker.setTitle("Ancient Serdica - East Gate");


        //Ancient Serdica - remains of the north wall
        GeoPoint serdicanorthPoint = new GeoPoint(42.69993, 23.321908);
        mapController.setCenter(serdicanorthPoint);
        Marker serdicanorthMarker = new Marker(map);
        serdicanorthMarker.setPosition(serdicanorthPoint);
        serdicanorthMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(serdicanorthMarker);
        serdicanorthMarker.setTitle("Ancient Serdica - remains of the north wall");

        //Ancient Serdica - remains of the Roman city centre
        GeoPoint serdicacenterPoint = new GeoPoint(42.69745, 23.321332);
        mapController.setCenter(serdicacenterPoint);
        Marker serdicacenterMarker = new Marker(map);
        serdicacenterMarker.setPosition(serdicacenterPoint);
        serdicacenterMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(serdicacenterMarker);
        serdicacenterMarker.setTitle("Ancient Serdica - remains of the Roman city centre");


        //Ancient Serdica - Roman baths and a temple
        GeoPoint serdicabathsPoint = new GeoPoint(42.699642, 23.32277);
        mapController.setCenter(serdicabathsPoint);
        Marker serdicabathsMarker = new Marker(map);
        serdicabathsMarker.setPosition(serdicabathsPoint);
        serdicabathsMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(serdicabathsMarker);
        serdicabathsMarker.setTitle("Ancient Serdica - Roman baths and a temple");

        //The Building of Sofia Seminary
        GeoPoint seminaryPoint = new GeoPoint(42.675755, 23.336118);
        mapController.setCenter(seminaryPoint);
        Marker seminaryMarker = new Marker(map);
        seminaryMarker.setPosition(seminaryPoint);
        seminaryMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(seminaryMarker);
        seminaryMarker.setTitle("The Building of Sofia Seminary");

        //The Statue of St. Sofia
        GeoPoint st_sofiaPoint = new GeoPoint(42.697939, 23.321503);
        mapController.setCenter(st_sofiaPoint);
        Marker st_sofiaMarker = new Marker(map);
        st_sofiaMarker.setPosition(st_sofiaPoint);
        st_sofiaMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(st_sofiaMarker);
        st_sofiaMarker.setTitle("The Statue of St. Sofia");


        //The Battenberg Mausoleum
        GeoPoint battenbergPoint = new GeoPoint(42.691536, 23.33279);
        mapController.setCenter(battenbergPoint);
        Marker battenbergMarker = new Marker(map);
        battenbergMarker.setPosition(battenbergPoint);
        battenbergMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(battenbergMarker);
        battenbergMarker.setTitle("The Battenberg Mausoleum");


        //Lion Bridge
        GeoPoint lionPoint = new GeoPoint(42.705091, 23.323873);
        mapController.setCenter(lionPoint);
        Marker lionMarker = new Marker(map);
        lionMarker.setPosition(lionPoint);
        lionMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(lionMarker);
        lionMarker.setTitle("Lion Bridge");

        //Eagle Bridge
        GeoPoint eaglePoint = new GeoPoint(42.690622, 23.33745);
        mapController.setCenter(eaglePoint);
        Marker eagleMarker = new Marker(map);
        eagleMarker.setPosition(eaglePoint);
        eagleMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(eagleMarker);
        eagleMarker.setTitle("Eagle Bridge");

        //Petko Slaveykov Square
        GeoPoint petkoPoint = new GeoPoint(42.692617, 23.323844);
        mapController.setCenter(petkoPoint);
        Marker petkoMarker = new Marker(map);
        petkoMarker.setPosition(petkoPoint);
        petkoMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(petkoMarker);
        petkoMarker.setTitle("Petko Slaveykov Square");

        //Banski Square
        GeoPoint banskiPoint = new GeoPoint(42.699777, 23.322848);
        mapController.setCenter(banskiPoint);
        Marker banskiMarker = new Marker(map);
        banskiMarker.setPosition(banskiPoint);
        banskiMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(banskiMarker);
        banskiMarker.setTitle("Banski Square");


        //Garibaldi Square
        GeoPoint garibaldiPoint = new GeoPoint(42.693807, 23.322671);
        mapController.setCenter(garibaldiPoint);
        Marker garibaldiMarker = new Marker(map);
        garibaldiMarker.setPosition(garibaldiPoint);
        garibaldiMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(garibaldiMarker);
        garibaldiMarker.setTitle("Garibaldi Square");

        //The building of Ivan Vazov National Theatre
        GeoPoint ivanvazovPoint = new GeoPoint(42.694344, 23.326221);
        mapController.setCenter(ivanvazovPoint);
        Marker ivanvazovMarker = new Marker(map);
        ivanvazovMarker.setPosition(ivanvazovPoint);
        ivanvazovMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(ivanvazovMarker);
        ivanvazovMarker.setTitle("The building of Ivan Vazov National Theatre");

        map.invalidate();

    }

}

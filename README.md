# GoogleMapMarkers


the applications helps to load trackers of different places. 


## **ADDING COORDINATES AS LATITUDES AND LONGITUDES**

We use the following code to create markers position

```
// Starting the coordinates Strings

    private static final LatLng Thai = new LatLng(-1.2885061,36.8192397);
    private static final LatLng Tin = new LatLng(-1.2895481,36.8209602);
    private static final LatLng Kilimanjaro = new LatLng(-1.2878796,36.817894);
    private static final LatLng Bhandini = new LatLng(-1.2903792,36.8177583);
    private static final LatLng JavaHouse = new LatLng(-1.2883569,36.823042);
    private static final LatLng Hamdi = new LatLng(-1.2883071,36.8225929);
    private static final LatLng Berbers = new LatLng(-1.2902842,36.8237106);
    private static final LatLng Smothers = new LatLng(-1.2878401,36.8182002);
    private static final LatLng Ankara = new LatLng(-1.2883561,36.820183);
    private static final LatLng Angithi = new LatLng(-1.2898624,36.8235066);
```


## adding Markers to Map

we add markers to the map through

```
mThai= mMap.addMarker(new MarkerOptions().position(Thai).title(" Thai Chi Restaurant"));
mAngithi=mMap.addMarker(new MarkerOptions().position(Angithi).title("Anghiti Restaurant"));
mAnkara= mMap.addMarker(new MarkerOptions().position(Ankara).title("Ankara Food Court"));
        
```

## Setting the Zoom level


we set the zoom level by adding the following code

```
mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Hamdi,25));
```


## Adding Googlr Map api
```
<string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">*****</string>
```

## add internet and location permissions

```
 <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
 <uses-permission-sdk-23 android:name="android.permission.INTERNET"/>
 ```

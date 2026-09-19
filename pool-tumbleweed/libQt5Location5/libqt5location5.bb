SUMMARY = "Qt 5 Location Library"
DESCRIPTION = "The Qt Location API facilitates creating mapping solutions using \
the data available from some contemporary location services. \
Using Qt Location, one can \
 \
 * access and present map data, \
 * support touch gesture on a specific area of the map, \
 * query for a specific geographical location and route, \
 * add additional layers on top, such as polylines and circles, \
 * and search for places and related images."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde7"

RPM_NAME = "libQt5Location5-5.15.19+kde7-1.2.aarch64.rpm"
RPM_HASH = "5021499c33b73232be8fe9d387f4b8edd3bc711a9de8d67dee944e06e981f2d724b00d8202ce5fd69b0205cdf9d2d9eb682731e434c18ce06837db6a445630b0"

RPROVIDES:${PN} += "libQt5Location.so.5 \
libQt5Location5 \
libdeclarative-location.so \
liblocationlabsplugin.so \
libqtgeoservices-esri.so \
libqtgeoservices-itemsoverlay.so \
libqtgeoservices-mapbox.so \
libqtgeoservices-mapboxgl.so \
libqtgeoservices-nokia.so \
libqtgeoservices-osm.so \
qt5qmlimport-Qt.labs.location.1 \
qt5qmlimport-QtLocation.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5PositioningQuick.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

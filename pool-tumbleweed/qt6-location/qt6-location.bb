SUMMARY = "Qt 6 Location plugins and libraries"
DESCRIPTION = "The Qt Location API helps creating mapping solutions using the data available \
from some of the popular location services."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-location-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9722e3a63eb5c052739d27fa586acf38b4d8d63ff3e0e073681e2a15941055890801862dce90bcb25f02cdafb2536153eda08ae5729c6b5cf559ee1f4cfa18e3"

RPROVIDES:${PN} += "libdeclarative-locationplugin.so \
libqtgeoservices-itemsoverlay.so \
libqtgeoservices-osm.so \
qt6-location \
qt6qmlimport-QtLocation \
qt6qmlimport-QtLocation.2 \
qt6qmlimport-QtLocation.5 \
qt6qmlimport-QtLocation.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Location.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.animation \
qt6qmlimport-QtPositioning \
qt6qmlimport-QtQuick"

inherit rpm

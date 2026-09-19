SUMMARY = "GPS log file visualization and analysis tool"
DESCRIPTION = "GPXSee is a Qt-based tool for visualizing and analyzing GPX, TCX, FIT, KML, \
IGC, CUP, NMEA, SLF, SML, LOC, OziExplorer (PLT, RTE, WPT), Garmin GPI&CSV, \
TomTom OV2&ITN, ONmove OMD/GHP and geotagged JPEG files."
LICENSE = "GPL-3.0-only"

PV = "16.15"

RPM_NAME = "gpxsee-16.15-1.1.aarch64.rpm"
RPM_HASH = "aa299fcc64241f72af1419d4e089ee622d6def59ad4a9185257874f1e6c087af70d99dc4949423d039afe59f7f1ad519d3bac06a68453c7960b1ed407ec30b9e"

RPROVIDES:${PN} += "gpxsee"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Positioning.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

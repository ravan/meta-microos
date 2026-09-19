SUMMARY = "Multiactivity educational software for children aged 2–10 (Qt version)"
DESCRIPTION = "GCompris-Qt is an educational software suite comprising \
of numerous activities for children aged 2 to 10. Some of the \
activities are game orientated, but nonetheless still educational. \
 \
Currently, GCompris offers in excess of 100 activities. New \
activities can be added, and an activity can implement its own game \
scheme."
LICENSE = "AGPL-3.0-or-later & CC-BY-4.0 & Apache-2.0 & MPL-2.0 & OFL-1.1 & GFDL-1.2-or-later & MIT & CC0-1.0 & BSD-2-Clause & BSD-3-Clause"

PV = "26.1"

RPM_NAME = "gcompris-qt-26.1-1.2.aarch64.rpm"
RPM_HASH = "67238538dd3e9cc9cfec20c4c7e84f107dc01306a77c2069bfc4aba3ccc20c464b569b91d963c4f1b6a7a448ff077d15a5edb5486eda7e380fa14bb2e65e31dd"

RPROVIDES:${PN} += "gcompris \
gcompris-qt"

RDEPENDS:${PN} += "gcompris-qt-activities \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Ditigizer software that converts old graphs into numbers again"
DESCRIPTION = "This digitizing software converts an image file, showing a graph or \
map, into numbers. The image file can come from a scanner, digital \
camera or screenshot. The numbers can be read on the screen, and \
written or copied to a spreadsheet."
LICENSE = "GPL-2.0-or-later"

PV = "12.9.1"

RPM_NAME = "engauge-digitizer-12.9.1-2.2.aarch64.rpm"
RPM_HASH = "5578e1d02e3edf6ffd90eebab81704b279d24513290be4fa5174ab7d5d61a42ed20907f78ccba344b74447502b5e6aa17a6075ec4a9c48e8ddd9e39994db2622"

RPROVIDES:${PN} += "engauge-digitizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libopenjp2.so.7 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm

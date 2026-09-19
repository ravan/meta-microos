SUMMARY = "Graphical interface for GPS Correlate"
DESCRIPTION = "GPS Correlate stamps the location recorded in a GPS track into the EXIF \
GPS tags of digital photos taken at the same time. \
 \
This package contains the GTK graphical user interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "gpscorrelate-gui-2.3-1.1.aarch64.rpm"
RPM_HASH = "1630c5a937abcee33e723010a3363da37e127a9530ae22ebbdef9b1ec289ea488207a0de2ba0dc50d040a7fe29d27134a1f74a7e5217dabdbb7ec931e6598c92"

RPROVIDES:${PN} += "gpscorrelate-gui"

RDEPENDS:${PN} += "gpscorrelate \
gpscorrelate-doc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm

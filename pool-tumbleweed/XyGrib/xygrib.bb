SUMMARY = "A weather visualization package"
DESCRIPTION = "XyGrib is a weather visualization package that interacts with \
OpenGribs's Grib server providing a choice of global and large area \
atmospheric and wave models. \
 \
XyGrib also uses pre-cut Gribs of high-resolution regional models \
found on OpenSkiron.org."
LICENSE = "GPL-3.0-only"

PV = "1.2.6.1"

RPM_NAME = "XyGrib-1.2.6.1-8.11.aarch64.rpm"
RPM_HASH = "a5f13b1d75a0c6b6d200db5e0513b3dafaaa90c1920e4ad839f2d1155fb24b67deadaf24f3e7b89e850e4221902d0a5c538ecea94c619a51db986165bd60d7d5"

RPROVIDES:${PN} += "XyGrib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libopenjp2.so.7 \
libpng16.so.16 \
libproj.so.25 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

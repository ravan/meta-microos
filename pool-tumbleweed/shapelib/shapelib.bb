SUMMARY = "Library for ESRI Shapefile Handling"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the executable programs."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.6.3"

RPM_NAME = "shapelib-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "01299fa8800fcc25ba52e234b6b681df15ac09cd613f207f8353477355bec30adc3065cc466d46b018a4a025b37b50575f301894d7730c6ead0a5d2e1f92c6af"

RPROVIDES:${PN} += "shapelib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libshp.so.4 \
libstdc++.so.6"

inherit rpm

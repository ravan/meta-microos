SUMMARY = "Library for ESRI Shapefile Handling"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the dynamic link library for shapelib project."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.6.3"

RPM_NAME = "libshp4-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "2ac3818120e822ba09239542505fd0b329b63f017d7ce9b7d855cd40816fb3221b365b7cc453ae8e1462ca155c11cb61e41060d7b40375a0b718aa81031d10f6"

RPROVIDES:${PN} += "libshp.so.4 \
libshp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

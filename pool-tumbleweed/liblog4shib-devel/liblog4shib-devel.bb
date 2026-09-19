SUMMARY = "Development tools for Log for C++"
DESCRIPTION = "The static libraries and header files needed for development with log4shib."
LICENSE = "LGPL-2.1-only"

PV = "2.0.1"

RPM_NAME = "liblog4shib-devel-2.0.1-2.9.aarch64.rpm"
RPM_HASH = "5cd93526f2372f4a3406e30ce3ac2ac4cfd0877701de01bf49342b7beee89eb9503d06d40396fe435ddc6f5fb873ad100acce30f796cff101c049f281d43f693"

RPROVIDES:${PN} += "liblog4shib-devel \
log4shib-devel \
pkgconfig-log4shib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libboost-thread-devel \
liblog4shib2"

inherit rpm

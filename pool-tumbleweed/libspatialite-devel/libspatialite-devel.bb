SUMMARY = "Development files for libspatialite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libspatialite."
LICENSE = "MPL-1.1"

PV = "5.1.0"

RPM_NAME = "libspatialite-devel-5.1.0-1.14.aarch64.rpm"
RPM_HASH = "3f964001f64e0917c11f31926f602b4db7dbcf609b0ed2838ba95217a6bca9c0eb9c78c062533a75a429cd42ec960bdf8f281ad7aa7d5d3c3be47ba6608c71f2"

RPROVIDES:${PN} += "libspatialite-devel \
pkgconfig-spatialite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspatialite8 \
pkgconfig-freexl \
pkgconfig-libxml-2.0 \
pkgconfig-minizip \
pkgconfig-proj \
pkgconfig-rttopo"

inherit rpm

SUMMARY = "Development files for wimlib"
DESCRIPTION = "Development files for wimlib"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.14.4"

RPM_NAME = "wimlib-devel-1.14.4-1.13.aarch64.rpm"
RPM_HASH = "855f72791fae760ce1e47e351748c06d9411b809c4ba8e166e6f0ee3dada8c57086d5b6dbb79cf2032a0b0c092a09ed1a2b8da5812204eee1ae0443ae2caddf9"

RPROVIDES:${PN} += "pkgconfig-wimlib \
wimlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwim15 \
pkgconfig-fuse \
pkgconfig-libntfs-3g"

inherit rpm

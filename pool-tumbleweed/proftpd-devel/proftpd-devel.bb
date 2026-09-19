SUMMARY = "Development files for ProFTPD"
DESCRIPTION = "This package contains Development files for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-devel-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "a8f9b39a6586e8922f1a654b024b097c7c1c9353aaa23ce2dc881e06053fecb2d7d1555cdb2eeae7871b84642c45e9954335081d5e362f14f0a8fcacea3a1f43"

RPROVIDES:${PN} += "pkgconfig-proftpd \
proftpd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
proftpd"

inherit rpm

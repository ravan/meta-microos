SUMMARY = "Development files for libfakekey"
DESCRIPTION = "The libfakekey-devel package contains libraries and header files for \
developing applications that use libfakekey."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3"

RPM_NAME = "libfakekey-devel-0.3-2.9.aarch64.rpm"
RPM_HASH = "0d7af7ba6732406522faeba97cf294dcd0fad7619af1af50263058962cda4b1b599127326534a690909c96448da673fff6262f72017a1c54b0fef2d5c0aede67"

RPROVIDES:${PN} += "libfakekey-devel \
pkgconfig-libfakekey"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfakekey0"

inherit rpm

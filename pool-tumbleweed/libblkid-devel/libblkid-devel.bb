SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libblkid-devel-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "5261f49959fbf54109638874ef7ea9d9e085632aea3765c795ef324e3fc313e1978ff06c3c1f16e1b9409c453c0e3bba509a1a026cbda931a25e3d48efcbc0a8"

RPROVIDES:${PN} += "libblkid-devel \
pkgconfig-blkid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1 \
pkgconfig-libeconf"

inherit rpm

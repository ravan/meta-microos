SUMMARY = "Libraries and Header Files to Develop Programs with tdb1 Support"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains libraries and header files need for development."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.15"

RPM_NAME = "libtdb-devel-1.4.15-1.3.aarch64.rpm"
RPM_HASH = "11e3b00ee134855f11b8dc6a084d9c4025e91219510797305a05284d638b30f1c44a7b1ecd2ceb8f1a833fc4c2312e2cd93b71378a0ae68489821435e60f4bf3"

RPROVIDES:${PN} += "libtdb-devel \
pkgconfig-tdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtdb1 \
pkgconfig"

inherit rpm

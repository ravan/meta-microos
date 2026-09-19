SUMMARY = "Samba Trivial Database"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains the tdb1 library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.15"

RPM_NAME = "libtdb1-1.4.15-1.3.aarch64.rpm"
RPM_HASH = "53bd2290698e54df69dbb5f98e09030d2c15b82c2169734583420f8fe83e926e2c90629e7e8731682301d00aa3fb48c676f67234d16e4a6cf7085d2a4e096ba9"

RPROVIDES:${PN} += "libtdb.so.1 \
libtdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

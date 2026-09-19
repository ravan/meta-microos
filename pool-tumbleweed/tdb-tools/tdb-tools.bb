SUMMARY = "Tools to manipulate tdb files"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains tools to manage Tdb files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.15"

RPM_NAME = "tdb-tools-1.4.15-1.3.aarch64.rpm"
RPM_HASH = "1646e018f88438fa45686f21007221e8b9a3ec3f9c17110c2585bed14f0fbf5dfbb81c2478b2000d10b302c89ca68ad1705ccf65a4af89503604b0844d6b60de"

RPROVIDES:${PN} += "tdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtdb.so.1"

inherit rpm

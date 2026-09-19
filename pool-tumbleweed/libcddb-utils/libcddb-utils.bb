SUMMARY = "CDDB Access Library Utilities"
DESCRIPTION = "Libcddb is a library that implements the different protocols (CDDBP, \
HTTP, and SMTP) to access data on a CDDB server (http://freedb.org). It \
tries to be as cross-platform as possible."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libcddb-utils-1.3.2-30.5.aarch64.rpm"
RPM_HASH = "64d83bdd3d89d0ac6406e4b473d3b2b63782c30c2c7a05d273a33dad6707e3cfbf1b086bc455927edfb637e0e581ce14c5bfd86b60d40f1984b3b2ff2c80f787"

RPROVIDES:${PN} += "libcddb-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcddb.so.2 \
libcdio.so.19"

inherit rpm

SUMMARY = "Library for Neighbor Discovery Protocol"
DESCRIPTION = "This package contains a library which provides a wrapper for IPv6 Neighbor \
Discovery Protocol.  It also provides a tool named ndptool for sending and \
receiving NDP messages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9"

RPM_NAME = "libndp-1.9-1.2.aarch64.rpm"
RPM_HASH = "25fa907eb67d840158b3193fab677b9dd493ffcd1a0027bd56d2688661af3a3c305f72504c906b1901906cde599bf5a24a3b35c2d4db23c858a6a2a5fbd1af02"

RPROVIDES:${PN} += "libndp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libndp.so.0"

inherit rpm

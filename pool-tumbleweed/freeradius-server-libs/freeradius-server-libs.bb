SUMMARY = "FreeRADIUS shared library"
DESCRIPTION = "The FreeRADIUS shared libraries."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-libs-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "bbf76e0ea91c911a2564220667bac3703c2d9e440557feb93e2f043a9461fc4b5bdbda5abf81df939d8ed792b99348c022e7288f3cfe3e8ecc7f51996b2897e6"

RPROVIDES:${PN} += "freeradius-server-libs \
libfreeradius-dhcp.so \
libfreeradius-eap.so \
libfreeradius-radius.so \
libfreeradius-server.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcap.so.1 \
libtalloc.so.2"

inherit rpm

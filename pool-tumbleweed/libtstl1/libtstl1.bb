SUMMARY = "Server library for twin"
DESCRIPTION = "Server library for twin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+161"

RPM_NAME = "libtstl1-0.9.0+161-1.5.aarch64.rpm"
RPM_HASH = "e6d60b83182b97a7e81ab5a6087f08c58ecd83f59b2e8c398faee050e7b977dae3100b5ee96b9a9c94811b6a590c5132ce091f94a4acd54615a3e988c4fdf25e"

RPROVIDES:${PN} += "libtstl.so.1 \
libtstl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

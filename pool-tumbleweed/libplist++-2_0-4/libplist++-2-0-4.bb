SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libplist++-2_0-4-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "a614a44e0f88a41589a2d3ddb54dd3e74507d99ef58be4430f66d658e5b3b9b54210d30a9a26d8fa2af55d54aac4431c8d0d16fd507feff70612a89d4112dfc9"

RPROVIDES:${PN} += "libplist++-2-0-4 \
libplist++-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplist-2.0.so.4 \
libstdc++.so.6"

inherit rpm

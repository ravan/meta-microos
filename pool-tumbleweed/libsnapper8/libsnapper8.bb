SUMMARY = "Library for filesystem snapshot management"
DESCRIPTION = "This package contains libsnapper, a library for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "libsnapper8-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "f61efbb1878c47f154c5fdd572593284cbdc13bb30331c9d585e59b802d8d51cb73979ce0b9229695c6c1e71e6b8306fb92f1744fab4de57874f37ff1e1996b8"

RPROVIDES:${PN} += "libsnapper.so.8 \
libsnapper8"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libboost-thread.so.1.91.0 \
libbtrfs.so.0 \
libbtrfsutil.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmount.so.1 \
libselinux.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1 \
util-linux"

inherit rpm

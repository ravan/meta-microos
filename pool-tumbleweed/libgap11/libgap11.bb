SUMMARY = "Kernel for the GAP computation algebra system"
DESCRIPTION = "This package contains the GAP kernel in a C library that can be \
linked to."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.1"

RPM_NAME = "libgap11-4.16.1-1.1.aarch64.rpm"
RPM_HASH = "467a86e57a6ae91493f0a9a343471cfc39b5cc2aa893f4ed6151c804a5e80ce329d077f3acd2aa42d87dbadab1e9d7edce62bb28f656ace2978a7bb6c8d800f5"

RPROVIDES:${PN} += "libgap.so.11 \
libgap11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm

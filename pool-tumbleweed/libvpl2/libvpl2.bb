SUMMARY = "oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "The oneAPI Video Processing Library (oneVPL) provides a single video processing \
API for encode, decode, and video processing that works across a wide range of \
accelerators."
LICENSE = "MIT"

PV = "2.17.0"

RPM_NAME = "libvpl2-2.17.0-1.2.aarch64.rpm"
RPM_HASH = "d985117b16c86af290c7f87f773164579af2d7d98fe7ccdc0111d30f524859c698a495844739b115b731915ab027f9b5438fb72bc5d7d425433e162facb51c65"

RPROVIDES:${PN} += "libvpl.so.2 \
libvpl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

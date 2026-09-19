SUMMARY = "C library for learning video game programming"
DESCRIPTION = "A C library for learning video game programming."
LICENSE = "Zlib"

PV = "6.0"

RPM_NAME = "libraylib600-6.0-1.4.aarch64.rpm"
RPM_HASH = "47da90c89ade315ff75f29d1f358a77bfd85c15a43d8452f66ce5ecb93882cac6453de7f3dd1f0518398564a3f6e6d6ba0fe586304b2362324405a0f469022c7"

RPROVIDES:${PN} += "libraylib.so.600 \
libraylib600"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm

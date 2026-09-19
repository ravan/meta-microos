SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.3.3"

RPM_NAME = "libz-ng2-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "35a6ca30d2a8cef68e961c39389f5593dec8fd20c9daf3f09f3160be168e91bcd5f652537e941088a141b870b1ebfde019df72f10b85f52bcf48eaee0aa6d5de"

RPROVIDES:${PN} += "libz-ng.so.2 \
libz-ng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "8.3.2"

RPM_NAME = "libjpeg8-8.3.2-85.1.aarch64.rpm"
RPM_HASH = "8afab742d99be5f9bf72b5b2af649d78ad37195b92fa55e31cd426e34bc0dea5c77acc22fe99a166649db13ffedce829791cb0e69833ffbc52f5b08f5573c7d5"

RPROVIDES:${PN} += "libjpeg.so.8 \
libjpeg8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

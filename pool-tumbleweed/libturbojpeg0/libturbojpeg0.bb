SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "8.3.2"

RPM_NAME = "libturbojpeg0-8.3.2-85.1.aarch64.rpm"
RPM_HASH = "d4ab594e26d1076a8072693813d38bd0740ca39bdbfab77fa76910c5afb7d7ecb9ca667739b0fcf6843a2937f97280b34edbff55679233d15aa542863e424303"

RPROVIDES:${PN} += "libturbojpeg.so.0 \
libturbojpeg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

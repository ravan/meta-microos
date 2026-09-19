SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "62.4.0"

RPM_NAME = "libjpeg62-62.4.0-85.1.aarch64.rpm"
RPM_HASH = "84b69064062e7d2daa98788fecfe78725d7561dd7ee09c799cf96d340a3b89862546ded7ad0e11d338ed5da0fb54093e9358c2dfb269c69f776977fb2e4600d0"

RPROVIDES:${PN} += "libjpeg.so.62 \
libjpeg62"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

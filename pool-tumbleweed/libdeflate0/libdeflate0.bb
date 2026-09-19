SUMMARY = "Library for DEFLATE/zlib/gzip compression and decompression"
DESCRIPTION = "libdeflate is a library for whole-buffer DEFLATE-based compression \
and decompression. It supports raw, zlib-wrapped and gzip-wrapped DEFLATE. \
It is significantly faster than the zlib library: \
 \
 - decompression speedup over gzip-1.10 is 2.28x (generic), 2.87x (AVX2) \
 - compression speedup over gzip is 1.72x (generic), 2.23x (AVX2) \
 \
In addition, libdeflate provides optional high compression modes \
above zlib's 'level 9'."
LICENSE = "BSD-2-Clause"

PV = "1.25"

RPM_NAME = "libdeflate0-1.25-1.4.aarch64.rpm"
RPM_HASH = "6e85b8b0c1a44ba6061099ba36eb0d7fa5ffda5cd2e510f5c82380c810e489b834b63ce64428d5ce09903014995a51b3c3ffc59af1464a28b8596cff6727d3c0"

RPROVIDES:${PN} += "libdeflate.so.0 \
libdeflate0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

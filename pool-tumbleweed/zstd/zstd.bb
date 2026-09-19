SUMMARY = "Zstandard compression tools"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments. \
Decompression speed is preserved and remains roughly the same at all \
settings, a property shared by most LZ compression algorithms, such \
as zlib or lzma. \
 \
At roughly the same ratio, zstd (v1.4.0) achieves ~870% faster \
compression than gzip. For roughly the same time, zstd achieves a \
~12% better ratio than gzip. LZMA outperforms zstd by ~10% faster \
compression for same ratio, or ~1–4% size reduction for same time."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.7"

RPM_NAME = "zstd-1.5.7-6.1.aarch64.rpm"
RPM_HASH = "3d6dd8bb32ad7245edc388c0e6542504c04bcbd963b3079d26a6f201a4e996cef47b26d270dfd41d7471487cf32aaeb2e9a762d0a2e4669d66c8fb2bc8385e69"

RPROVIDES:${PN} += "zstd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm

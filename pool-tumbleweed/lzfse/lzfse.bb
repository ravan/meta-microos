SUMMARY = "Reference C implementation of the Lempel-Ziv Finite State Entropy compressor"
DESCRIPTION = "LZFSE is a Lempel-Ziv style data compression algorithm using Finite State \
Entropy coding. It targets similar compression rates at higher compression \
and decompression speed compared to deflate using zlib."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "lzfse-1.0-3.3.aarch64.rpm"
RPM_HASH = "80364cfe3b00458bda2579e6ca0aaf21737a76c5da9c86d4d637492089b6f0c6327a2cab5667dcb8cacceca3b0db6f2dd7fe270fa8d4d0599b04f1a418313fee"

RPROVIDES:${PN} += "liblzfse.so \
lzfse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

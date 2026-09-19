SUMMARY = "Hash-based Predictive Lempel–Ziv compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
LZP2 fork and provides better compression ratio for text files. \
 \
This subpackage provides a GPL command-line utility to make use of \
the LZ4 algorithm."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "lz4-1.10.0-2.10.aarch64.rpm"
RPM_HASH = "73d1594154ec053e5c9715eaf1be8faa591994fe3cbc3503263d00ffef133388c17f00dcdf5fb69938cdf8438f62948357b27948d78f0e79ad994d8ff52922fe"

RPROVIDES:${PN} += "lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

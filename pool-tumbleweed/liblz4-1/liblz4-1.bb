SUMMARY = "Hash-based predictive Lempel-Ziv compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
 \
This subpackage contains the (de)compressor code as a shared library."
LICENSE = "BSD-2-Clause"

PV = "1.10.0"

RPM_NAME = "liblz4-1-1.10.0-2.10.aarch64.rpm"
RPM_HASH = "46d028c96348d5d06012677f31c2d6771b483df7b51b9d5680af80dfca666d45a743ee71007cb791bebaea9b6dbf8903749c1b1909801d544fc0d6110454e83f"

RPROVIDES:${PN} += "liblz4-1 \
liblz4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

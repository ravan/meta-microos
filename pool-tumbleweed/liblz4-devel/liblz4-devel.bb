SUMMARY = "Development files for the LZ4 compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblz4."
LICENSE = "BSD-2-Clause"

PV = "1.10.0"

RPM_NAME = "liblz4-devel-1.10.0-2.10.aarch64.rpm"
RPM_HASH = "ba4adf5e379e10adede334b5cc4bcb3df1e936bfd349f1edab3224ae55b18256ed6d466650758aac62b378e367c71bea46ac2d1b8c593a78c4b4abedf0a7aa6e"

RPROVIDES:${PN} += "cmake-lz4 \
liblz4-devel \
pkgconfig-liblz4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblz4-1"

inherit rpm

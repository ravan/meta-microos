SUMMARY = "Lossless Compression Algorithm"
DESCRIPTION = "This package contains the brotli command line utility to compress and \
decompress data with the brotli compression algorithm. \
 \
Brotli is a generic-purpose lossless compression algorithm that \
compresses data using a combination of a modern variant of the LZ77 \
algorithm, Huffman coding and 2nd order context modeling, with a \
compression ratio comparable to the best currently available \
general-purpose compression methods. It is similar in speed with \
deflate but offers more dense compression. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "brotli-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "b0511906653ac976a4b0981ba00154c53f36459359eeb62a16fd87a5a66d2e98d21b5fe9d3d63d26838cfd9b0f9a2761c08c994eec6e9c91746c875e482ef21a"

RPROVIDES:${PN} += "brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6"

inherit rpm

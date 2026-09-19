SUMMARY = "NGINX module for Brotli compression"
DESCRIPTION = "ngx_brotli is a set of two nginx modules: \
 \
* ngx_brotli filter module - used to compress responses on-the-fly, \
* ngx_brotli static module - used to serve pre-compressed files. \
 \
Brotli is a generic-purpose lossless compression algorithm that \
compresses data using a combination of a modern variant of the LZ77 \
algorithm, Huffman coding and 2nd order context modeling."
LICENSE = "BSD-2-Clause"

PV = "1.0.0~rc+git9"

RPM_NAME = "nginx-module-brotli-1.0.0~rc+git9-1.21.aarch64.rpm"
RPM_HASH = "8537e56118d2778b1819ee433c145e806f02f27c72b3379b0ad283a6a5d81e701a261feac47053b47f318a53a853cef7b4d0541c21fce9991e35a3180b7fb044"

RPROVIDES:${PN} += "nginx-module-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
nginx"

inherit rpm

SUMMARY = "Library for Brotli Decompression"
DESCRIPTION = "Decompression library for the Brotli general purpose lossless data \
compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libbrotlidec1-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "f9a5ca0310ee3853c6e5a137cad0abf6262566e81d41627f9a77c706ef687ab0ec1592a7b4c8bf27617240fc1fb5f06b21938072606c3c3878e25255b86c93df"

RPROVIDES:${PN} += "libbrotlidec.so.1 \
libbrotlidec1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlicommon.so.1 \
libc.so.6"

inherit rpm

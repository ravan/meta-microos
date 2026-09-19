SUMMARY = "Library for Brotli Compression"
DESCRIPTION = "Compression library for the Brotli general purpose lossless data \
compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libbrotlienc1-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "9024a60b5e6a1163199303b58d58bf7f3ef71a1396d59d08cddbcf540eac7c8b966c79586717f1e0e673afded6c0b5dfe8e9173b625e129f5b6dc9919689d310"

RPROVIDES:${PN} += "libbrotlienc.so.1 \
libbrotlienc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlicommon.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

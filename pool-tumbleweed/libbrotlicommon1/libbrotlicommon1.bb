SUMMARY = "Common Library for Brotli Compression"
DESCRIPTION = "Common library for the Brotli general purpose lossless data \
compression algorithm."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libbrotlicommon1-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "fe9bfab946748197e118cd752a2dd527001e1595e738bbdca76be95a4d433a5526aca90b7d0005d3948385598f33acbf2fcc87cf6565c5af1c809cf1a9f5d574"

RPROVIDES:${PN} += "libbrotlicommon.so.1 \
libbrotlicommon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

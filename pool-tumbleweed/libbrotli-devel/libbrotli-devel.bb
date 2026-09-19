SUMMARY = "Development and Header Files for Brotli Compression"
DESCRIPTION = "Development and headers files for (de)compressing data using the \
Brotli general purpose lossless compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libbrotli-devel-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "9f417b355f916742a2d3497f8fe5c29b5a1387df235f87f3e88b8a57bda81ce9439a2509f91ce8b763c23a98420136e46ca1af09dcf27b52aa7c30114544f88e"

RPROVIDES:${PN} += "libbrotli-devel \
libbrotlicommon-devel \
libbrotlidec-devel \
libbrotlienc-devel \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbrotlicommon1 \
libbrotlidec1 \
libbrotlienc1 \
pkgconfig-libbrotlicommon"

inherit rpm

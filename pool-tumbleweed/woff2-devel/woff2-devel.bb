SUMMARY = "Development files for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains development files for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "woff2-devel-1.0.2-6.5.aarch64.rpm"
RPM_HASH = "7288a83a693b30e526dda1cc1224e1f24166b9c7cf2a19dd08aa0db2f052b6d108106fabec17b705f82f024090f695c5bf4a157ccfd9096928afe7a03ec4354f"

RPROVIDES:${PN} += "pkgconfig-libwoff2common \
pkgconfig-libwoff2dec \
pkgconfig-libwoff2enc \
woff2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwoff2common1-0-2 \
libwoff2dec1-0-2 \
libwoff2enc1-0-2 \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libwoff2common"

inherit rpm

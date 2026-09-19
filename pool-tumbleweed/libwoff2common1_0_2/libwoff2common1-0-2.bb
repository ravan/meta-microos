SUMMARY = "Shared library for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains the shared library for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libwoff2common1_0_2-1.0.2-6.5.aarch64.rpm"
RPM_HASH = "c6b130ff5c2fbf58ccb73ea8b11e309aa9113d4ac0be82c830d5dfdae7a98968b76ef3c4b77d31ed46de2f413931cfa8eb9c8423cc286dccc33e46f0f09626b7"

RPROVIDES:${PN} += "libwoff2common.so.1.0.2 \
libwoff2common1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

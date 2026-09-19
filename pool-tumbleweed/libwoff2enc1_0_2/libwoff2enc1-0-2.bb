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

RPM_NAME = "libwoff2enc1_0_2-1.0.2-6.5.aarch64.rpm"
RPM_HASH = "ec90ab234c86d9aae35fef1dc59703078ed035228002307c63a63facfbd2fb7d898573e24ba8f1120bcc434e76f54e8ec6d1eda64c864d07c7d6998ad9123ab4"

RPROVIDES:${PN} += "libwoff2enc.so.1.0.2 \
libwoff2enc1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwoff2common.so.1.0.2"

inherit rpm

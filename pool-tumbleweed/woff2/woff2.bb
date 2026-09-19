SUMMARY = "Web Open Font Format 2.0 library"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "woff2-1.0.2-6.5.aarch64.rpm"
RPM_HASH = "1c71788dec4ac64395653670847e6d99ce9d102539b4ddcc6a75e8e2383123d074ecd8c6eb1c787a26e66d89301e2cacb01a09ad851ecfaa5c8d795f4c46a18a"

RPROVIDES:${PN} += "woff2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwoff2common.so.1.0.2 \
libwoff2dec.so.1.0.2 \
libwoff2enc.so.1.0.2"

inherit rpm

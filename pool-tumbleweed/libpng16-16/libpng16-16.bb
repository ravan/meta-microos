SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "libpng-2.0"

PV = "1.6.58"

RPM_NAME = "libpng16-16-1.6.58-2.1.aarch64.rpm"
RPM_HASH = "2832a0c10ac07f6e634d5cc9b82b0b1b142e4ce47749995d9d429e6922eedfa18f1586f37e7c770318b50bf5c5388834b3086be33e2e60aac3ab0af5fbc83bcc"

RPROVIDES:${PN} += "libpng \
libpng16-16 \
libpng16.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm

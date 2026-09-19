SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-0-1.2.59-6.2.aarch64.rpm"
RPM_HASH = "2b85b78d85214efdd43c9526b5db562f54b263962b17d737ec71049b253da3664c0256dffd1aa9e24ea465fde9abb86d6eea7c3a536f7f513927f7f2f1506e01"

RPROVIDES:${PN} += "libpng \
libpng12-0 \
libpng12.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm

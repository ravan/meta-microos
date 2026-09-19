SUMMARY = "Library for Mifare card manipulations"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare0-0.4.0-5.8.aarch64.rpm"
RPM_HASH = "8c451912342eb6534207b08e01906daac745d8e98b25aa6206b4e20dafba35f7562239871f85b2bfe135b555472f7a29056843b559ccffb462a085b8b6465736"

RPROVIDES:${PN} += "libfreefare.so.0 \
libfreefare0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnfc.so.6"

inherit rpm

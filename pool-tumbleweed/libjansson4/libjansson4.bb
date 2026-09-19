SUMMARY = "C library for encoding, decoding and manipulating JSON data"
DESCRIPTION = "Jansson is a C library for encoding, decoding and manipulating JSON data. \
It features: \
 * Simple and intuitive API and data model \
 * Comprehensive documentation \
 * No dependencies on other libraries \
 * Full Unicode support (UTF-8) \
 * Extensive test suite"
LICENSE = "MIT"

PV = "2.15.1"

RPM_NAME = "libjansson4-2.15.1-1.2.aarch64.rpm"
RPM_HASH = "c5e734ca29355eb761243b6505c74da7fce934b187156de45c7bd397a3d216563fbe00ea4f9b223c77ce194e49687417aceb8f102c83d9a9bb8a221f5705eba5"

RPROVIDES:${PN} += "libjansson.so.4 \
libjansson4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

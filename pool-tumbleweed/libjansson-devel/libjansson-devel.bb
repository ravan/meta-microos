SUMMARY = "Development files for libjansson"
DESCRIPTION = "Jansson is a C library for encoding, decoding and manipulating JSON data. \
It features: \
 * Simple and intuitive API and data model \
 * Comprehensive documentation \
 * No dependencies on other libraries \
 * Full Unicode support (UTF-8) \
 * Extensive test suite"
LICENSE = "MIT"

PV = "2.15.1"

RPM_NAME = "libjansson-devel-2.15.1-1.2.aarch64.rpm"
RPM_HASH = "22fc874eab0fac53f07962716eab54683aec512611a8280c630a92b2499fe8263cb4069908afba882f216c057af72ff27666b74fe18f13bb5063bfdeff1f1dfe"

RPROVIDES:${PN} += "libjansson-devel \
pkgconfig-jansson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjansson4"

inherit rpm

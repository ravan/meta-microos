SUMMARY = "Development files for libicns"
DESCRIPTION = "Libraries and header files for developing applications that use libicns."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1+git20201014"

RPM_NAME = "libicns-devel-0.8.1+git20201014-1.23.aarch64.rpm"
RPM_HASH = "aac131ba0bda6e993b7a2ddc5c4cc070c070ca42c087af94e9c65a72d0f651c4d72f82467cd15fe498f5c42ec8f387c12bb7cf8c9a4d50e9f747a5112aa4af7d"

RPROVIDES:${PN} += "libicns-devel \
pkgconfig-libicns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libicns1"

inherit rpm

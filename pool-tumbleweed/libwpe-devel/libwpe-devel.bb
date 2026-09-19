SUMMARY = "Development files for libwpe"
DESCRIPTION = "The libwpe-devel package contains libraries, build data, and \
header files for developing applications that use libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.16.3"

RPM_NAME = "libwpe-devel-1.16.3-1.5.aarch64.rpm"
RPM_HASH = "edd69476a61af283b19f062a32802d3347ed0c22f62e6e5a7c0dd821116bd90365ab0db2a53e75f7670d5897a78fe498745b4a0ce5d95e35d163665afa5b6c67"

RPROVIDES:${PN} += "libwpe-devel \
pkgconfig-wpe-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwpe-1-0-1 \
pkgconfig-egl \
pkgconfig-xkbcommon"

inherit rpm

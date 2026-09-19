SUMMARY = "Development files for librevenge"
DESCRIPTION = "The librevenge-devel package contains libraries and header files for \
developing applications that use librevenge."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-devel-0.0.5-1.14.aarch64.rpm"
RPM_HASH = "88adb477f4496ead2ea02ea4c3fb2d9a5f21927871d324e5b25da4f01f52a7a609d3110d10c394a5f9fd7e5a5149a31eb70f73140934de72e6ad9abaad4bb223"

RPROVIDES:${PN} += "librevenge-devel \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-generators-0.0 \
pkgconfig-librevenge-stream-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librevenge-0-0-0 \
librevenge-generators-0-0-0 \
librevenge-stream-0-0-0 \
pkgconfig-librevenge-0.0"

inherit rpm

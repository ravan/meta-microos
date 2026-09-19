SUMMARY = "Development files for libunibreak"
DESCRIPTION = "The libunibreak-devel package contains libraries and header files for \
developing applications that use libunibreak."
LICENSE = "Zlib"

PV = "6.1"

RPM_NAME = "libunibreak-devel-6.1-1.5.aarch64.rpm"
RPM_HASH = "d9ddd1b832dd63fabf9c98f3d782ebdad04f2f416c346c61623d1d7ec1e604c6db15e7931ffd887892891cf1d0fb4e73e0ab53eec78ceece7600bed97bab41be"

RPROVIDES:${PN} += "liblinebreak-devel \
libunibreak-devel \
pkgconfig-libunibreak"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunibreak6 \
pkgconfig"

inherit rpm

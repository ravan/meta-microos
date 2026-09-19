SUMMARY = "Development files for liballegro"
DESCRIPTION = "Development files needed to build applications which use liballegro."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "618aeaa96a92ce96e566f386c72564741a1138571e6efae98efec8d453869897e247f4df53ea29721b0fe295e405db90b27197febc8cba8795b8566e9ecf63dc"

RPROVIDES:${PN} += "cmake-Allegro \
liballegro5-2-devel \
pkgconfig-allegro-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro5-2 \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm

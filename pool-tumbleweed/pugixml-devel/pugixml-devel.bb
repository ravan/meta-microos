SUMMARY = "Development Files for pugixml"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using pugixml."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "pugixml-devel-1.16-1.2.aarch64.rpm"
RPM_HASH = "3c511d217ff92008d3d1feb24ae1b5cdb8195fa8b9a0a582d8a73e068fa7492a84ccfac6242ed321d1edd20fd796d9d892b2c3deaa6e6ab8ef449da8e872ec53"

RPROVIDES:${PN} += "cmake-pugixml \
pkgconfig-pugixml \
pugixml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpugixml1"

inherit rpm

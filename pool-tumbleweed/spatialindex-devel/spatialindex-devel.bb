SUMMARY = "Development files for spatialindex"
DESCRIPTION = "The spatialindex-devel package contains libraries and header files for \
developing applications that use spatialindex."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "spatialindex-devel-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "42c6ae09a97a0aadefddaf29669c5c6c46118f84693c8f8c659253e6e8be309edc8c06d88ff9f41763656e67aa653756d260265f14e64d91b2ca2ea06588edd2"

RPROVIDES:${PN} += "cmake-libspatialindex \
libspatialindex-devel \
pkgconfig-libspatialindex \
spatialindex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspatialindex8"

inherit rpm

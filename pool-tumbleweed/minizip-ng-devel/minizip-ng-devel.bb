SUMMARY = "Development files for minizip-ng"
DESCRIPTION = "This package contains the C header and CMake config files."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "minizip-ng-devel-4.1.0-1.3.aarch64.rpm"
RPM_HASH = "69342e9d078e68afdcf6c81219c83a03c0f6f36be8bd31934b8c3859ec9acfbae3affb969e5e6669a60826c6ad0ffe2559b8929fa8bfca477c70af2fdd9027be"

RPROVIDES:${PN} += "cmake-minizip-ng \
minizip-ng-devel \
pkgconfig-minizip-ng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminizip-ng4 \
pkgconfig-zlib-ng"

inherit rpm

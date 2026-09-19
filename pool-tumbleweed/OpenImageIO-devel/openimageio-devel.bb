SUMMARY = "Development Files for OpenImageIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenImageIO."
LICENSE = "Apache-2.0"

PV = "3.1.17.0"

RPM_NAME = "OpenImageIO-devel-3.1.17.0-1.1.aarch64.rpm"
RPM_HASH = "be6431631be6dadad2d11d4ad5d276a2c86a3978fae1016a10f65d1b5df6b44109b22d8d0da32259104e01ff94d0ca37b840751d4a346864dbbc2660ef4d2b47"

RPROVIDES:${PN} += "OpenImageIO-devel \
cmake-OpenImageIO \
pkgconfig-OpenImageIO"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
OpenImageIO \
fmt-devel \
libOpenImageIO-Util3-1 \
libOpenImageIO3-1 \
pkgconfig-Imath"

inherit rpm

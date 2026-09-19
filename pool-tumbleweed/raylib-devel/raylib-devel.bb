SUMMARY = "Development files for raylib"
DESCRIPTION = "Development files and headers for raylib."
LICENSE = "Zlib"

PV = "6.0"

RPM_NAME = "raylib-devel-6.0-1.4.aarch64.rpm"
RPM_HASH = "6379d6bfd93ad8899c7f978371f0e7e4d825b8252a3f832d394f1e3e1166f8ca84cdfb12cf62d8147d14499810a616fe022c5684ecf98b14e46f4d379d75dc44"

RPROVIDES:${PN} += "cmake-raylib \
pkgconfig-raylib \
raylib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraylib600 \
openal-soft-devel"

inherit rpm

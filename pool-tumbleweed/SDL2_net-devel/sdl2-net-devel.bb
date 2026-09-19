SUMMARY = "Development files for the SDL2 networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "2.4.0"

RPM_NAME = "SDL2_net-devel-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "224f2b2536521aa40ee945f0144b3e996b4cc2d1b4b3101ee2c4c8b087f6bc8d5d07b5c1c7bae18e572c01ce211613d2635cbe7cf3de41da07abeb519843a289"

RPROVIDES:${PN} += "SDL2-net-devel \
libSDL2-net-devel \
pkgconfig-SDL2-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-net-2-0-0 \
pkgconfig-sdl2"

inherit rpm

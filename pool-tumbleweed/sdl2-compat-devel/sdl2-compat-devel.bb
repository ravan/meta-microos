SUMMARY = "Header and build system files for sdl2-compat"
DESCRIPTION = "This package contains files needed for development with the SDL2 \
library."
LICENSE = "Zlib"

PV = "2.32.72"

RPM_NAME = "sdl2-compat-devel-2.32.72-1.1.aarch64.rpm"
RPM_HASH = "a3f35a8ca868e41f3ea833f632c5da999dee22778a0f188f9bdb9ae840a67971bf55912fbc6f4f0811654db9a981e9f3e1a91d0fa3a801056cd89e9989b51d97"

RPROVIDES:${PN} += "SDL2-devel \
cmake-SDL2 \
cmake-sdl2 \
pkgconfig-sdl2 \
pkgconfig-sdl2-compat \
sdl2-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libSDL2-2-0-0"

inherit rpm

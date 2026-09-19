SUMMARY = "Libraries, includes and more to develop SDL2_gfx applications"
DESCRIPTION = "Library containing 20+ graphics primitives (line, box, circle, polygon, etc.) for SDL2."
LICENSE = "Zlib"

PV = "1.0.4"

RPM_NAME = "libSDL2_gfx-devel-1.0.4-3.4.aarch64.rpm"
RPM_HASH = "afc72b3b12c238ac4feca649589d1cb883e11850aeefb2220606f330d32449a3ece56eb07476c24aa8ba99e3914ab416d2ff5b2275ae028e9d4ca3c6dd289b56"

RPROVIDES:${PN} += "SDL2-gfx-devel \
libSDL2-gfx-devel \
pkgconfig-SDL2-gfx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-gfx-1-0-0 \
pkgconfig-sdl2"

inherit rpm

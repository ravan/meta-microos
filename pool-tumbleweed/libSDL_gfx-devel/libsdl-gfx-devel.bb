SUMMARY = "Libraries, includes and more to develop SDL_gfx applications"
DESCRIPTION = "The SDL_gfx library evolved out of the SDL_gfxPrimitives code which \
provided basic drawing routines such as lines, circles or polygons and \
SDL_rotozoom which implemented a interpolating rotozoomer for SDL \
surfaces. The current components of the SDL_gfx library are: \
 \
* Graphic Primitives (SDL_gfxPrimitves.h) \
* Rotozoomer (SDL_rotozoom.h) \
* Framerate control (SDL_framerate.h) \
* MMX image filters (SDL_imageFilter.h) \
 \
The library is backwards compatible to the above mentioned code. It is \
written in plain C and can be used in C++ code."
LICENSE = "Zlib"

PV = "2.0.27"

RPM_NAME = "libSDL_gfx-devel-2.0.27-1.9.aarch64.rpm"
RPM_HASH = "54cd4e14f07c0ee06e720ff99692d48d272217f5dfb2d607d6cfffafa9a910e246cf0ef95889bbc2a979b9359c70e38c86dd36024e41e1d4dd387a8b87ff0835"

RPROVIDES:${PN} += "SDL-gfx-devel \
libSDL-gfx-devel \
pkgconfig-SDL-gfx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-gfx16 \
pkgconfig-sdl"

inherit rpm

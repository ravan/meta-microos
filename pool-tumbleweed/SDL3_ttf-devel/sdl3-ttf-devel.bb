SUMMARY = "Header files for the Simple DirectMedia Layer Truetype library"
DESCRIPTION = "This is a library that allows using TrueType fonts in SDL applications."
LICENSE = "Zlib"

PV = "3.2.2"

RPM_NAME = "SDL3_ttf-devel-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "7f220603336bb8d2810d444b3901897fe1c4a0595da66a4f9bc083872703cabc1a9e57497fe0cf1c4af1c8b3b5ca8e74ace2d065d870a6f877265db256678e47"

RPROVIDES:${PN} += "SDL3-ttf-devel \
cmake-SDL3-ttf \
pkgconfig-sdl3-ttf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL3-ttf0 \
pkgconfig-freetype2 \
pkgconfig-sdl3"

inherit rpm

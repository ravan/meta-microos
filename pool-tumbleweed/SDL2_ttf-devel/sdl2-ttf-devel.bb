SUMMARY = "Header files for the Simple DirectMedia Layer 2 Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.24.0"

RPM_NAME = "SDL2_ttf-devel-2.24.0-4.5.aarch64.rpm"
RPM_HASH = "500712af826d458c9d667678e8a5c77cdccf84c24640eab4700349d6eccdeb4ae2797af1ea51d295bebdaff5270099464d9aed25f3cc2c4a90061e0c51fda4b3"

RPROVIDES:${PN} += "SDL2-ttf-devel \
libSDL2-ttf-devel \
pkgconfig-SDL2-ttf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-ttf-2-0-0 \
pkgconfig-sdl2"

inherit rpm

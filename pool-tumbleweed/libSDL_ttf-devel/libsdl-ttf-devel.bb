SUMMARY = "Development files for the SDL TrueType library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.0.11"

RPM_NAME = "libSDL_ttf-devel-2.0.11-7.35.aarch64.rpm"
RPM_HASH = "0e75c235c6b2c2e86685e1b3d0fe172fba3b1c3378953fb271c3a798d12fe69d21e3fbbc936f38b762478bae0ce3f0d84951975dc0453441f19a82ef49465c8b"

RPROVIDES:${PN} += "SDL-ttf-devel \
libSDL-ttf-devel \
pkgconfig-SDL-ttf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-ttf-2-0-0 \
pkgconfig-sdl"

inherit rpm

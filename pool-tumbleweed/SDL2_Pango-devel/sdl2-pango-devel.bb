SUMMARY = "Headers and sources for developing apps with SDL2_Pango"
DESCRIPTION = "SDL2_Pango is a library for graphically rendering internationalized and tagged \
text in SDL2 using TrueType fonts. SDL2_Pango is a port of SDL_Pango to SDL2. \
 \
This package provides the headers and sources for developing applications with \
SDL2_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.5"

RPM_NAME = "SDL2_Pango-devel-2.1.5-1.12.aarch64.rpm"
RPM_HASH = "74d7114e749ba5ad1b4dcc17d9a0201ab89c4ff796fa63e085c03035f12695bd6e4f9fb04dfd1035158a92bbdd7edd2f117b92b14fcfef699ba1e3b01484d70a"

RPROVIDES:${PN} += "SDL2-Pango-devel \
pkgconfig-SDL2-Pango"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-Pango4 \
pkgconfig-freetype2 \
pkgconfig-pango \
pkgconfig-sdl2"

inherit rpm

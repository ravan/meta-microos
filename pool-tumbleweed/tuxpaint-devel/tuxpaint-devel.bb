SUMMARY = "Devel files of tuxpaint"
DESCRIPTION = "Header files and development documentation for tuxpaint."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.35"

RPM_NAME = "tuxpaint-devel-0.9.35-2.2.noarch.rpm"
RPM_HASH = "6d3b6d75450e3980eb9809e2670684ae81252c7b6405d76e2193e13705fdad7528f98b257916b068e207419abc215aa48c58f4198081071f1e961263ad5f5aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc-c++ \
gettext-devel \
libpaper-devel \
libpng-devel \
pkgconfig-SDL2-Pango \
pkgconfig-SDL2-image \
pkgconfig-SDL2-mixer \
pkgconfig-SDL2-ttf \
pkgconfig-fribidi \
pkgconfig-librsvg-2.0 \
pkgconfig-sdl2 \
pkgconfig-zlib \
tuxpaint"

inherit rpm

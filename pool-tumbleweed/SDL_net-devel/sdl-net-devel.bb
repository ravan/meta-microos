SUMMARY = "Development files for the SDL networking library"
DESCRIPTION = "This is a small cross-platform networking library for use with SDL."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.8"

RPM_NAME = "SDL_net-devel-1.2.8-8.8.aarch64.rpm"
RPM_HASH = "3e353d2e49d0de86bded1b241eeb794c5827818678223cb31cf59271479ce498c648216d5dacf73b7f9b1fea83f3d655757e004d518032d76ebe8e917de6d713"

RPROVIDES:${PN} += "SDL-net-devel \
libSDL-net-devel \
pkgconfig-SDL-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-net-1-2-0 \
pkgconfig-sdl"

inherit rpm

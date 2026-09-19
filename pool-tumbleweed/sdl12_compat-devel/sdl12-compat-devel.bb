SUMMARY = "Libraries, includes and more to develop SDL-1.2 applications"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "(MIT-0 | Unlicense) & Zlib & MIT"

PV = "1.2.76"

RPM_NAME = "sdl12_compat-devel-1.2.76-1.8.aarch64.rpm"
RPM_HASH = "34f6066fdf85765fcb0625f509df3cbeb17d4fc21deadeb150f9bc4fa44bff63f4982304bc765d40f0fee65d546169d2d6891053e02e52f28a0af23fc9949fce"

RPROVIDES:${PN} += "SDL-devel \
libSDL-devel \
pkgconfig-sdl \
pkgconfig-sdl12-compat \
sdl12-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libSDL-1-2-0 \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm

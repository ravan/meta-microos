SUMMARY = "Headers for SDL_Pango development"
DESCRIPTION = "This package contains the necessary include files and libraries needed \
to develop applications that require SDL_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.2"

RPM_NAME = "SDL_Pango-devel-0.1.2-241.8.aarch64.rpm"
RPM_HASH = "24cd72ec014c8149c1561dc5d668f8942dc5935a2096ae49bf3a5b54ba99b0fd8faa48efdb1fcecd2eb97895bda0936dc878eed7777153cf1894809a1322c26a"

RPROVIDES:${PN} += "SDL-Pango-devel \
libSDL-Pango-devel \
pkgconfig-SDL-Pango"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-Pango1 \
pkgconfig-pango \
pkgconfig-sdl"

inherit rpm

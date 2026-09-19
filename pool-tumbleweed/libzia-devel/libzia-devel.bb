SUMMARY = "Libzia header files"
DESCRIPTION = "Libzia contains architecture-dependent code used by Tucnak and others. \
 \
This package contains files needed for development with libzia."
LICENSE = "GPL-2.0-or-later"

PV = "4.73"

RPM_NAME = "libzia-devel-4.73-1.1.aarch64.rpm"
RPM_HASH = "e6c746740e706ee1363f76f507ae01e7227bac010af19ec219c5e628716483246bf4524a888cc32acede009512a35df47b6f626570e9f7359b78c92603e4be04"

RPROVIDES:${PN} += "libzia-devel \
pkgconfig-libzia"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libzia-4-73 \
pkgconfig-SDL2-ttf \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libftdi1 \
pkgconfig-libpng \
pkgconfig-sdl2"

inherit rpm

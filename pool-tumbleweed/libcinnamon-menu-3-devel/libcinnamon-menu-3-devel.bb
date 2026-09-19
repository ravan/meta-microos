SUMMARY = "Libraries and development headers for cinnamon-menus"
DESCRIPTION = "This package provides the necessary development libraries for \
writing applications that use the Cinnamon menu system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6.0"

RPM_NAME = "libcinnamon-menu-3-devel-6.6.0-1.4.aarch64.rpm"
RPM_HASH = "82b8d17d0f8caf17cf017c22a122d5d74a683769da8ad6b03100f618c9bfa46d4d8670df47805d0c725597cdc6ffc808b41701e3dfbd5bf9cbcf7b22f3fd8ab4"

RPROVIDES:${PN} += "libcinnamon-menu-3-devel \
pkgconfig-libcinnamon-menu-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcinnamon-menu-3-0 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-CMenu-3-0"

inherit rpm

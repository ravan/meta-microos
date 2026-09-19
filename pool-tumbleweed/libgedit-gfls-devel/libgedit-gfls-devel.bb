SUMMARY = "Gedit Technology - File loading and saving; development package"
DESCRIPTION = "libgedit-gfls is a module dedicated to file loading and saving for the needs of gedit and other similar text editors."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "libgedit-gfls-devel-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "48507e55b13a3af13fcc07af69f3f5cefb238e2d4a469034d1347dc04dd592ab2f612c9dad21a3f9cb7b535b4dabe1ed1a2617b44abcf1a853dc49362aea0052"

RPROVIDES:${PN} += "libgedit-gfls-devel \
pkgconfig-libgedit-gfls-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgedit-gfls-1-0 \
pkgconfig-gio-2.0 \
typelib-1-0-Gfls-1"

inherit rpm

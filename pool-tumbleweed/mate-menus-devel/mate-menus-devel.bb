SUMMARY = "Header files for the MATE Desktop Menu"
DESCRIPTION = "mate-menus contains the libmate-menu library, the layout configuration \
files for the MATE menu, as well as a simple menu editor. \
 \
The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "mate-menus-devel-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "2b808c5b5733a4d483f38cee5afe01fad0daaf56d4016ff0b52710e9f2e6173e58cdcfbf071df2d320677a1d2b91ee6907bd8e76780339d96966ce0ce7c66957"

RPROVIDES:${PN} += "mate-menus-devel \
pkgconfig-libmate-menu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-menu2 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-MateMenu-2-0 \
typelib-MateMenu"

inherit rpm

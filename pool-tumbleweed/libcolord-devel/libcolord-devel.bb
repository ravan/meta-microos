SUMMARY = "Development files for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "libcolord-devel-1.4.8-3.1.aarch64.rpm"
RPM_HASH = "7b0479e49a29ddebddc02291ad10d5a8fde74736b12b27db0049fafa1bc020317ec0ec15731ea97c305099bfb59b9070d0301094f6406f7e3fb80d63c509cc08"

RPROVIDES:${PN} += "libcolord-devel \
pkgconfig-colord \
pkgconfig-colorhug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
colord-color-profiles \
libcolord2 \
libcolorhug2 \
pkgconfig-colord \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gusb \
typelib-1-0-Colord-1-0 \
typelib-1-0-Colorhug-1-0"

inherit rpm

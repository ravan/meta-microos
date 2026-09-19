SUMMARY = "Development files for pantheon-wayland"
DESCRIPTION = "Development files for pantheon-wayland."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "pantheon-wayland-devel-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "27a335b2127d325192d706e8993b3b91e7e80722b3ecab65def4999ea41c8a3db977dcb261244db8e75a7a727cad15edd8a70f798638762f82abd73474f24198"

RPROVIDES:${PN} += "pantheon-wayland-devel \
pkgconfig-pantheon-wayland-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpantheon-wayland1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-gtk4-wayland \
pkgconfig-wayland-client \
typelib-1-0-PantheonWayland-1-0"

inherit rpm

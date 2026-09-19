SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-menus-devel-3.38.1-1.6.aarch64.rpm"
RPM_HASH = "729e730250c803cea5e3edf104b8ba8792e490a11ce6d660ed911ab9decc496bbf2eab2efbdb8843cf3d818541d87bd446f9c47f4a4ab80b5d330177dcc29299"

RPROVIDES:${PN} += "gnome-menus-devel \
pkgconfig-libgnome-menu-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-menu-3-0 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-GMenu-3-0"

inherit rpm

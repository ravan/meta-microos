SUMMARY = "Development Files for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package contains development files for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "140.0"

RPM_NAME = "cjs-devel-140.0-2.1.aarch64.rpm"
RPM_HASH = "b95b2d5e4a3e48926248dce4dc7cf564fe81fa67c1938e530644f9fe9f409eb4e884f48089dd3b70e5599c89deb512494627ce5fe1bbabcda78c4fb3ec3b6c31"

RPROVIDES:${PN} += "cjs-devel \
pkgconfig-cjs-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cjs \
libcjs0 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-xlib \
pkgconfig-gio-2.0 \
pkgconfig-girepository-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libffi \
pkgconfig-mozjs-140"

inherit rpm

SUMMARY = "Development files for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "libpeas-devel-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "29ac2660316574fcb5de5ce3f6741c5dfe241de5d4c8458d0c84658600c16e74004894ffafbea64dbb46ca5fedaed44e8100dbb6c549e3bdb58995935a7ee9d4"

RPROVIDES:${PN} += "libpeas-devel \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpeas-1-0-1 \
libpeas-gtk-1-0-1 \
pkgconfig-gio-2.0 \
pkgconfig-girepository-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0 \
typelib-1-0-Peas-1-0 \
typelib-1-0-PeasGtk-1-0"

inherit rpm

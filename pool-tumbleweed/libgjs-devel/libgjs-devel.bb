SUMMARY = "Development files for the GJS library"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.88.1"

RPM_NAME = "libgjs-devel-1.88.1-2.1.aarch64.rpm"
RPM_HASH = "270eb237d1ae901c8f6e1aaf9f8689a62379c1c53388baa9d08ba3e226debd0c23c147417531bdace7cd5cd0e2b055d7272bfcd59861d53cd49cfbf25a6f864f"

RPROVIDES:${PN} += "gjs-devel \
libgjs-devel \
pkgconfig-gjs-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gjs \
libgjs0 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-xlib \
pkgconfig-gio-2.0 \
pkgconfig-girepository-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libffi \
pkgconfig-mozjs-140 \
typelib-1-0-GjsPrivate-1-0"

inherit rpm

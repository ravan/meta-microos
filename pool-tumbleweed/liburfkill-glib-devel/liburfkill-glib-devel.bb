SUMMARY = "The glib binding library for urfkill"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop. \
http://freedesktop.org/wiki/Software/urfkill"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "liburfkill-glib-devel-0.5.0-6.7.aarch64.rpm"
RPM_HASH = "37ac40db060b9a6d8fe6e35bbe4c43d8e5a5431880f610f7e0895854ef1140003e961e2bf8a4ea4cda1086cf7f244c47c3f037d4fb93400054cd9da75af74e48"

RPROVIDES:${PN} += "liburfkill-glib-devel \
pkgconfig-urfkill-glib \
urfkill-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
liburfkill-glib0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
typelib-1-0-Urfkill-0-0"

inherit rpm

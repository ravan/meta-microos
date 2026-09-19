SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Development Files"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "telepathy-glib-devel-0.24.2-3.9.aarch64.rpm"
RPM_HASH = "dfa7b66c15432a46be849786d971798603848735067f67b30b9fcda01b626c6d4d7016514f66dac999b1450576187bb227a1d4121c2627d1b1ff33956bb0be9f"

RPROVIDES:${PN} += "pkgconfig-telepathy-glib \
telepathy-glib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtelepathy-glib0 \
pkgconfig-dbus-1 \
pkgconfig-dbus-glib-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-TelepathyGlib-0-12"

inherit rpm

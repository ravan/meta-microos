SUMMARY = "Library to dusplay maps - Development Files"
DESCRIPTION = "Libchamplain is a C library providing a ClutterActor to display maps. It \
also provides a Gtk+ widget to display maps in Gtk+ applications. \
 \
It supports numerous free map sources such as OpenStreetMap, \
OpenAerialMap and Maps for free."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.21"

RPM_NAME = "libchamplain-devel-0.12.21-1.17.aarch64.rpm"
RPM_HASH = "c01b6a4ca596c620185e1bccbf6bcb933bd57c145bb7d19995bf2d7df4850d73d3595a33e95ed78d932d07ba64958db58315774d4e1755e2aaa91089839f1a4b"

RPROVIDES:${PN} += "libchamplain-devel \
pkgconfig-champlain-0.12 \
pkgconfig-champlain-gtk-0.12"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchamplain-0-12-0 \
pkgconfig-cairo \
pkgconfig-champlain-0.12 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-gtk-1.0 \
pkgconfig-gdk-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-sqlite3 \
typelib-1-0-Champlain-0-12"

inherit rpm

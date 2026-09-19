SUMMARY = "Development files for planify"
DESCRIPTION = "Development files for planify. \
 \
This package ships the development files for planify"
LICENSE = "GPL-3.0-or-later"

PV = "4.19.5"

RPM_NAME = "planify-devel-4.19.5-1.1.aarch64.rpm"
RPM_HASH = "c319b3bea12d45469790c325f3702f1fc2afa1b2593018c95b998b33f243c3a31a8d1bd12e44cdc8a5dbfbb6f2ef84dc3a26a33ef226b1247d28e2d3bac168c6"

RPROVIDES:${PN} += "pkgconfig-planify \
planify-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-chrono \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk4 \
pkgconfig-gtksourceview-5 \
pkgconfig-gxml-0.20 \
pkgconfig-json-glib-1.0 \
pkgconfig-libadwaita-1 \
pkgconfig-libecal-2.0 \
pkgconfig-libedataserver-1.2 \
pkgconfig-libical-glib \
pkgconfig-libsecret-1 \
pkgconfig-libsoup-3.0 \
pkgconfig-libspelling-1 \
pkgconfig-sqlite3"

inherit rpm

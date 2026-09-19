SUMMARY = "Development files for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains development files for libshumate."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause & CC0-1.0 & CC-BY-3.0 & GFDL-1.2-only"

PV = "1.6.3"

RPM_NAME = "libshumate-devel-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "27329273c3c0e95d096a80199e4cb2693afea12ef70ffd9952f7687ef87da933790329c3793dd13866cc7e0b1232d659d4e40f99fabece7e88bb249276689700"

RPROVIDES:${PN} += "libshumate-devel \
pkgconfig-shumate-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshumate-1-0-1 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-json-glib-1.0 \
pkgconfig-libprotobuf-c \
pkgconfig-libsoup-3.0 \
pkgconfig-sqlite3 \
typelib-1-0-Shumate-1-0"

inherit rpm

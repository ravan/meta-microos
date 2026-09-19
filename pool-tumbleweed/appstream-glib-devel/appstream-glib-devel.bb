SUMMARY = "Development files for the AppStream abstraction library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation. \
 \
This library allows to: \
 \
* Read and write compressed AppStream XML files \
* Add and search for applications in an application store \
* Get screenshot image data and release announcements \
* Easily retrieve the best application data for the current locale \
* Efficiently interface with more heavy-weight parsers like expat"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "appstream-glib-devel-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "d235f40b133eb9a95425ee410b64436f58e457f54919c3fae6f7e347ab1fe70be8c78fee2a8befc15cd1e2b70522c9a7b206b43745355dc6f97b5618ecb89db3"

RPROVIDES:${PN} += "appdata-tools \
appstream-glib-devel \
pkgconfig-appstream-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
appstream-glib \
libappstream-glib8 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libarchive \
pkgconfig-uuid \
typelib-1-0-AppStreamGlib-1-0"

inherit rpm

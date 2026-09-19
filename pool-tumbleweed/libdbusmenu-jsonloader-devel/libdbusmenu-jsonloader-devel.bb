SUMMARY = "Development files for libdbusmenu-jsonloader4"
DESCRIPTION = "This package contains the development files for the dbusmenu-jsonloader library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-jsonloader-devel-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "394f0610469c09940442c529f014fc4a43cdba9c1cc91012645594549818b6d5906ff54eb29e0e582ec2275d8b56ab907378030b3556433a33fbcd08be644182"

RPROVIDES:${PN} += "libdbusmenu-jsonloader-devel \
pkgconfig-dbusmenu-jsonloader-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-jsonloader4 \
pkgconfig-dbus-glib-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-json-glib-1.0"

inherit rpm

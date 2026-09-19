SUMMARY = "Development Files for switchboard"
DESCRIPTION = "Switchboard is a modular system settings hub designed for the Pantheon desktop. \
 \
This package contains development files needed to develop plugins for \
switchboard."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-devel-8.0.3-1.5.aarch64.rpm"
RPM_HASH = "6c5d90f181bd68a01576af65a49ca1a67db42994af6eeb6e5ca1279b00d08abccec1080fd9a92e884a4247e5ff8282ef440915975c0e0fe472c8daf14b217788"

RPROVIDES:${PN} += "pkgconfig-switchboard-3 \
switchboard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libswitchboard-3-0 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-granite-7 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1"

inherit rpm

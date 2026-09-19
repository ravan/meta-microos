SUMMARY = "Menu-cache Headers"
DESCRIPTION = "menu-cache development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "menu-cache-devel-1.1.1-1.8.aarch64.rpm"
RPM_HASH = "16623631eab85cf077f73fb5196554faf7d3eb60cd92adea7b3744747703a8842dc5db936017bc768e22001cfc3a283e3acc063e58aeeec96f308403a3571757"

RPROVIDES:${PN} += "menu-cache-devel \
pkgconfig-libmenu-cache"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmenu-cache3 \
menu-cache \
pkgconfig-glib-2.0 \
pkgconfig-libfm-extra"

inherit rpm

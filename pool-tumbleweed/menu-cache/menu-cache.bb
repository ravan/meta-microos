SUMMARY = "A tool speed up menus"
DESCRIPTION = "Libmenu-cache is a library creating and utilizing caches to speed up \
the manipulation for freedesktop.org defined application menus. \
It can be used as a replacement of libgnome-menu of gnome-menus."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "menu-cache-1.1.1-1.8.aarch64.rpm"
RPM_HASH = "4987482e7217c9f405c8f8d68462de7414404a114a9fdb227620623b6a07b1e8d74c30843e6d0433eef04d001eab512495870129b79936607005356b10642866"

RPROVIDES:${PN} += "menu-cache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfm-extra.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

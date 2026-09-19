SUMMARY = "MATE Desktop Menu"
DESCRIPTION = "The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "libmate-menu2-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "b01bdbe5f2673d4d37ee13e60c654f9e2a689cac523f211e6ce45e596728c97b91a1d94c20861e83b34684aa732d9ac3666a44c42359665ce935f2822bdab0df"

RPROVIDES:${PN} += "libmate-menu.so.2 \
libmate-menu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

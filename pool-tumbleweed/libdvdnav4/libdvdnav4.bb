SUMMARY = "A DVD Navigation Library"
DESCRIPTION = "This library contains functions to display DVD video menus."
LICENSE = "GPL-2.0-or-later"

PV = "7.0.0"

RPM_NAME = "libdvdnav4-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "09a1b1fe4ec9af5b573699e3b4d335c8f646ead27cff266588fd65c0c6fa7c8d1424f2ab008be1be1376e2051bc10c5b233c02cc8126c05e48ba4c32932112a6"

RPROVIDES:${PN} += "libdvdnav \
libdvdnav.so.4 \
libdvdnav4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8"

inherit rpm

SUMMARY = "Menu-cache libraries"
DESCRIPTION = "menu-cache libraries for development"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libmenu-cache3-1.1.1-1.8.aarch64.rpm"
RPM_HASH = "be79872e03828bba3dd020fa0135afca5ea467480b5c9a98dbeb418afac883fa27f0308c516a1b75bdc1b4f0289e9771fe6966768d705e8d7e978623714457f3"

RPROVIDES:${PN} += "libmenu-cache.so.3 \
libmenu-cache3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

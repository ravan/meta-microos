SUMMARY = "Small library that passes a menu structure across DBus -- Test library"
DESCRIPTION = "This package contains the shared libraries for dbusmenu-jsonloader, a library \
meant for test suites."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-jsonloader4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "350fa8b1e2bc3cb75720c66ec04c505d552ab6478fbb53aa8af2fb46b5cf5c7406c81faac8314a9b136ac1f438153f3c85ef36b7f9bd053f2372e4f11508b71b"

RPROVIDES:${PN} += "libdbusmenu-jsonloader.so.4 \
libdbusmenu-jsonloader4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm

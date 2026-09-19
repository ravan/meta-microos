SUMMARY = "Maliit Framework glib shared library"
DESCRIPTION = "Provides the glib-related shared libraries built for the Maliit \
Framework."
LICENSE = "LGPL-2.1-only"

PV = "2.3.0"

RPM_NAME = "libmaliit-glib2-2.3.0-1.18.aarch64.rpm"
RPM_HASH = "afd004c1e880de9b48209eb92b41c478d976d7e7df0327ce13bc3fab548546db9db6b0b463b57233c6647e5d1a7ac3d11e1c2555d48135e3f669877a4f87ca13"

RPROVIDES:${PN} += "libmaliit-glib.so.2 \
libmaliit-glib2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
maliit-framework"

inherit rpm

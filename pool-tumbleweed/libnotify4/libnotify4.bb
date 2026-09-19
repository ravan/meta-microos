SUMMARY = "Notifications Library"
DESCRIPTION = "D-BUS notifications library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.8"

RPM_NAME = "libnotify4-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "b12e1c197a5acbc01d272aeaea80f978ee018a996e9345ad9982efc4f411e17dedddce12f264ec77d508a8e80827c1a9a93893cd96f7fd8233237ba2808c7620"

RPROVIDES:${PN} += "libnotify.so.4 \
libnotify4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

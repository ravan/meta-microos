SUMMARY = "Windowing library for Budgie Desktop"
DESCRIPTION = "Windowing management library for Budgie Desktop to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libbudgie-windowing0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "918147c7148f1025881709fa80f45c92b5d39b31a856405219aa85e4c1d3f98a8cd7939aa6438b96c7f6fab009613cba5783daa0da74d84668fb1468823397ed"

RPROVIDES:${PN} += "libbudgie-windowing.so.0 \
libbudgie-windowing0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxfce4windowing-0.so.0"

inherit rpm

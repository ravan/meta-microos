SUMMARY = "The Chewing engine for IBus input platform"
DESCRIPTION = "The Chewing engine for IBus platform. It provides Chinese input method from \
libchewing. \
新酷音輸入法"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.7"

RPM_NAME = "ibus-chewing-2.1.7-1.3.aarch64.rpm"
RPM_HASH = "68325bb562b8eeb813025683dcd2aabd7c4b77539473703491bc535e185370b37520318374fa84df4e3770ea73d8f032d8a2f80a529926481cc79d6e4973cee5"

RPROVIDES:${PN} += "ibus-chewing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libchewing.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libibus-1.0.so.5"

inherit rpm

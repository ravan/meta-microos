SUMMARY = "Vietnamese input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-vietnamese-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "e882bdb209bc1dc1cd1944528a75fb78621b51d565e446094139f7e421c554c65fe00e081993da776edfafb20fb41d0e29c5171b7ed5af08db7b42dd78b2ea1d"

RPROVIDES:${PN} += "gtk3-immodule-vietnamese \
locale-gtk3-vi"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

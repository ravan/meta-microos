SUMMARY = "Inuktitut input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Inuktitut."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-inuktitut-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "6cccc8c6000a56c723261b488c014c6c8d098313d5c114fd54fb2bc810366c5f6293e11da6360ca4ac68118fdb95b2c081a946feeb1756bdd69f14d4e1fad4c6"

RPROVIDES:${PN} += "gtk3-immodule-inuktitut \
locale-gtk3-iu"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

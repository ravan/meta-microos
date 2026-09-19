SUMMARY = "Multipress input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method which allows text entry via the \
multi-press method, as on a mobile phone."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-multipress-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "9cc17b3140e2f1375d844f152f04b9dd1d8295979f5dbefd0ad0e223d1534e24ed761b1fbb8bc86cf966f9dd53a055d2d6478c5ca4c240a47f2aa6e78fc8bdf2"

RPROVIDES:${PN} += "config-gtk3-immodule-multipress \
gtk3-immodule-multipress"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm

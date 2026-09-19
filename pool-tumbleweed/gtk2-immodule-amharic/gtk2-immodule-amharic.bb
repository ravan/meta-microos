SUMMARY = "Amharic input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-amharic-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "58b317fbb93a0ec9954fa06c60cc36ed90389c9ec5d59410e5b92e7dc6a57f2b38e6f6f3bf78ba5a5079be0daaf6bebc12e09e5f474405e42c198e1d890a938a"

RPROVIDES:${PN} += "gtk2-immodule-amharic \
locale-gtk2-am"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm

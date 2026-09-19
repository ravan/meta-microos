SUMMARY = "Tigrigna input methods for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-tigrigna-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "961b147bb77c29ca3534f3590e5fa4cf62c8c4fdb87b07ff6c6a103a4629236665251f204f981307284fa1d50d27893fa3f31d2bc289551a45215ca8c8e77c8f"

RPROVIDES:${PN} += "gtk2-immodule-tigrigna \
gtk2-immodules-tigrigna \
locale-gtk2-ti"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm

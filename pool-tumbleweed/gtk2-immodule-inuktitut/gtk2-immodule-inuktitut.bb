SUMMARY = "Inuktitut input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Inuktitut."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-inuktitut-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "c64d5ecadcc4d5cfdb2b2c950a5f66142e38df679373296b8f8c2afd92683e2e4bc43b02f823e1dbf3157d873e534c239e78f8f62044a1a7ff948c9cf7a855c0"

RPROVIDES:${PN} += "gtk2-immodule-inuktitut \
locale-gtk2-iu"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm

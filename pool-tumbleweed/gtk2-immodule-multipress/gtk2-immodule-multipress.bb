SUMMARY = "Multipress input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method which allows text entry via the \
multi-press method, as on a mobile phone."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-multipress-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "1e925545d0133b857d23e3056dfefd7f9c46006dd3197b29a9c26a95895e746000a8484335d3aaa03d1704cb6ce8a64289e460212d0b4fea0788982cc88a841d"

RPROVIDES:${PN} += "config-gtk2-immodule-multipress \
gtk2-immodule-multipress"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm

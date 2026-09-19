SUMMARY = "X input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method based on the X Input Method."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-xim-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "60511ba92564386b989701f24d8a830ffbf6166c6ed6a2d6b7d2cf66a3737fd0d4d6f07969416be0580dba49f568bc8ceb4d250f4f201f6600767fdff501983a"

RPROVIDES:${PN} += "gtk3-immodule-xim \
locale-gtk3-ja \
locale-gtk3-ko \
locale-gtk3-th \
locale-gtk3-zh"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm

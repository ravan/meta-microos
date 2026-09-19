SUMMARY = "Header files for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains all necessary include files and libraries \
needed to develop applications that require libmetacity."
LICENSE = "GPL-2.0-or-later"

PV = "3.56.0"

RPM_NAME = "metacity-devel-3.56.0-1.6.aarch64.rpm"
RPM_HASH = "9e1002ee997f491d61f5dd81b694e16bba9eab466fd107583c2b1f3c9cc3a117ac39b5435e719b732c43ce2e398ab407cd13cdc78bdcef9fdb48d3aa0b68c05b"

RPROVIDES:${PN} += "metacity-devel \
pkgconfig-libmetacity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmetacity3 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm

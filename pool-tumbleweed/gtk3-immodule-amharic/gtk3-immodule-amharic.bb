SUMMARY = "Amharic input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-amharic-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "21e71efab9a6436dac69efb6bc9f21ef112c19dc88d98b55daa062fcb2af0e40d44377f55c1b0e14d81000d2ad43dcf41d743fb865d7e747cd97817b4bdb8b72"

RPROVIDES:${PN} += "gtk3-immodule-amharic \
locale-gtk3-am"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

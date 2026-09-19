SUMMARY = "Broadway input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Broadway."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-broadway-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "3c5101804401a236e80513b29f9903e3c0e916a001866249b65aa0bd294d6b2cd625d898bc8a905eb0d83009c6fc23cf063b6f91cee2576e9d3f4163ce797eee"

RPROVIDES:${PN} += "gtk3-immodule-broadway"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

SUMMARY = "Xfconf Shared Library"
DESCRIPTION = "GObject introspection bindings for Xfconf"
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "typelib-1_0-Xfconf-0-4.20.0-1.9.aarch64.rpm"
RPM_HASH = "9598cf93beac3c183870396116920a9954390e2c9054f9ad26382325ebe1df0a0961cc4d0b8765c3088ffbdca40269237adcae9ba31ad06380529e2d900b9489"

RPROVIDES:${PN} += "typelib-1-0-Xfconf-0 \
typelib-Xfconf"

RDEPENDS:${PN} += "libxfconf-0.so.3 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

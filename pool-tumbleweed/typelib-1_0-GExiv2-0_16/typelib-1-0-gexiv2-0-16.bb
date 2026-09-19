SUMMARY = "A GObject-based Exiv2 wrapper - Introspection bindings"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the GObject Introspection bindings for the \
libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "typelib-1_0-GExiv2-0_16-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "765b383915b094c7bda548548020b3f7537ec8a4426b98224f420b15c95e0528f2aa53a4921646197b533447323187c1efef87624017fb3f12e95c83b69fd9ef"

RPROVIDES:${PN} += "typelib-1-0-GExiv2-0-16 \
typelib-GExiv2"

RDEPENDS:${PN} += "libgexiv2-0.16.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

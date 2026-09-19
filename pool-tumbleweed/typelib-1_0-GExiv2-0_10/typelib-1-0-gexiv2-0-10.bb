SUMMARY = "A GObject-based Exiv2 wrapper - Introspection bindings"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the GObject Introspection bindings for the \
libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.6"

RPM_NAME = "typelib-1_0-GExiv2-0_10-0.14.6-2.4.aarch64.rpm"
RPM_HASH = "1e3178ac1c232faa7bd536e45249cfe4349af6f6a8be5e8cafb1cdb32d63cb9c0fbaa449333e8ee8c798007608bc9386f51e2404bd33db1052de3368abef5d7c"

RPROVIDES:${PN} += "typelib-1-0-GExiv2-0-10 \
typelib-GExiv2"

RDEPENDS:${PN} += "libgexiv2.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

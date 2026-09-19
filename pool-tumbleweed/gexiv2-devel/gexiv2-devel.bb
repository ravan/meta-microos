SUMMARY = "A GObject-based Exiv2 wrapper -- Development Files"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "gexiv2-devel-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "412a010e7114b8fd372c4eaa1c52624ea0774b02744bbf81faec685e62d80145e0723f345eca76ecf9199da62b1021346b9dde0fc9c32e83b328e52e7a980918"

RPROVIDES:${PN} += "gexiv2-devel \
pkgconfig-gexiv2-0.16"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgexiv2-0-16-4 \
pkgconfig-exiv2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-GExiv2-0-16"

inherit rpm

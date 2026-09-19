SUMMARY = "Introspection bindings for gdk-pixbuf"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package provides the GObject Introspection bindings for gdk-pixbuf."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44.7"

RPM_NAME = "typelib-1_0-GdkPixbuf-2_0-2.44.7-1.2.aarch64.rpm"
RPM_HASH = "42cb49eabb31342f6956976607f0fea3db0ac2cac976cd21d456f2ef519ea90a74a0558a271b8d757f709901bbc6a14a540fa40a67936d4cab3c47beb6a340c5"

RPROVIDES:${PN} += "typelib-1-0-GdkPixbuf-2-0 \
typelib-GdkPixbuf"

RDEPENDS:${PN} += "libgdk-pixbuf-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

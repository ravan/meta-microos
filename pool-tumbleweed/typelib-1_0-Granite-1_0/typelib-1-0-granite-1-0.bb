SUMMARY = "Introspection bindings for the Granite development library"
DESCRIPTION = "This package provides the GObject Introspection bindings for libgranite6."
LICENSE = "LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "typelib-1_0-Granite-1_0-6.2.0-2.8.aarch64.rpm"
RPM_HASH = "be66c7e6b0a6d16ec8b9864c9ecddcd18b35ade96c9d07ed64e06b16622b2b5a35db2af6fbf05ba659a019b560ed365b47acf0e05cd6fa816c2cfc8ae3c7f2e4"

RPROVIDES:${PN} += "typelib-1-0-Granite-1-0 \
typelib-Granite"

RDEPENDS:${PN} += "libgranite.so.6 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

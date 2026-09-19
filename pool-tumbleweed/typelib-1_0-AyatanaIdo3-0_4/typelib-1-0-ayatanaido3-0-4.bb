SUMMARY = "Ayatana Indicator Display Objects typelib"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package provides the GObject Introspection bindings for \
Ayatana Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.10.4"

RPM_NAME = "typelib-1_0-AyatanaIdo3-0_4-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "b32d2200769c7a6c968960ef7aee3e4447934df9f44d249c11f21bbe5fa2a15725b370fcddd8b2a108303be272111ae41d00dd524aa98669aa751381da0ee9b5"

RPROVIDES:${PN} += "typelib-1-0-AyatanaIdo3-0-4 \
typelib-AyatanaIdo3"

RDEPENDS:${PN} += "libayatana-ido3-0.4.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

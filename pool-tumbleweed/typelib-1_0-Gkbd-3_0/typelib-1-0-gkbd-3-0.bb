SUMMARY = "Introspection bindings for libgnomekbd"
DESCRIPTION = "GNOME keyboard library and utility. \
 \
This package provides the GObject Introspection bindings for \
libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "typelib-1_0-Gkbd-3_0-3.28.1-1.15.aarch64.rpm"
RPM_HASH = "2f4d3ec0cfbe7f5b38fc0dd91ad9ef8acac40d49a1d167878ebc69c99cbe818576bece60a1f2a2c1078304821137cf73ad4b3f29fbfbadc7cf3a1f0d4deeda58"

RPROVIDES:${PN} += "typelib-1-0-Gkbd-3-0 \
typelib-Gkbd"

RDEPENDS:${PN} += "libgnomekbd.so.8 \
libgnomekbdui.so.8 \
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
typelib-Xkl \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

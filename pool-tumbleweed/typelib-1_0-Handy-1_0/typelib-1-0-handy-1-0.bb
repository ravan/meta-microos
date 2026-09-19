SUMMARY = "Introspection bindings for libhandy"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libhandy, a library to help with developing mobile UI using \
GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.3"

RPM_NAME = "typelib-1_0-Handy-1_0-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "d783c7b6f1d420d053309256fc98ac4f1e16e449b1ad951b75b5d1275f0216c63b88f4edc49357417106572bcde863bd2517f5a91dca8788c3369e2710f10369"

RPROVIDES:${PN} += "typelib-1-0-Handy-1-0 \
typelib-Handy"

RDEPENDS:${PN} += "libhandy-1.so.0 \
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

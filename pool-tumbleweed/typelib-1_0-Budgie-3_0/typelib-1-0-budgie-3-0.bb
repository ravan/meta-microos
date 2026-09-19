SUMMARY = "Main Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Applets using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "typelib-1_0-Budgie-3_0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "f9aabfde869f6bdb1d6b5339680c7219c589938e0a467955cf5edb78f7e43b45586e6576ce6d37579497df596aa8a4b7c3cae492c0ec5ee182b165f0e127cbd3"

RPROVIDES:${PN} += "typelib-1-0-Budgie-3-0 \
typelib-Budgie"

RDEPENDS:${PN} += "libbudgie-plugin.so.0 \
typelib-1-0-Peas-2 \
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
typelib-Peas \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

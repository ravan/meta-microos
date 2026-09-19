SUMMARY = "Window Navigator Construction Kit (Library Package) -- Introspection bindings"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides the GObject Introspection bindings for libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "43.3"

RPM_NAME = "typelib-1_0-Wnck-3_0-43.3-2.4.aarch64.rpm"
RPM_HASH = "b78ed0a5a80c3f28d2ac6d92099ae8f1a7adf442f365a906560779b91c8492947d37e4d8818d43e96c07d38dc406ea2d403530d49aaa4879ce440627402e105d"

RPROVIDES:${PN} += "typelib-1-0-Wnck-3-0 \
typelib-Wnck"

RDEPENDS:${PN} += "libwnck-3.so.0 \
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

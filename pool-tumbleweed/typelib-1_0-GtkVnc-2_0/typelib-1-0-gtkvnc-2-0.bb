SUMMARY = "A GTK widget for VNC clients -- Introspection bindings"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the \
libgtk-vnc library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "typelib-1_0-GtkVnc-2_0-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "27f1392b8b230e60bd6e3b5d6f0ef6b5fdf68d40175e7fae57a4345ebc5173cf0cd47264852128249dd9b3182d62252c30bcdcaba97489a11ca8fb9849d623d2"

RPROVIDES:${PN} += "typelib-1-0-GtkVnc-2-0 \
typelib-GtkVnc"

RDEPENDS:${PN} += "libgtk-vnc-2.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GVnc \
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

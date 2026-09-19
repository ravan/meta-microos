SUMMARY = "Library to build screen lockers with GTK"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for gtk-session-lock."
LICENSE = "GPL-3.0 & MIT"

PV = "0.2.0"

RPM_NAME = "typelib-1_0-GtkSessionLock-0_1-0.2.0-1.10.aarch64.rpm"
RPM_HASH = "b33766106214f94c13185723e61c8de9f99a3c781fcf175e7f13886ce1bf124367c725606cbe2b9dc154d09c0c5ea95cfe7aa871902c25527abb3504c3d2a7d3"

RPROVIDES:${PN} += "typelib-1-0-GtkSessionLock-0-1 \
typelib-GtkSessionLock"

RDEPENDS:${PN} += "libgtk-session-lock.so.0 \
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

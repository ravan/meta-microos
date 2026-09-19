SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Introspection bindings"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for libdazzle."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "typelib-1_0-libdazzle-1_0-3.44.0-2.7.aarch64.rpm"
RPM_HASH = "afaf4675011e51097ea7aaf7da8adb654525864f413d4176519917749df40a40a0da86fce90daee3ab4538a6f615aa1957884b9d63e1c1fbc3e8f5341f7e61b5"

RPROVIDES:${PN} += "typelib-1-0-libdazzle-1-0 \
typelib-Dazzle"

RDEPENDS:${PN} += "libdazzle-1.0.so.0 \
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

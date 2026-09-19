SUMMARY = "Introspection bindings for the GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "typelib-1_0-Gtk-3_0-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "7f15d363342286ced3a9bf82616da104e0509013623bc8f07e5b24427f976fbc8d1f180420cd59f607edb221cb90337b55a4e7ddbd114d668a24faec726dad0b"

RPROVIDES:${PN} += "typelib-1-0-Gtk-3-0 \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gtk"

RDEPENDS:${PN} += "libgdk-3.so.0 \
libgtk-3.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

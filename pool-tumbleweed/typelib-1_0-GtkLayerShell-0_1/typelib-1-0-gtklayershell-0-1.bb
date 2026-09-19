SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for gtk-layer-shell."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.10.1"

RPM_NAME = "typelib-1_0-GtkLayerShell-0_1-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "7fb77cb918ec702eaf2d55b6f8620c5ed6d998025a2f2c1dd846ab472a75792e86437c838916ea1568ad2ec73857820c75575d410eabc6a49fce4b864a8c90e0"

RPROVIDES:${PN} += "typelib-1-0-GtkLayerShell-0-1 \
typelib-GtkLayerShell"

RDEPENDS:${PN} += "libgtk-layer-shell.so.0 \
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

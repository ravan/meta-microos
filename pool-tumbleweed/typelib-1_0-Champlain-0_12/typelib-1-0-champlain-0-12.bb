SUMMARY = "Library to display maps -- Introspection bindings"
DESCRIPTION = "Libchamplain is a C library providing a ClutterActor to display maps. It \
also provides a Gtk+ widget to display maps in Gtk+ applications. \
 \
This package provides the GObject Introspection bindings for \
libchamplain."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.21"

RPM_NAME = "typelib-1_0-Champlain-0_12-0.12.21-1.17.aarch64.rpm"
RPM_HASH = "27174a639eb1ea446bafa61e6f22f43c3a86168b79649e58a04dc53006bdf6d3b66caf884b5017c0a28bf1ff0b490558d43c09db868fe60ba7da4813c4af296f"

RPROVIDES:${PN} += "typelib-1-0-Champlain-0-12 \
typelib-Champlain \
typelib-GtkChamplain"

RDEPENDS:${PN} += "libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

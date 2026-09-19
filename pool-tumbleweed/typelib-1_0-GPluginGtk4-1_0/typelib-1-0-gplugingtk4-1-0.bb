SUMMARY = "Gtk4 Typelib for gplugin"
DESCRIPTION = "Gtk4 Typelib for gplugin."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "typelib-1_0-GPluginGtk4-1_0-0.44.2-2.4.aarch64.rpm"
RPM_HASH = "99627b27e85d6e535ac03e7ed13621f15bbbe92d186a6060bf14798b0d0a54214afea9d2fe41174aaee7cb052882e73a4c9bb7a41096aa350b198e4d7fec8841"

RPROVIDES:${PN} += "typelib-1-0-GPluginGtk4-1-0 \
typelib-GPluginGtk4"

RDEPENDS:${PN} += "libgplugin-gtk4.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GPlugin \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm

SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "This package provides the GObject Introspection bindings for gtk4-layer-shell."
LICENSE = "MIT"

PV = "1.3.0+git21.cbfdd73"

RPM_NAME = "typelib-1_0-Gtk4SessionLock-1_0-1.3.0+git21.cbfdd73-1.1.aarch64.rpm"
RPM_HASH = "51b1a1ad4e3bad4a8b89fb6ad516156e285ae039c6fe34e506240e6b72dabc4f1b3dc6e50ad1d55462df824f3930b8224ae336fbc33c42b12d901d4fd77bb35c"

RPROVIDES:${PN} += "typelib-1-0-Gtk4SessionLock-1-0 \
typelib-Gtk4SessionLock"

RDEPENDS:${PN} += "libgtk4-layer-shell.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
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

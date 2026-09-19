SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "This package provides the GObject Introspection bindings for gtk4-layer-shell."
LICENSE = "MIT"

PV = "1.3.0+git21.cbfdd73"

RPM_NAME = "typelib-1_0-Gtk4LayerShell-1_0-1.3.0+git21.cbfdd73-1.1.aarch64.rpm"
RPM_HASH = "3f32ee8f15ddb46502251577835eadbbb93af37c58d274f6236fb2630a5d0edafa484a8f04c8ddb6734bcb4712780365c845d02dd0ff65a6e76ab63b2518d370"

RPROVIDES:${PN} += "typelib-1-0-Gtk4LayerShell-1-0 \
typelib-Gtk4LayerShell"

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

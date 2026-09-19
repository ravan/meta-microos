SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.84.1"

RPM_NAME = "typelib-1_0-Vte-3_91-0.84.1-1.2.aarch64.rpm"
RPM_HASH = "115db53d30d2eaed4117d913312650e2ed0b2aa1b9aec96537d535ad142d66baaa590ce008128d49a80c3ee50cc84942677971c48f6dc40740048f8f74ada487"

RPROVIDES:${PN} += "typelib-1-0-Vte-3-91 \
typelib-Vte"

RDEPENDS:${PN} += "libvte-2.91-gtk4.so.0 \
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

SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.84.1"

RPM_NAME = "typelib-1_0-Vte-2_91-0.84.1-1.2.aarch64.rpm"
RPM_HASH = "39616d38bf175187d81e7f579a7444b24652421bbb1cfafc303dcd82d901f9b340d7fd54cf104e2cd153be5da8e1401ee22498d6889f6f59cf72908fb9d1c6f9"

RPROVIDES:${PN} += "typelib-1-0-Vte-2-91 \
typelib-1-0-Vte-2.91 \
typelib-Vte"

RDEPENDS:${PN} += "libvte-2.91.so.0 \
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

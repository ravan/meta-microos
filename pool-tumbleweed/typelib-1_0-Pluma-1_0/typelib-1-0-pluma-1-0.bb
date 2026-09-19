SUMMARY = "Introspection bindings for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "typelib-1_0-Pluma-1_0-1.28.1-1.3.aarch64.rpm"
RPM_HASH = "4382761f3519e06d9b2c4ad5ef8850793b805c694cf9c7cf9f66747444223f3efb572971997d17bfa2b97a86f45e8e295a56b7f0433bde3f5be35512cdf6c5f8"

RPROVIDES:${PN} += "typelib-1-0-Pluma-1-0 \
typelib-Pluma"

RDEPENDS:${PN} += "pluma \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

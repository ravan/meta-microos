SUMMARY = "Introspection bindings for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys. \
 \
This package provides the GObject Introspection bindings for \
libcryptui."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "typelib-1_0-CryptUI-0_0-3.12.2-12.7.aarch64.rpm"
RPM_HASH = "2b49ad87c8f7f404fa0149b7b55528a0f9af37fcb38ec0811255d02155dc33831a8f47cb132f0027bd666b4b0d59f4e77ca68f50b0cb399f0e9e15ebc18d2b90"

RPROVIDES:${PN} += "typelib-1-0-CryptUI-0-0 \
typelib-CryptUI"

RDEPENDS:${PN} += "libcryptui.so.0 \
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

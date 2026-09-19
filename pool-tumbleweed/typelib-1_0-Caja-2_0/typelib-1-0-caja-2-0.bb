SUMMARY = "MATE file manager typelib"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.0"

RPM_NAME = "typelib-1_0-Caja-2_0-1.28.0-1.14.aarch64.rpm"
RPM_HASH = "dd168b7bb9dfaa06c533fa18655849c0b89bcd8bc773eea989bcf9a202a86821debdcff075d15facaf335a167f9ec61cfa43aab4124b98abbd1512dae20701a3"

RPROVIDES:${PN} += "typelib-1-0-Caja-2-0 \
typelib-Caja"

RDEPENDS:${PN} += "libcaja-extension.so.1 \
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

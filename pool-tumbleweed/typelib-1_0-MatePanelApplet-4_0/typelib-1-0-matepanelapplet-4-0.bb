SUMMARY = "Introspection bindings for the MATE panel applet library"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "typelib-1_0-MatePanelApplet-4_0-1.28.1-2.14.aarch64.rpm"
RPM_HASH = "a53b6699693a598cf764df127de78b83660014560cd0ebc01125232f559a8d120285ca915d0ef8ae74222d141f0aca1ea19e0d0b9911cd00d47739fdb62e683a"

RPROVIDES:${PN} += "typelib-1-0-MatePanelApplet-4-0 \
typelib-MatePanelApplet"

RDEPENDS:${PN} += "libmate-panel-applet-4.so.1 \
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

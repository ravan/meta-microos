SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "typelib-1_0-GnomeDesktop-3_0-44.5-1.5.aarch64.rpm"
RPM_HASH = "e1889c6ec26145aebf30c6c5d77cd46c069e308b8f3e5f644c0ef6535a57bcc217f25fcc627e6fed1157ea5bc0fa7d9a5572ce002b1d88d31876fdb9ce774ee1"

RPROVIDES:${PN} += "typelib-1-0-GnomeDesktop-3-0 \
typelib-GnomeDesktop"

RDEPENDS:${PN} += "libgnome-desktop-3.so.20 \
typelib-Atk \
typelib-GDesktopEnums \
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

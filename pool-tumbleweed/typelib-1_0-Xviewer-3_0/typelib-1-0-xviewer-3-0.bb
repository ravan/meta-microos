SUMMARY = "Typelib for xviewer"
DESCRIPTION = "This package provides the typelib for xviewer"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.4.16"

RPM_NAME = "typelib-1_0-Xviewer-3_0-3.4.16-2.3.aarch64.rpm"
RPM_HASH = "21198d286c084a0f7660d083210a66bcfc69833a1a36caddf0575e204c52d6dd9980892a6c115fe18e31033f22eb32ea2e3d9ef752b1e9b3665763fee9f58170"

RPROVIDES:${PN} += "typelib-1-0-Xviewer-3-0 \
typelib-Xviewer"

RDEPENDS:${PN} += "libxviewer.so \
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

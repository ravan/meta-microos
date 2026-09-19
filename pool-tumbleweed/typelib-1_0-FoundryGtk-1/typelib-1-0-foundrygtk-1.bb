SUMMARY = "IDE library and command-line companion tool"
DESCRIPTION = "This tool aims to extract much of what makes GNOME Builder an IDE into a \
library and companion command-line tool."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & Apache-2.0"

PV = "1.1.1"

RPM_NAME = "typelib-1_0-FoundryGtk-1-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "1a27ec5260eb7a7afae3877fb470862f1172d0c3c87289833d6fa99228af20896cf7e1536c7318fc90205a977fa1e2cfe9742c2488ada60e7eeeeca8016899e2"

RPROVIDES:${PN} += "typelib-1-0-FoundryGtk-1 \
typelib-FoundryAdw \
typelib-FoundryGtk"

RDEPENDS:${PN} += "libfoundry-adw-1.so.1 \
libfoundry-gtk-1.so.1 \
typelib-Adw \
typelib-Dex \
typelib-Foundry \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-Peas \
typelib-cairo \
typelib-freetype2"

inherit rpm

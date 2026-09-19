SUMMARY = "Advanced MATE menu"
DESCRIPTION = "An advanced menu for MATE. Supports filtering, favourites, \
autosession, and many other features. \
 \
This menu originated in the Linux Mint distribution and has \
been ported to other distributions that ship the MATE Desktop \
Environment."
LICENSE = "GPL-2.0-or-later"

PV = "22.04.2"

RPM_NAME = "mate-menu-22.04.2-3.3.noarch.rpm"
RPM_HASH = "ec91dbd1a6b3ed27f2077ec28bcb8f9b5f54d33f026f3d0578b86c850a42758a7aea3e449e8cc60baa2e456695d287f46421231e5adaba2effd18aebbfb1f6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-menu \
python3.13dist-mate-menu \
python3dist-mate-menu"

RDEPENDS:${PN} += "/usr/bin/python3 \
glib2-tools \
gvfs \
mate-menus \
mozo \
python-abi \
python3-Unidecode \
python3-configobj \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
python3-setproctitle \
python3-xlib \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-MateMenu \
typelib-MatePanelApplet \
typelib-Pango \
xdg-utils"

inherit rpm

SUMMARY = "Menu editor for GNOME"
DESCRIPTION = "Alacarte is a simple freedesktop.org compliant menu editor for GNOME \
that lets you change your menus, simply and quickly. Just click and \
type to edit, add, and delete any menu entry."
LICENSE = "LGPL-2.1-or-later"

PV = "3.58.0"

RPM_NAME = "alacarte-3.58.0-2.2.noarch.rpm"
RPM_HASH = "76788ae1f5a211756b2eeafa99dd0b9121543aae81b13e74d914ba1405505a0214cb9b22509e249bb0859080c875dd88d641160220e3001aa65c0e6d0d9575cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacarte"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject-Gdk \
typelib-GLib \
typelib-GMenu \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk"

inherit rpm

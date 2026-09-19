SUMMARY = "MATE Desktop menu editor"
DESCRIPTION = "This package provides Mozo, a menu editor for the MATE Desktop, \
using the freedesktop.org menu specification."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "mozo-1.28.0-2.4.noarch.rpm"
RPM_HASH = "47519e0f8535586bb51f85ba1b830db6741b92983dfa1fdf26e81d223f51a4279236995055c2793de0a5fe12624bbecbb90e4d0425dd83a6b5df9fe04bccca5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-menu-editor \
mozo"

RDEPENDS:${PN} += "/usr/bin/python3 \
mate-menus \
python-abi \
python3-gobject \
python3-gobject-Gdk \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-MateMenu"

inherit rpm

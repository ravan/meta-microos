SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python314-gobject-Gdk-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "a9a22d4a8d0ad9156e4c3eca097a74d5c4f51c129cd80148787ee1fd6951ad63ed860c0417e57bf8b806a52a587fb2067b4dfae4674eb0d05155cd6ca243433a"

RPROVIDES:${PN} += "python314-gobject-Gdk"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
python314-gobject-cairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-cairo"

inherit rpm

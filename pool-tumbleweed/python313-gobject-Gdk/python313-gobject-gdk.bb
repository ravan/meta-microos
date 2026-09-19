SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python313-gobject-Gdk-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "408a60b6ed2a578c4520fc3b97290a422ef02cf5a5da2ebb933a1123910ae0f045f233ef3c41f8e9abc2816de98d8b334a33ee229394af230f3c3a57fa311aee"

RPROVIDES:${PN} += "python3-gobject-Gdk \
python313-gobject-Gdk"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
python313-gobject-cairo \
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

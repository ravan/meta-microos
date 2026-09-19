SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python314-gobject-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "b04156e05dd68c331d6ed4d218e70cddc8c6bf8a178125746085abb76e55fad307de528d2656dcacfd9366e0113355d78e4f08b046fac76ca480f18f8849845f"

RPROVIDES:${PN} += "python3.14dist-pygobject \
python314-gobject \
python314-pygobject \
python3dist-pygobject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python-abi \
typelib-GLib \
typelib-GLibUnix \
typelib-GObject \
typelib-Gio \
typelib-GioUnix"

inherit rpm

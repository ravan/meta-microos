SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python313-gobject-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "ae3fa3a6031d69827a0c4b532fac231a781440b09cf20fadccdfc891f76fed0f5bcbe582896fe4990d87a9e6e953287ec513cee09a465331d3a0d0243e27d7d1"

RPROVIDES:${PN} += "python3-gobject \
python3-pygobject \
python3.13dist-pygobject \
python313-gobject \
python313-pygobject \
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

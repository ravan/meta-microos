SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python313-gobject-cairo-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "7d53d37c1b88e7f92e817a7f68fba6ce5eab942c8ecefaddd7f72498e82c0e35309bb63cac6b134513680e398580c50a9da750251f8e136b4ef0b0b1b2f61fc2"

RPROVIDES:${PN} += "python3-gobject-cairo \
python313-gobject-cairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgobject-2.0.so.0 \
python-abi \
python313-cairo \
python313-gobject"

inherit rpm

SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python314-gobject-cairo-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "a5177256f174251a4caab5875d92333488f868060284080b862ff79135c7235367970a2191a6fd4ff01db33f14ae3d5515998f92f1ca48deb0e8c67907d52eaf"

RPROVIDES:${PN} += "python314-gobject-cairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgobject-2.0.so.0 \
python-abi \
python314-cairo \
python314-gobject"

inherit rpm

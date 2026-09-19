SUMMARY = "Introspection bindings for the libmirage CD-ROM image access library"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package provides the GObject Introspection bindings for libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "typelib-1_0-libmirage-3_2-3.3.2-2.1.aarch64.rpm"
RPM_HASH = "ffee11cee92a9fb4897691b785fbd68802e834a0375beddc778bb4fc59b239e945cb17c3a4ecfeebd236cd5c2a79ceba11d090743a600367c2d46ee71c5e72d0"

RPROVIDES:${PN} += "typelib-1-0-libmirage-3-2 \
typelib-Mirage"

RDEPENDS:${PN} += "libmirage.so.12 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

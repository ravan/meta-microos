SUMMARY = "Gobject introspection files for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "typelib-1_0-GSound-1_0-1.0.3-2.21.aarch64.rpm"
RPM_HASH = "f560f0b02aa6f12dd9ec3e6d6200108f66da9811965b60098002d447d3abe61daf8db856a1b2578ae3457d7cd022f8fd47c789a39082dab4e6b1430fad6ab699"

RPROVIDES:${PN} += "typelib-1-0-GSound-1-0 \
typelib-GSound"

RDEPENDS:${PN} += "libgsound.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

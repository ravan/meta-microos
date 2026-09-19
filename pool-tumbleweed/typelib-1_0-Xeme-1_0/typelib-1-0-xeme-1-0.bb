SUMMARY = "Library files for xeme"
DESCRIPTION = "Library files for xeme."
LICENSE = "LGPL-2.1-or-later"

PV = "0+64"

RPM_NAME = "typelib-1_0-Xeme-1_0-0+64-1.5.aarch64.rpm"
RPM_HASH = "17f1e414ab5a9b3cd65b0b5eb396c00d961d3517302af36dbb48ecbc88cd41ce119bdfe6a01ff51cf3f48e15778c7539a780268d4ff7235495d6cca4e69e74b8"

RPROVIDES:${PN} += "typelib-1-0-Xeme-1-0 \
typelib-Xeme"

RDEPENDS:${PN} += "libxeme.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

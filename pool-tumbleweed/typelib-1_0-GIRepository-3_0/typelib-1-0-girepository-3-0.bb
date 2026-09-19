SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "typelib-1_0-GIRepository-3_0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "95f06f8333cf173c825eeb82dc04d77adb50b413bad6affd03410672d08a8317b27615465f13ee14b8801c367075118af7641d78d48464abfa271cb5ff2a8bbb"

RPROVIDES:${PN} += "typelib-1-0-GIRepository-3-0 \
typelib-GIRepository"

RDEPENDS:${PN} += ""

inherit rpm

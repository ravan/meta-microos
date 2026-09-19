SUMMARY = "Introspection bindings for libfprint"
DESCRIPTION = "This package contains the introspection bindings for the libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "typelib-1_0-FPrint-2_0-1.94.10+tod1-3.1.aarch64.rpm"
RPM_HASH = "238e6cbcf2140a035abfa0dcea2521530ed1d48dc29fe5fb6ec73f44b1f6b1d817ecd951512ae375ac2e195f842d78eac209ccd32531f021e7f1c989be08713c"

RPROVIDES:${PN} += "typelib-1-0-FPrint-2-0 \
typelib-FPrint"

RDEPENDS:${PN} += "libfprint-2.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GUsb \
typelib-Gio \
typelib-Json"

inherit rpm

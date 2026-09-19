SUMMARY = "Introspection bindings for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package contains the introspection files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "typelib-1_0-GCab-1_0-1.6-2.1.aarch64.rpm"
RPM_HASH = "2f918b72ca27149608b5fdc56b60af7f7fcb5ace1ee1b4e236b1a3b9ecbe5b973fb4ad3f862df85e56312913619140675d6d7df45481976b016b4ba9f52aa661"

RPROVIDES:${PN} += "typelib-1-0-GCab-1-0 \
typelib-GCab"

RDEPENDS:${PN} += "libgcab-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

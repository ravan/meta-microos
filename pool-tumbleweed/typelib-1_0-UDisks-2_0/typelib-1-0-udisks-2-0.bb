SUMMARY = "Introspection bindings for the UDisks Client Library version 2"
DESCRIPTION = "UDisks provides a daemon, D-Bus API and command line tools \
for managing disks and storage devices. \
 \
This package provides the GObject Introspection bindings for \
the UDisks client library."
LICENSE = "LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "typelib-1_0-UDisks-2_0-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "0fc415aad0715afb6e636676d1e915b8344f1a36a01706dca67d617235979ceb93a1bb39627e3bb73d01f832ee4a6a1e1255b55bb1ed631e605ba895ef1369e7"

RPROVIDES:${PN} += "typelib-1-0-UDisks-2-0 \
typelib-UDisks"

RDEPENDS:${PN} += "libudisks2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

SUMMARY = "GUI to configure connections for NetworkManager"
DESCRIPTION = "NetworkManager Configuration tool - take control over your \
connection settings."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "NetworkManager-connection-editor-1.36.0-5.3.aarch64.rpm"
RPM_HASH = "88813b219101ef1b185f0564d27aca6c4b2213465ce73d9189d2d8fc8ccb36739c9a9008be6a504318a77924d6aceaf67ad1b14a43b0eb119ff77b6702fd96ce"

RPROVIDES:${PN} += "NetworkManager-connection-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjansson.so.4 \
libnm.so.0 \
libnma.so.0 \
mobile-broadband-provider-info"

inherit rpm

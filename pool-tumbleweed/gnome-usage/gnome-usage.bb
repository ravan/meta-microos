SUMMARY = "System resources viewer for GNOME"
DESCRIPTION = "GNOME Usage is a program to view information about the use of system \
resources, like memory and disk space."
LICENSE = "GPL-3.0-only"

PV = "48.0+13"

RPM_NAME = "gnome-usage-48.0+13-1.1.aarch64.rpm"
RPM_HASH = "8a0e85fa528f902f976437086f26385908b0df0d4d8c125a662c54a69eae01b48a8d89adfaa1ec4b094e98cec4b81536bbae1cea7d385dda350cd84a5d72bcab"

RPROVIDES:${PN} += "gnome-usage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtop-2.0.so.11 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libnm.so.0 \
libpango-1.0.so.0 \
libtinysparql-3.0.so.0"

inherit rpm

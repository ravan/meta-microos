SUMMARY = "Gtk4 libs for gplugin"
DESCRIPTION = "Gtk4 libs for gplugin."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "libgplugin-gtk4-0-0.44.2-2.4.aarch64.rpm"
RPM_HASH = "8b549eb604bc41e812d3f8769f385907bcdd879b9222ca89f0b9c58020719ed396f817554b0bad053d27fd8a9c4a05a3adba9d8a28521c8a74854427add8323e"

RPROVIDES:${PN} += "libgplugin-gtk4-0 \
libgplugin-gtk4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgplugin.so.0 \
libgtk-4.so.1"

inherit rpm

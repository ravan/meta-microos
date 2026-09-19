SUMMARY = "Development files for gplugin"
DESCRIPTION = "Development files for gplugin."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "gplugin-devel-0.44.2-2.4.aarch64.rpm"
RPM_HASH = "73669717d55a8dd013ba42215ff869005e7bce974a7d5b41530c12950e5de6a577fbdcc19e3c1fa418629703c071242d74785d657ae9b47db4ab5bf6dd3b4a12"

RPROVIDES:${PN} += "gplugin-devel \
pkgconfig-gplugin \
pkgconfig-gplugin-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgplugin-gtk4-0 \
libgplugin.so.0 \
libgplugin0 \
liblua5.4.so.5 \
libpython3.13.so.1.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gplugin \
pkgconfig-gtk4 \
typelib-1-0-GPlugin-1-0 \
typelib-1-0-GPluginGtk4-1-0"

inherit rpm

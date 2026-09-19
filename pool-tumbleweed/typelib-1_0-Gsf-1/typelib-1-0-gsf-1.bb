SUMMARY = "Introspection bindings for the GNOME desktop Office files thumbnailer"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.58"

RPM_NAME = "typelib-1_0-Gsf-1-1.14.58-1.3.aarch64.rpm"
RPM_HASH = "b67a9d863a4fc322c228be1d29579d65f9874cd470ec743f8dd62e60b7ab0a604c8ba432fc2c5e229cb225e86d605a919e671001f349850b50f74ff05dcd3792"

RPROVIDES:${PN} += "typelib-1-0-Gsf-1 \
typelib-Gsf"

RDEPENDS:${PN} += "libgsf-1.so.114 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm

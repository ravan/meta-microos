SUMMARY = "Development files for libjson-glib"
DESCRIPTION = "JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
This package contains development files needed to develop with the \
json-glib library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.8"

RPM_NAME = "json-glib-devel-1.10.8-2.1.aarch64.rpm"
RPM_HASH = "fefee0c83a5d8f7a2684d89d7de3e4f4613df005792d075e302b90cea8abaf713ad2c377b3ddcc0cf6199fa46e4a64bac45a02d32fed8cb80d19cb744a4a09fd"

RPROVIDES:${PN} += "json-glib-devel \
pkgconfig-json-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1-0-0 \
libjson-glib-1.0.so.0 \
pkgconfig-gio-2.0 \
typelib-1-0-Json-1-0"

inherit rpm

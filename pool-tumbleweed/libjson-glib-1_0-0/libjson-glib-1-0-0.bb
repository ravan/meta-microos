SUMMARY = "Library for JavaScript Object Notation format"
DESCRIPTION = "JSON is a lightweight data-interchange format. It is comparatively \
easy for humans to read and write, and for machines to parse and generate. \
 \
JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
JSON-GLib uses GLib native data types and the generic value container \
GValue for ease of development. It also provides integration with the \
GObject classes for direct serialization into, and deserialization from, \
JSON data streams."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.8"

RPM_NAME = "libjson-glib-1_0-0-1.10.8-2.1.aarch64.rpm"
RPM_HASH = "fa7e5829538958d88b2b6abe09610b1a245686b60b3ae9df7dac48e188d07714d99bcc223b0306e2e38541735c946faf9848506e05aed8c47a39662f3aa0a823"

RPROVIDES:${PN} += "json-glib \
libjson-glib-1-0-0 \
libjson-glib-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

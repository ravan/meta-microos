SUMMARY = "GObject wrapper for libical library"
DESCRIPTION = "This package provides a GObject wrapper for libical library with support \
for GObject Introspection."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "libical-glib3-3.0.20-1.8.aarch64.rpm"
RPM_HASH = "6fb276d137d2177bfdd794c36e7c705746827ac635e3dd5c64bbcc01744fbf9580791e7245550363fbba154df7d0c2224165229649608329e641e48b708eab12"

RPROVIDES:${PN} += "libical-glib \
libical-glib.so.3 \
libical-glib3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical.so.3"

inherit rpm

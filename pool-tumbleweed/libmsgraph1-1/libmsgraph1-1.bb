SUMMARY = "Library for accessing online serive APIs using MS Graph protocol"
DESCRIPTION = "libmsgraph is a GLib-based library for accessing online serive APIs using MS Graph protocol."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.5"

RPM_NAME = "libmsgraph1-1-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "302547bb9c96dc0e641294d6f623b928bdc4e7a5ac54c828bc72177f911c83107d7be98aec3043ac4a18612c160461df7ca6a1be6896f2ce1ae5d84b844ddbf0"

RPROVIDES:${PN} += "libmsgraph-1.so.1 \
libmsgraph1-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm

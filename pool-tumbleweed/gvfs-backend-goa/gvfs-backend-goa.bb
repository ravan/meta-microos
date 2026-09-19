SUMMARY = "GNOME online accounts functionality for GLib"
DESCRIPTION = "This package provides a gvfs backend that supports GNOME online \
accounts integration."
LICENSE = "LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-backend-goa-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "b5133758dbd3803e81322e74a179da46cfee5e90a035f4974bf012a075462a41cb72a72082dbcf094827b59530c20a65f5393999af4047d0bb47593b91bdbbe9"

RPROVIDES:${PN} += "gvfs-backend-goa"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libmsgraph-1.so.1"

inherit rpm

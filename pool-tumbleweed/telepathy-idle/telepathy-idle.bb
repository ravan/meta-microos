SUMMARY = "IRC support for Telepathy"
DESCRIPTION = "Telepathy-idle provides IRC support for Telepathy."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.2"

RPM_NAME = "telepathy-idle-0.2.2-1.22.aarch64.rpm"
RPM_HASH = "24cf367b4a6b92b7e113084fce49817c9379a73f1d73d4690bb70667f7c0f47a3b7626a0ffb050dc70851ab8b09004c7eb5bb660e9d8624d5a0884657999bde0"

RPROVIDES:${PN} += "telepathy-idle"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm

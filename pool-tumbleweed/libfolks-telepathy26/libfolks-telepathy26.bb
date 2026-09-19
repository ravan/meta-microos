SUMMARY = "Telepathy backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "libfolks-telepathy26-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "f26df3e0cb5747f4dcf3a9a8794c82ee6235a99764e4265f069fbd8efa76d3d3fca4fafc5c1f4897a82d9191a4ed4bc753d4ba193270277c12bf45ca6a65619f"

RPROVIDES:${PN} += "libfolks-telepathy.so.26 \
libfolks-telepathy26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm

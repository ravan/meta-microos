SUMMARY = "Library to handle UPnP IGD port mapping"
DESCRIPTION = "GUPnP-IGD is a library to handle UPnP IGD port mapping. It is supposed \
to have a very simple API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "libgupnp-igd-1_6-0-1.6.0-2.13.aarch64.rpm"
RPM_HASH = "c69c158123625d93ab427c80e3ba1c4bd069fbef25e57dbb1515941674195af117d2971a8157fbd560cab21eb8595f7400d7a293395a18e378f9d2092a64ebba"

RPROVIDES:${PN} += "libgupnp-igd-1-6-0 \
libgupnp-igd-1.6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0"

inherit rpm

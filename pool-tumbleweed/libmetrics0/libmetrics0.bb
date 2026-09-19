SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "libmetrics0-1.2-3.7.aarch64.rpm"
RPM_HASH = "07e75034b8d47fd4c8e0ba198abe2b9b332b5e57a29e532e7d90228b24a526926f4be963a9e07e29a8f3cecf2b01354fb3a1c6a7360cb79ea3acd75e585e598b"

RPROVIDES:${PN} += "libmetrics.so.0 \
libmetrics0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16"

inherit rpm

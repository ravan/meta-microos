SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "vm-dump-metrics-1.2-3.7.aarch64.rpm"
RPM_HASH = "bc517e77d2a9628147a70f587f1e828046aeb63894c5e8b5e6edeb31c823b88732d09770890d494bd178cc2aa1efc75117f8b38f7c19e35d67c432b14374573d"

RPROVIDES:${PN} += "vm-dump-metrics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16"

inherit rpm

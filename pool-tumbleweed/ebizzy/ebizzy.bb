SUMMARY = "Web server application workload generator"
DESCRIPTION = "ebizzy is designed to generate a workload resembling common web application \
server workloads. It is highly threaded, has a large in-memory working set, and \
allocates and deallocates memory frequently."
LICENSE = "GPL-2.0-only"

PV = "0.3"

RPM_NAME = "ebizzy-0.3-2.3.aarch64.rpm"
RPM_HASH = "d9b981c3dedbb7d8b3c6d7897db3892b96eabaf345b4462a6e12c6787502dd675ff9d672525d54b11aa8c41554c8ed68f64ec948f54c932e335d222dd0a2f403"

RPROVIDES:${PN} += "ebizzy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

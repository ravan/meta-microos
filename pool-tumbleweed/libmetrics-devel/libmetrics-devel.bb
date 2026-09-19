SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "libmetrics-devel-1.2-3.7.aarch64.rpm"
RPM_HASH = "b214356ab5ff69801e231e8dba880e8739fc34035efa460c9fa02c97feaa9a8257586c5293b96b913db294cfd069b7aa8736ebfe7fc00563ab80e9628bc1a214"

RPROVIDES:${PN} += "libmetrics-devel"

RDEPENDS:${PN} += "libmetrics0"

inherit rpm

SUMMARY = "Collect DPDK interface statistics"
DESCRIPTION = "This plugin has a specific use case: monitoring DPDK applications \
that don't expose stats in any other way than the DPDK xstats API. \
For OVS or OVS-with-DPDK the Open vSwitch plugins (ovs) should be \
used for collecting stats and events."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-dpdk-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "ce7cfe6fb873ada4b2a2d11fd6bf9a04440b827d6227687559e8ea3f3b4d3baccba205d0d723d594b0af839dc034b3a313555050cbcc8d0cb710e1aca70f23a5"

RPROVIDES:${PN} += "collectd-plugin-dpdk"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
librte-eal.so.26 \
librte-ethdev.so.26"

inherit rpm

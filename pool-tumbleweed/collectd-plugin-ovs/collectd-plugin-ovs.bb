SUMMARY = "Open vSwitch (OVS) plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor an OVS database."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-ovs-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "1e23bde3d7ab6a87974c30e8ecad93023c34f0588907779672990173bb6bdf70f4eebacbed923d825a739b7704ec3f1867485fba727b28f3b297ec326358b40d"

RPROVIDES:${PN} += "collectd-plugin-ovs"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm

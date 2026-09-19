SUMMARY = "Pinba Collector Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to receive and dispatch timing values from Pinba, a \
profiling extension for PHP."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-pinba-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "966a9b79ff20b5bb391b55fab4020b69c193325fe8fd5300205dce5515838fde0d245f41e152b13ad080c4d7cc9b0bb7488a8b7a8d9bfaf8521017f247741d31"

RPROVIDES:${PN} += "collectd-plugin-pinba"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1"

inherit rpm

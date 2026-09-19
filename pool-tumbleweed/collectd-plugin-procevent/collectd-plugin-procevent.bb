SUMMARY = "Procevent plugin for collectd"
DESCRIPTION = "Optional collectd plugin to listen for process starts and exits via netlink."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-procevent-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "32ac1b9d951f3eb055d3e08f829dbf80e767571c101368d646610fc4ecb280abfc9908a7bf185e8cbf1dd05c3ccd382068213fdfc8359c74bf8944baf0541722"

RPROVIDES:${PN} += "collectd-plugin-procevent"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm

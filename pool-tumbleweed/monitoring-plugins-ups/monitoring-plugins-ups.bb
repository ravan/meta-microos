SUMMARY = "Test UPS service on the specified host"
DESCRIPTION = "This plugin tests the UPS service on the specified host. \
 \
Network UPS Tools from www.networkupstools.org must be running for this plugin \
to work."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ups-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "cbf94aff61d5866e9806c4f3671851dadbe40bf6a154232a8a21e1c849d5b28f96c1aeae12748561b96915bc8aac09218de4ad6cc51930dca2a43e1235feb6b6"

RPROVIDES:${PN} += "config-monitoring-plugins-ups \
monitoring-plugins-ups \
nagios-plugins-ups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

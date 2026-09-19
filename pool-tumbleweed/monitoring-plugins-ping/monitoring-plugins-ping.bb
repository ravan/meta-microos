SUMMARY = "Check connection statistics"
DESCRIPTION = "Use ping to check connection statistics for a remote host. \
 \
This plugin uses the ping command to probe the specified host for packet loss \
(percentage) and round trip average (milliseconds)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ping-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "9818fa86a6737db2591e52005de84e14861a988f9adc4cafbda4a52994e79027e98e11d007a43699c97af6a774a8d3b3bf1ef44dc574d10aac0ff3e29fb615aa"

RPROVIDES:${PN} += "config-monitoring-plugins-ping \
monitoring-plugins-ping \
nagios-plugins-ping"

RDEPENDS:${PN} += "iputils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "Lighttpd module to feed rrdtool databases"
DESCRIPTION = "RRD_tool is a system to store and display time-series data (i.e. \
network bandwidth, machine-room temperature, server load average). \
 \
This module feeds an rrdtool database with the traffic stats from \
lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_rrdtool-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "c9ba19486230bf5d688ca7c85ab10864a8111e691f2a2443327cffd7d71cdf08265448c1f94aa216b3267b22be19a348bc4a6569807bded5bb1dcc56e084ce7d"

RPROVIDES:${PN} += "config-lighttpd-mod-rrdtool \
lighttpd-mod-rrdtool"

RDEPENDS:${PN} += "group-lighttpd \
libc.so.6 \
lighttpd \
rrdtool"

inherit rpm

SUMMARY = "Accounting and aggregation toolsuite for IPv4 and IPv6"
DESCRIPTION = "pmacct is a set of passive network monitoring tools to measure, account, \
classify and aggregate IPv4 and IPv6 traffic; a pluggable \
architecture allows to store the collected traffic data into memory tables or \
SQL (MySQL, SQLite, PostgreSQL) databases. pmacct supports customizable \
historical data breakdown, flow sampling, filtering and tagging, recovery \
actions, and triggers. Libpcap, sFlow v2/v4/v5 and NetFlow v1/v5/v7/v8/v9 are \
supported, both unicast and multicast. A client program can export \
export data to tools like RRDtool, GNUPlot, Net-SNMP, MRTG, and Cacti."
LICENSE = "GPL-2.0-only"

PV = "1.7.9"

RPM_NAME = "pmacct-1.7.9-2.6.aarch64.rpm"
RPM_HASH = "dc70d6cb3dcbde2662fe5fd1d9348237824504c04e33be006f642e97f19df7a9a105fefdf9e1c1dfed320cc547b29d4492ea88e7eece3259849a74c58c107873"

RPROVIDES:${PN} += "config-pmacct \
pmacct"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libmariadb.so.3 \
libmaxminddb.so.0 \
libnetfilter-log.so.1 \
libpcap.so.1 \
libpq.so.5 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm

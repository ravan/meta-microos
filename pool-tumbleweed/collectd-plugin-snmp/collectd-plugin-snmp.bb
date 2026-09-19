SUMMARY = "SNMP Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor devices using SNMP."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-snmp-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "5a92893edd789c0d4c55b2e94001c2ea5bd410357ec17b378a1bbb5e562bf21f7c9749b297dd866d4238bcb890e33f5f8397f7e8bcdfe2bfdba87df8bfc7379c"

RPROVIDES:${PN} += "collectd-plugin-snmp"

RDEPENDS:${PN} += "/usr/bin/perl \
collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
perl-Config--General \
perl-SNMP \
perl-Socket6"

inherit rpm

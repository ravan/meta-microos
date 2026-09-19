SUMMARY = "Send ICMP packets to the specified host"
DESCRIPTION = "This plugin sends ICMP (ping) packets to the specified host. You can \
specify different RTA factors and acceptable packet loss. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-icmp/README.SUSE-check_icmp \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-icmp-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "ad0e39b8eb709941350fafb0867cdbf9e43a05c1b6eca7f401f2a1d68a60b683f4f4cf1078321fc804cdc1ba06d13516ec007b6440a0700cae492424083e59e8"

RPROVIDES:${PN} += "config-monitoring-plugins-icmp \
monitoring-plugins-icmp \
nagios-plugins-icmp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

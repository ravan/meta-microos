SUMMARY = "Check DHCP servers"
DESCRIPTION = "This plugin tests the availability of DHCP servers on a network. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-dhcp/README.SUSE-check_dhcp \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dhcp-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "7d09440576c5e157d06191e0c0a4f8e399906dd0fa74652ab78e3847f701c0302316dc0f65a7dabb9aa88ede3027054a795301b196a3d0cc246c07515356f56a"

RPROVIDES:${PN} += "config-monitoring-plugins-dhcp \
monitoring-plugins-dhcp \
nagios-plugins-dhcp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "Minimal DHCPv4 and DHCPv6 client"
DESCRIPTION = "dhcpcd is a DHCP and a DHCPv6 client. It's also an IPv4LL (aka ZeroConf) \
client. In layperson's terms, dhcpcd runs on your machine and silently \
configures your computer to work on the attached networks without trouble and \
mostly without configuration."
LICENSE = "BSD-2-Clause"

PV = "10.5.2"

RPM_NAME = "dhcpcd-10.5.2-2.1.aarch64.rpm"
RPM_HASH = "940eb5a619485388d350809559820eda883f73c771234b7af97432b665886d64964a26c7a86583f88e5769607c790db9b9d441babe1a4feff95409b2c5043719"

RPROVIDES:${PN} += "config-dhcpcd \
dhcpcd \
group-dhcpcd \
user-dhcpcd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
sysuser-shadow"

inherit rpm

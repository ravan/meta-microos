SUMMARY = "DNS Forwarder and DHCP Server"
DESCRIPTION = "Dnsmasq provides network infrastructure for small networks: DNS, \
DHCP, router advertisement and network boot. \
 \
The DNS subsystem supprots forwarding of all query types, and caching \
of common record types, DNSSEC included. The DHCP subsystem supports \
DHCPv4, DHCPv6, BOOTP and PXE. RA can be used stand-alone or in \
conjunction with DHCPv6."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.93"

RPM_NAME = "dnsmasq-2.93-2.3.aarch64.rpm"
RPM_HASH = "c466df6c389fa4dc7783db91caafe8794b3dfe293def439fdfdffd274281bdfe5458e141165af01100bb8ce7dae39628caa2404f467b1f6afa07f53f206a1c88"

RPROVIDES:${PN} += "config-dnsmasq \
dns-daemon \
dnsmasq \
group-dnsmasq \
user-dnsmasq"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libdbus-1.so.3 \
libgmp.so.10 \
libhogweed.so.6 \
libidn2.so.0 \
liblua5.4.so.5 \
libnetfilter-conntrack.so.3 \
libnettle.so.8 \
libnftables.so.1 \
sysuser-shadow \
user-tftp"

inherit rpm

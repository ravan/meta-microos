SUMMARY = "NetworkManager dispatcher script for DNS dnsmasq configuration"
DESCRIPTION = "NetworkManager attempts to keep an active network connection \
available at all times. The point of NetworkManager is to make \
networking configuration and setup as painless and automatic as \
possible. If using DHCP, NetworkManager is intended to replace \
default routes, obtain IP addresses from a DHCP server, and change \
name servers whenever it sees fit. \
 \
This package provides a NetworkManager dispatcher script for DNS \
dnsmasq configuration."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "NetworkManager-dns-dnsmasq-1.0-2.6.noarch.rpm"
RPM_HASH = "fb6fd5693e28cbde24fdf541e6b4ee7728e994e081532254ba54b4d0c48787e0173f4e15de08b2890154cbb0b45a4ea7059df74abdca19239a7b9561c9426596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-dns-dnsmasq"

RDEPENDS:${PN} += "/usr/bin/bash \
NetworkManager \
dnsmasq \
sysconfig"

inherit rpm

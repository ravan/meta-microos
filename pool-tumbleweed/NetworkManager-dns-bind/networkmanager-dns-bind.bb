SUMMARY = "NetworkManager dispatcher script for DNS bind configuration"
DESCRIPTION = "NetworkManager attempts to keep an active network connection \
available at all times. The point of NetworkManager is to make \
networking configuration and setup as painless and automatic as \
possible. If using DHCP, NetworkManager is intended to replace \
default routes, obtain IP addresses from a DHCP server, and change \
name servers whenever it sees fit. \
 \
This package provides a NetworkManager dispatcher script for DNS \
bind configuration."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "NetworkManager-dns-bind-1.0-1.10.noarch.rpm"
RPM_HASH = "cafa87effd0cb17ab47d126e79d80ffe7da61634602f4d50a5e6ac10e23cbaa1be4686f765322af07662dc449d135bec432d4c1c58ab53c50f0f952ec815f0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-dns-bind"

RDEPENDS:${PN} += "/usr/bin/bash \
NetworkManager"

inherit rpm

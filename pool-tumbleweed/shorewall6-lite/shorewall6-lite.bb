SUMMARY = "Shoreline Firewall 6 Lite is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall6 Lite is a companion product to Shorewall6 that allows network \
administrators to centralize the configuration of Shorewall6-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-lite-5.2.8-6.13.noarch.rpm"
RPM_HASH = "538143c3071709dfd4a4a73db01b4694d864be9e71a08f182dbd75059491025e6425c91a038e99a4a28aff0c8264da13e09cd35704f5cdb3b9f8d643c4254928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall6-lite \
shoreline-firewall \
shorewall6-lite"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
shorewall-core \
systemd"

inherit rpm

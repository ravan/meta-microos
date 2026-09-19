SUMMARY = "Shoreline Firewall 6 is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based IPv6 firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-5.2.8-6.13.noarch.rpm"
RPM_HASH = "b7fd7f0a0dbb654eee6e7aa94072c6ccbe09cb52f5bb34c6b36a99107e2d50ee183ce8f1db5d0d3b6265a767440d00be3799cd874cd948b4c715b5523f799226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall6 \
shoreline-firewall \
shorewall6"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
perl-base \
shorewall-core \
systemd"

inherit rpm

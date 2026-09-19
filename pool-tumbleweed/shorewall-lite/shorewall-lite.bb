SUMMARY = "Shoreline Firewall Lite is an iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall Lite is a companion product to Shorewall that allows network \
administrators to centralize the configuration of Shorewall-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-lite-5.2.8-6.13.noarch.rpm"
RPM_HASH = "3c9f69084b86c2ef33cc27978bf4c029efdb8f3d564dddfb8ed53d4f838577545faf55c1116be5e66e9e4ade614e6c2365d6afe25095c596e4ee5f84d4b34a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall-lite \
shoreline-firewall \
shorewall-lite"

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

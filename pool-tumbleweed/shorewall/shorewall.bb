SUMMARY = "An iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-5.2.8-6.13.noarch.rpm"
RPM_HASH = "09dc4f41027973ac3f759af5205b3273a4004e4c61f648801060598d798bc2649acebb4aa1b07d0e67d2e3d04fbbcedd8b5d8bdd4e6c798abcd8202118681a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall \
perl-Shorewall--ARP \
perl-Shorewall--Accounting \
perl-Shorewall--Chains \
perl-Shorewall--Compiler \
perl-Shorewall--Config \
perl-Shorewall--IPAddrs \
perl-Shorewall--Misc \
perl-Shorewall--Nat \
perl-Shorewall--Proc \
perl-Shorewall--Providers \
perl-Shorewall--Proxyarp \
perl-Shorewall--Raw \
perl-Shorewall--Rules \
perl-Shorewall--Tc \
perl-Shorewall--Tunnels \
perl-Shorewall--Zones \
shoreline-firewall \
shorewall"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
perl--MODULE-COMPAT-5.44.0 \
perl-base \
shorewall-core"

inherit rpm

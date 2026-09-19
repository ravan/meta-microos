SUMMARY = "Adds functionality during boot to Shoreline Firewall (Shorewall)"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall Init is a companion product to Shorewall that allows for tigher \
control of connections during boot and that integrates Shorewall with \
ifup/ifdown and NetworkManager."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-init-5.2.8-6.13.noarch.rpm"
RPM_HASH = "e542e111d42f8b6c13b8dba19e92c6a356b64f0de67eb808111cc774cc85e48bb4633e59828430a28986b53beef20996314bca815475a9ba98174c22593ac2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-init"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
fillup \
logrotate \
shoreline-firewall \
systemd"

inherit rpm

SUMMARY = "A Perl Client to Update Dynamic DNS Entries"
DESCRIPTION = "ddclient is a client requiring only Perl. Supported \
features include daemon operation, manual and automatic updates, static \
and dynamic updates, optimized updates for multiple addresses, MX, wild \
cards, abuse avoidance, retry for failed updates, and status updates to \
syslog and through e-mail. ddclient can obtain the IP address from any \
interface, through a Web-based IP detection service, and for multiple \
routers using custom FW definitions. It also provides full support for \
DynDNS.org's NIC2 protocol. Support is also included for other dynamic \
DNS services. Comes with sample scripts for use with DHCP, PPP, and \
cron."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "ddclient-4.0.0-1.4.noarch.rpm"
RPM_HASH = "912933ba6db8fb5ee9f45760778e4c4112bdbfd958e9f4e1da470b6aca5084c59aef5b25afaadd6b8c221d326379ae1cad863af8b33735d108b1a030880b8dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ddclient \
ddclient \
group-ddclient \
user-ddclient"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
curl \
fillup \
perl \
shadow \
systemd \
sysuser-shadow"

inherit rpm

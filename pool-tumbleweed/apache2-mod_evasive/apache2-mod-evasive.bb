SUMMARY = "Denial of Service evasion module for Apache"
DESCRIPTION = "mod_evasive is an evasive maneuvers module for Apache to provide \
evasive action in the event of an HTTP DoS or DDoS attack or brute \
force attack. It is also designed to be a detection and network \
management tool, and can be easily configured to talk to ipchains, \
firewalls, routers, and etcetera. mod_evasive presently reports \
abuses via email and syslog facilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "apache2-mod_evasive-1.10.1-18.6.aarch64.rpm"
RPM_HASH = "ad10888e4b8ada324aa642b7fbe39c27431f9fc3d372008d6f139ad078a30f41285bbb5fe28f4cc798dbd8b8c5e1e036f7d9228a4bbc17a9bc9e755ccdfe1016"

RPROVIDES:${PN} += "apache2-mod-evasive \
config-apache2-mod-evasive"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm

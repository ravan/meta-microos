SUMMARY = "DNS management framework"
DESCRIPTION = "/etc/resolv.conf is a file that holds the configuration for the local resolution of domain names. \
Normally this file is either static or maintained by a local daemon, normally a DHCP daemon. \
openresolv will make sure, that multiple processes (eg. dhcpcd, NetworkManager, openvpn) \
can write the resolv.conf without overwriting each others changes. \
 \
openresolv can generate a combined resolv.conf or a configuration file for a local nameserver \
(like unbound, dnsmasq or bind) that will route the dns requests according to the search domain."
LICENSE = "BSD-2-Clause"

PV = "3.17.4"

RPM_NAME = "openresolv-3.17.4-1.3.noarch.rpm"
RPM_HASH = "719796dfd4ffd8bc2c07f180e4cd445458be7048de3a8ec5782a1beeb7f7ebe0b862e9b15ccd5d3a853386e4da807ac140a379734399b676647b72c79a51f079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openresolv \
openresolv"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm

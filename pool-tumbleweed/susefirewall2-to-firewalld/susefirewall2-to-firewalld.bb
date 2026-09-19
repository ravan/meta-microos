SUMMARY = "Basic SuSEfirewall2 to FirewallD migration script"
DESCRIPTION = "This is a simple bash script aiming to provide a basic migration path from \
SuSEfirewall2 to FirewallD."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.4"

RPM_NAME = "susefirewall2-to-firewalld-0.0.4-3.7.noarch.rpm"
RPM_HASH = "e4c3ff1ebcb32d1fc78abb0aa123c60c40ebbf38776ca4d7f457764485e52b063242ba0d24b78733543b757abdc3679e077f88f989e989e3034c2fb4780b4d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "susefirewall2-to-firewalld"

RDEPENDS:${PN} += "/usr/bin/bash \
firewalld \
iptables"

inherit rpm

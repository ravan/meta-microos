SUMMARY = "Fence agent for IBM BladeCenter"
DESCRIPTION = "Fence agent for IBM BladeCenter devices that are accessed \
via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ibmblade-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "c887dbba89132efb98d32cb7f2bebbedee0e1b3aff3f1850cd83efcafb5d470608856d88d51673fd4bd605e269b999132ec819be87753b840bb8b13934396c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ibmblade"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm

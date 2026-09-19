SUMMARY = "Fence agent for IBM iPDU network power switches"
DESCRIPTION = "Fence agent for IBM iPDU network power switches that are accessed \
via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ipdu-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "5b5e392e76c1323eaf60cfc7273db5f2fc8bf100d0607f9e468bca82ff38b353173464b43a29b94b1f7c453b8410d76c091f1473decb356d06b5be1eb8f5f1ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ipdu"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm

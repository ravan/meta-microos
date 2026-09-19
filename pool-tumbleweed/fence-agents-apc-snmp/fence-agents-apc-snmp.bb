SUMMARY = "Fence agents for APC devices (SNMP)"
DESCRIPTION = "Fence agents for APC devices that are accessed via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-apc-snmp-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "4caaa3abef9af43a052848c78110d4cf20648745c57fe009b6264c87652ae72e63e3203df037fae945c4d99b6e52c6ee6a0da5f079200381fbe236c94eb8a92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-apc-snmp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm

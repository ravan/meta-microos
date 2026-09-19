SUMMARY = "Fence agent for devices with Intel Modular interfaces"
DESCRIPTION = "Fence agent for Intel Modular interfaces that are accessed \
via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-intelmodular-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "673f0f197d9bae94b9ddbb96e02c25b55978249efa17ee10dd2e1c69f531bbc0559f11503f16477907910b21df6563033178ad8aaef9b12a4b06ec77151ccb30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-intelmodular"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm

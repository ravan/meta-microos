SUMMARY = "Fence agent for devices with IF-MIB interfaces"
DESCRIPTION = "Fence agent for IF-MIB interfaces that are accessed via \
the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ifmib-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "a8c12193364d3d6216db0dd74a4d02b05a1135305652fdc954b30f2b216ae70cfa05469d80ccca65aaa6c98f9e28d2d541391f93a7da5f99907e5221714d5020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ifmib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm

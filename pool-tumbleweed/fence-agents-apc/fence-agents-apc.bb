SUMMARY = "Fence agent for APC devices"
DESCRIPTION = "Fence agent for APC devices that are accessed via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-apc-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "0453a4baaa4029be77b84c999d93dbc746c68699f5624579bca9573586d33d6011c49082751e66771f08fb033e8f949bac49fa6e7d3c2af589974553b591b065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-apc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

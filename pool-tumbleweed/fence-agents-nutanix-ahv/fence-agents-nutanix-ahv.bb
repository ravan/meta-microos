SUMMARY = "Fence agent for Nutanix AHV"
DESCRIPTION = "Fence agent for Nutanix AHV clusters."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-nutanix-ahv-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "e28ea778468d6a9e9eca09d4222e518f5f27c8a1961e51b08f6aadc8c8e9252bbf3408b749cfd3869063e5d579105712d8ea03431295fef9fa3df7b40ada8872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-nutanix-ahv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm

SUMMARY = "Fence agent for RCD serial"
DESCRIPTION = "Fence agent for RCD serial."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-rcd-serial-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "aa37931d234a1006a3e358597707cdd4b07871ef5dd82b817fc355c5f6b9927ca1af47bb5cb40f97be3e242077524b5eb0f906624af1f5811eab3cedd5b96afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-rcd-serial"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm

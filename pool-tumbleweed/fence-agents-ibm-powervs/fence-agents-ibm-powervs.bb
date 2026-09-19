SUMMARY = "Fence agent for IBM PowerVS"
DESCRIPTION = "Fence agent for IBM PowerVS that are accessed via REST API."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ibm-powervs-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "d77995a2fa42c03ca90798eed2eac659fd68aab23044be14c61c8acbd457b2bd790615f4b38de0351adb14654812818bc4a03651234e7231cbdd3d07d82cda0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ibm-powervs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm

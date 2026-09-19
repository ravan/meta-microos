SUMMARY = "Common base for Fence Agents"
DESCRIPTION = "A collection of executables to handle isolation ('fencing') of possibly \
misbehaving hosts by the means of remote power management, blocking \
network, storage, or similar. \
 \
This package contains support files including the Python fencing library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-common-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "71a8d434e6ede060ecf6457f401492ec0a10af97e6e0bc8443629b34d70be7c3b87c42310b69ff874089a07731a3d98a289ab135a8dc337402fe01f0b1339c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-common"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-pexpect \
python3-pycurl"

inherit rpm

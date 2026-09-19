SUMMARY = "Fence agent for PVE"
DESCRIPTION = "Fence agent for PVE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-pve-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "e471e185cef8ff215ca467a8c6a48b4afac090ba0f894a43dd10b8472fe4fd83aa7d03e04721633974bc37f92a18dc217e80c2f93190444e0f0aac202421f145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-pve"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-pycurl"

inherit rpm

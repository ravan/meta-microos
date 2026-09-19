SUMMARY = "Fence agent for Azure Resource Manager"
DESCRIPTION = "Fence agent for Azure Resource Manager instances."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-azure-arm-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "794793f411157556d43c3348d341140aa8f1daa9379a136afa7ed92c5a67b680728bb6f61400096899d5fe797d0f71596eca454ea3a37b78210a284b2a3d02a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-azure-arm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3 \
python3-azure-core \
python3-azure-identity \
python3-azure-mgmt-compute \
python3-azure-mgmt-network \
python3-pexpect \
python3-pycurl"

inherit rpm

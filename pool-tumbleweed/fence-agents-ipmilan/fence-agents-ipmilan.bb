SUMMARY = "Fence agents for devices with IPMI interface"
DESCRIPTION = "Fence agents for devices with IPMI interface."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ipmilan-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "26e2488568305b9b923b7a889a5bde2018fb88ac3275c5e13b21568563fef7a97e3f6032c54f6dc3339d79cbb016d349d92ec3707eafbe7a5b21234dec4dcbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ipmilan"

RDEPENDS:${PN} += "/usr/bin/ipmitool \
/usr/bin/python3.13 \
fence-agents-common"

inherit rpm

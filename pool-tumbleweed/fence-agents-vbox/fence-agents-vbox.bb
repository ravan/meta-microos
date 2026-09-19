SUMMARY = "Fence agent for VirtualBox"
DESCRIPTION = "Fence agent for VirtualBox dom0 accessed via SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-vbox-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "d18734d106a4d231bef6169533e78d04e8d482623738807345405f82e32e9e934f3f411d3fcba2077725b9ed99ed4693b5311cd2b3faabe160f7183e38b10288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-vbox"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

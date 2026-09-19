SUMMARY = "Fence agent for Fujitsu RSB"
DESCRIPTION = "Fence agent for Fujitsu RSB devices that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-rsb-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "ac21b86e7c1dccae71d4016c6531862934c27c88bcf7cc8f129bddb6e37db729bdd5f632c219701edfa584d7e0034185654452632bc9fc936ff6decbb30467a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-rsb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

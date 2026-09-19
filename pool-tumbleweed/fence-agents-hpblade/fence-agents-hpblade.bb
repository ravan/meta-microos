SUMMARY = "Fence agent for HP BladeSystem devices"
DESCRIPTION = "Fence agent for HP BladeSystem devices that are accessed via telnet \
or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-hpblade-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "281cac5cca825b51e1cc1fab018d2fa9eb2f2592c379983b178f8da45d29371290f776dca92cf4a64a04850ad39b1c6fd5be7533e42d84001fb7ffbf2973b9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-hpblade"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

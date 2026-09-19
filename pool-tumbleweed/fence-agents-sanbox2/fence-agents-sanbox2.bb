SUMMARY = "Fence agent for QLogic SANBox2 FC switches"
DESCRIPTION = "Fence agent for QLogic SANBox2 switches that are accessed via telnet."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-sanbox2-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "648df1333da1c0b3ef61de3eef9fcd095586d4def8a3b3f7cddcb5f5d7855140729e9c8ecbcd1b8a51f0a0ca142f2ecf6566c9446ddb30596bec21c2ac6cc1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-sanbox2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
telnet"

inherit rpm

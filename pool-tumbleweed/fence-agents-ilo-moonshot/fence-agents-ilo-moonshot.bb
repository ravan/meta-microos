SUMMARY = "Fence agent for HP iLO Moonshot devices"
DESCRIPTION = "Fence agent for HP iLO Moonshot devices that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ilo-moonshot-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "9c760b4db5478abfa6d20daa040956207e0b120519a3db0825c3fe984d313d1ad405a4e684dfa0f319fbfed6a71ccc95d33a76147b50847f4b70e050beb75cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ilo-moonshot"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

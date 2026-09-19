SUMMARY = "Fence agent for Brocade switches"
DESCRIPTION = "Fence agent for Brocade devices that are accessed via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-brocade-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "658e7ad29b5ed278bd8be3820d950dbbf22043e8e51dbedb714c5d367b7a55b0995d594641646b2a90d1680849e94a77fcd592a47d29d27c6eae8926784ea3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-brocade"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

SUMMARY = "Fence agent for IBM LPAR"
DESCRIPTION = "Fence agent for IBM LPAR devices that are accessed via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-lpar-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "4ad160d61ab3bd201a29d88dc38be1cc8e068073864d8c31fe4edfc48c33d41a99e716756771cde8d1bb3e72ee5f4b1a7c8993fadcef69028ce1dc88e0ca640e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-lpar"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

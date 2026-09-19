SUMMARY = "Fence agent for WTI Network power switches"
DESCRIPTION = "Fence agent for WTI network power switches that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-wti-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "82f85a3714fe9f52368d127ccc7f346a88e4988ebf4afe5a22a2470a82e518478ea6030a9fe6764e823cbb99457815805429f9d9de5c5d76c9b2993d0f48d411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-wti"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

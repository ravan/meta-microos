SUMMARY = "Fence agent for SUN ALOM"
DESCRIPTION = "Fence agent for SUN ALOM."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-alom-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "46221b519ae87940873d19b61cfb85b03bb39992e3242dfe5600c272434d6252b06f9dea3ac3e488078efded6ddab279304dff8234d61901f1b63c3fa95b4609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-alom"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

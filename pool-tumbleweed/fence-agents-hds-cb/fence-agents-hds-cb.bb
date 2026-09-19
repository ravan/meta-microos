SUMMARY = "Fence agent for Hitachi Compute Blade systems"
DESCRIPTION = "Fence agent for Hitachi Compute Blades that are accessed via telnet."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-hds-cb-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "4e9952cf5a436c6af42d4428a4fc7d98c9e8933925b936b40b6846643366aa3e832074388d932eecfd832e6e1ccd695e5bbb1b4bb62235e81df0327b11a710ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-hds-cb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
telnet"

inherit rpm

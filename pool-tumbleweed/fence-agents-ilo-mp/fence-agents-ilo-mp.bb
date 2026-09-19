SUMMARY = "Fence agent for HP iLO MP devices"
DESCRIPTION = "Fence agent for HP iLO MP devices that are accessed via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ilo-mp-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "aa8cea0a0e827ccc1a5b667411728a391e5d3d0b9406354ccbd2e3d0e6a5f55275aedd6cf3a5ebdf17bc1ffd7afb3bbca505e612a7172747c77af5b497e57469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ilo-mp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

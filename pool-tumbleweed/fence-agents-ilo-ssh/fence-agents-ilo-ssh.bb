SUMMARY = "Fence agents for HP iLO devices over SSH"
DESCRIPTION = "Fence agents for HP iLO devices that are accessed via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ilo-ssh-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "7a2a0e63373cc93c22f0fa73a914a56972648368073807af26491652f8e751e438a9e6d5d1d3cc84b8c2fc749731f81589faa3064cd64b09503cf02c9d51fe63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ilo-ssh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm

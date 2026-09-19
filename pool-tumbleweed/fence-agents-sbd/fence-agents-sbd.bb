SUMMARY = "Fence agent for SBD (storage-based death)"
DESCRIPTION = "Fence agent for SBD (storage-based death)."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-sbd-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "6b1c4d0832db0744f68c0f775ceee65aa86f6f63e3f5145ee6a013214f880a7d42d12d322cfe2bad6cf22c41c04e09f47a8dbbad81e8724b26a2ce94a57074a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-sbd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
sbd"

inherit rpm

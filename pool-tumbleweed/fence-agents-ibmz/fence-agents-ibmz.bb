SUMMARY = "Fence agent for IBM z LPARs"
DESCRIPTION = "Fence agent for IBM z LPARs that are accessed via the HMC \
Web Services REST API."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ibmz-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "41b4bd2a72547f38cf24b44149ce5ad8da12ab1ca2e9710f9494b7656e56def439479d796f8421394f44b67f38b6515c04b1612dce5dc81da9e996aeadb7ba64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ibmz"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-requests"

inherit rpm

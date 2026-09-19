SUMMARY = "Documentation for OpenStack authenticating tools"
DESCRIPTION = "Documentation for OpenStack authenticating tools."
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "python-keystoneauth1-doc-5.17.0-1.1.noarch.rpm"
RPM_HASH = "9ffafb6819a46fc1b0c67c78a80dc1cb40f348fb03ab51f783e482c9e078b09cb2d83531ec9b2ffe09601ab112b617084bee5572f71ca5f69f05a99e980b51ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneauth1-doc"

RDEPENDS:${PN} += ""

inherit rpm

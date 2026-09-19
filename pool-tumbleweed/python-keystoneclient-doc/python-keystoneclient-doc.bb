SUMMARY = "Documentation for OpenStack Identity API Client"
DESCRIPTION = "Documentation for the client library for interacting with Openstack \
Identity API."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python-keystoneclient-doc-6.0.0-1.1.noarch.rpm"
RPM_HASH = "391ffbf58d40e031dcacfd99ad30a278b5af9f474162be2fe4ebb06be32b85fbdeae4b1a2f96e660b2212fa3dbe678f62fba76bf85ca00893985dbf0941d9822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

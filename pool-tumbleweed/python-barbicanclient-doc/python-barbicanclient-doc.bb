SUMMARY = "Documentation for OpenStack Key Management API Client"
DESCRIPTION = "Documentation for the client library for interacting with \
Openstack Key Management API"
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python-barbicanclient-doc-7.6.0-1.1.noarch.rpm"
RPM_HASH = "cca345a061fe06819c3e05a69c177b19f2e941c347633d4adcbb61732c60e66aa9da7c682eb4308fb5881b5e2f6276656fc8f18c8ddf24a3b2b3cafa4588117b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-barbicanclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

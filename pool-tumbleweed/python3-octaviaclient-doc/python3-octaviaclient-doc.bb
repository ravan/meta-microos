SUMMARY = "Documentation for OpenStack Octavia API Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "3.15.0"

RPM_NAME = "python3-octaviaclient-doc-3.15.0-1.1.noarch.rpm"
RPM_HASH = "4cb2652519141943c7d6703028a11712a4a270c97a01e29f638449d6c3fd077923ef29180d34009d421e5040d7d1eca6ac54493d29c42248d2ddc4fa5e484696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-octaviaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

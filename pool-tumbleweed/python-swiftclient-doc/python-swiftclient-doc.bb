SUMMARY = "OpenStack Object Storage API Client Library - Documentation"
DESCRIPTION = "This is a python client for the Swift API. There's a Python API (the \
swiftclient module), and a command-line script (swift). \
 \
This package contains documentation files for python-swiftclient."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python-swiftclient-doc-4.10.0-1.3.noarch.rpm"
RPM_HASH = "98d567b6ad4c17d1acd591b7cfe6b9b480a1288ee8f79cb43e39f33bf91f3b7306d82f72b8b4ecd005b78cfd6176cec569fb192152f7571ae9214526ceece84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-swiftclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

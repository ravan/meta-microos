SUMMARY = "Documentation for Middleware for OpenStack Identity"
DESCRIPTION = "Documentation for Middleware for OpenStack Identity."
LICENSE = "Apache-2.0"

PV = "13.0.1"

RPM_NAME = "python-keystonemiddleware-doc-13.0.1-1.1.noarch.rpm"
RPM_HASH = "84c92b24ab3222c2a3397762b34b2dbfccf01cfddecf12aa9e3da3b04554f0db3c9eb5c335366daab6f20ea2d0c582b677b9b41e81af7ba167a43d438944adbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystonemiddleware-doc"

RDEPENDS:${PN} += ""

inherit rpm

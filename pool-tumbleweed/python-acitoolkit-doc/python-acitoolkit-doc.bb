SUMMARY = "Documentation for the Python acitoolkit library"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller. \
 \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-0.4-8.8.noarch.rpm"
RPM_HASH = "27ffec31de297b345cebc72ebcdab53d896f79eef2188fc4afb8a73b7e52bf487fd9488144676ef43a83e6f223a0f575cbc6bc8ef5acf234c09ca7dfb31136e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc"

RDEPENDS:${PN} += ""

inherit rpm

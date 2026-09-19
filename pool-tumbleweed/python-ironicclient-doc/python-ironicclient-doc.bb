SUMMARY = "Documentation for OpenStack Ironic API Client"
DESCRIPTION = "This is a client for the OpenStack Ironic API (Bare Metal. There's a \
Python API (the ironicclient module), and a command-line script (ironic). \
Each implements 100% of the OpenStack Ironic API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python-ironicclient-doc-6.3.0-1.1.noarch.rpm"
RPM_HASH = "a553560cc92cfbfa7b4324abfc7d69f0df9861a677be986f2c65353919a6ee6d408be1448a0d0d023bc6bbac1dbb1ba472b7a237678242b682829c7e03886647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ironicclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

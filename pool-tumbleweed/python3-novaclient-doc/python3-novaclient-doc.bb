SUMMARY = "Documentation for OpenStack Nova API Client"
DESCRIPTION = "This is a client for the OpenStack Nova API. There's a Python API (the \
novaclient module), and a command-line script (nova). Each implements 100% of \
the OpenStack Nova API. \
 \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "18.13.1"

RPM_NAME = "python3-novaclient-doc-18.13.1-1.1.noarch.rpm"
RPM_HASH = "fc44071aa1a00792325032acbf9108c76c39e1d060febdf06a5f5d8c7d639e5e115da4a4e4534dc7496ae44ecfa9530e1aed506c7f7d58889a59ecab6607bff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-novaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

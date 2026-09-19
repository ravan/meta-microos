SUMMARY = "Documentation for OpenStack messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python3-oslo.messaging-doc-18.3.0-1.1.noarch.rpm"
RPM_HASH = "b1d260e25c39b9c35ede63689927e697419ead04f181d7fa78c1f2bb3bf5c0f919614a237046cd4f991bbbd91d2341b75cde94f45b89f1312c7bda85619f3486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.messaging-doc"

RDEPENDS:${PN} += ""

inherit rpm

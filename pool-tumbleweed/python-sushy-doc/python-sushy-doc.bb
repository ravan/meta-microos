SUMMARY = "Documentation for OpenStack sushy"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.13.0"

RPM_NAME = "python-sushy-doc-5.13.0-1.1.noarch.rpm"
RPM_HASH = "8f45643fc792b0e46fa4d23fb537240b9c7b47969ee5d6ff4837ff64910c1f68bb12698c40a5b9f49133e7887f49a57f8cd4f336449fa0a2ec17dd7f6649d99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sushy-doc"

RDEPENDS:${PN} += ""

inherit rpm

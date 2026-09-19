SUMMARY = "Documentation for OpenStack common context library"
DESCRIPTION = "Documentation for the oslo-context library."
LICENSE = "Apache-2.0"

PV = "6.5.0"

RPM_NAME = "python-oslo.context-doc-6.5.0-1.1.noarch.rpm"
RPM_HASH = "73a27be971ad5d4cf43e7a3f5b3eb584e51d64a02af6935b793668b22a6c0e83a1fb4b2c19654d9ccb32f70a8b4a93dbfc8300e3372703389ce7dcee8550080b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.context-doc"

RDEPENDS:${PN} += ""

inherit rpm

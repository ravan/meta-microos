SUMMARY = "Documentation for python module name to package name map library"
DESCRIPTION = "Documentation for python module name to package name map library."
LICENSE = "Apache-2.0"

PV = "0.28.0"

RPM_NAME = "python-pymod2pkg-doc-0.28.0-1.8.noarch.rpm"
RPM_HASH = "183a1a01000797f59b63652223f6710260837ffe62037fe9650dc3e385d5253012db369a8549540b458d8be0aa324bc8cf97cea15f0d49670f60357c22633483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymod2pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm

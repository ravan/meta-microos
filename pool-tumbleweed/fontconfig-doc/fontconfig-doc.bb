SUMMARY = "Documentation for fontconfig"
DESCRIPTION = "Extended documentation for the fontconfig library."
LICENSE = "MIT"

PV = "2.18.1"

RPM_NAME = "fontconfig-doc-2.18.1-1.3.noarch.rpm"
RPM_HASH = "0575d3b4a5892a63c6a876977e632f8b2b69991c34c8361bdc8a4ac52ab2b619390191abf2eb02ddb35f3d6d2bbecb5f09faea7587556b71701f2925500acb23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-doc"

RDEPENDS:${PN} += ""

inherit rpm

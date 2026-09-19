SUMMARY = "Documentation and examples for the Qore xml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
xml module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "qore-xml-module-doc-2.0.0-1.8.noarch.rpm"
RPM_HASH = "55393cb0cd4143d6d7076e6f0619c0ae85ddb50981617f33b0a29209e5668d7911802121bdef431440b0e8185b68b4c36bf3b79e51cfae25f21f2c49baeb4e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-xml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm

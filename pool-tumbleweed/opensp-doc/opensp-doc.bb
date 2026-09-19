SUMMARY = "Documentation for OpenSP"
DESCRIPTION = "This package provides the documentation for OpenSP."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "opensp-doc-1.5.2-205.3.noarch.rpm"
RPM_HASH = "044d623752887c2166b0734bea7733713abfb1f9c6c12fe078d3f4bf629da61a5f4679dd0daf395c3ffcc201e914efe4a440a558fb8789d7a59a94775f5a8b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensp-doc"

RDEPENDS:${PN} += ""

inherit rpm

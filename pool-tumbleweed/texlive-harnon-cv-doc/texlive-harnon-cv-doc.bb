SUMMARY = "Documentation for texlive-harnon-cv"
DESCRIPTION = "This package includes the documentation for texlive-harnon-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-doc-2026.226.1.0svn26543-60.4.noarch.rpm"
RPM_HASH = "e7fb96502e9bd3165706aa19a779da3abf05c4543a8cf772341d990d9aa8a8100de5c395f075be05d1dfb4e53b9f818facbef78c4675588ebdc787bea00c4e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harnon-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm

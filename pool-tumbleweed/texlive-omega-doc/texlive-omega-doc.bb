SUMMARY = "Documentation for texlive-omega"
DESCRIPTION = "This package includes the documentation for texlive-omega"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn33046"

RPM_NAME = "texlive-omega-doc-2026.226.svn33046-61.2.noarch.rpm"
RPM_HASH = "21dc7975ba31da921791800b4f474e1b16abb49c01a0ecabf58d3aa8e079cffdd19021ce15aab3c5aae11ba25a44a53e23fe78f33d77102bb415413531983673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-omega-doc"

RDEPENDS:${PN} += ""

inherit rpm

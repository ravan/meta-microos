SUMMARY = "Documentation for texlive-montserrat"
DESCRIPTION = "This package includes the documentation for texlive-montserrat"
LICENSE = "OFL-1.1"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-montserrat-doc-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "88aa0d7692e5bb3c46f18bfbe68154abc12cb611b0f3ee3444c60104e822581e55b486c05b97d1944773b39be26eda3b06939fcabd4d93d83e57925b2d7d33c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-montserrat-doc"

RDEPENDS:${PN} += ""

inherit rpm

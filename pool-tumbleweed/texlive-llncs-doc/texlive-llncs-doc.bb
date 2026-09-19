SUMMARY = "Documentation for texlive-llncs"
DESCRIPTION = "This package includes the documentation for texlive-llncs"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.26svn77682"

RPM_NAME = "texlive-llncs-doc-2026.226.2.26svn77682-61.2.noarch.rpm"
RPM_HASH = "b46642af82805af66dc67fcb9b73c5282e7f9c9423b4b5a910351de721d489dc5e1f4b1f61479b7f271ad6c1ae1055ac7079c1dfafba15ca83ed736b43e12d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-llncs-doc"

RDEPENDS:${PN} += ""

inherit rpm

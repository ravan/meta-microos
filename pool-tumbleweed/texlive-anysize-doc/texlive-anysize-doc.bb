SUMMARY = "Documentation for texlive-anysize"
DESCRIPTION = "This package includes the documentation for texlive-anysize"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-anysize-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "d064d055b9c82d0e0d0d76f124b0ba5739701d0092c48441ef9c7e21777541b8092b9ad605c47abc70b13b2f9590fba9c263232aafe2861a28d94c5f78529821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anysize-doc"

RDEPENDS:${PN} += ""

inherit rpm

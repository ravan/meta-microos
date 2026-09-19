SUMMARY = "Documentation for texlive-newunicodechar"
DESCRIPTION = "This package includes the documentation for texlive-newunicodechar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-newunicodechar-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "07c5f8f02df8ca33f77c3be6f710053976b38d7b309ca4732a84c2c80a14c5ba6de181303d0e56810db93c82e1e4c538fd8aad0c1617166b287032288de76746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newunicodechar-doc"

RDEPENDS:${PN} += ""

inherit rpm

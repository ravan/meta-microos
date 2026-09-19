SUMMARY = "Documentation for texlive-lcg"
DESCRIPTION = "This package includes the documentation for texlive-lcg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-lcg-doc-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "c34c8b73c71b3427a0d6ef5d8ad5356c968849acc1ca745bae6c342751b7deb95b333b6bd16549bbcc4a31f7535e2894767cd925ebb7350b7cc9579eb9a4247c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcg-doc"

RDEPENDS:${PN} += ""

inherit rpm

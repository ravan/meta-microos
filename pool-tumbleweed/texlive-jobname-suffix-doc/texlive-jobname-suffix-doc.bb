SUMMARY = "Documentation for texlive-jobname-suffix"
DESCRIPTION = "This package includes the documentation for texlive-jobname-suffix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64797"

RPM_NAME = "texlive-jobname-suffix-doc-2026.226.1.0svn64797-63.2.noarch.rpm"
RPM_HASH = "6a63fa79090771ef21b71ae4245e11feaae5275e7a65a2d7e861b9562ffd5707792b403817931d77d5678cc85b9d89d0131ff1cc768b60a96221b10c86a4d0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jobname-suffix-doc"

RDEPENDS:${PN} += ""

inherit rpm

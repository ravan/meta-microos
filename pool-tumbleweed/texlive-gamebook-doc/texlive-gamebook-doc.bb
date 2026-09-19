SUMMARY = "Documentation for texlive-gamebook"
DESCRIPTION = "This package includes the documentation for texlive-gamebook"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24714"

RPM_NAME = "texlive-gamebook-doc-2026.226.1.0svn24714-60.2.noarch.rpm"
RPM_HASH = "8e86d830895549c1a81a324549ed4530bdbd7e635fec03c5a9b20a95721d81792d4cc45635be703fdcee5c421acbcb11c018932de5f189d2027c36d10252caae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gamebook-doc"

RDEPENDS:${PN} += ""

inherit rpm

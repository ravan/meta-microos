SUMMARY = "Documentation for texlive-autotype"
DESCRIPTION = "This package includes the documentation for texlive-autotype"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn76924"

RPM_NAME = "texlive-autotype-doc-2026.226.0.0.5svn76924-60.2.noarch.rpm"
RPM_HASH = "8849a7deff47f5c234d9d2a15390b350ca47e0b8c5da0cc614407fb1878a7d34fe0c25dbfb97e9b1ec4e654530f40d055da7570bcc390aa2d584a9cf066e65ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-autotype-doc-de \
texlive-autotype-doc"

RDEPENDS:${PN} += ""

inherit rpm

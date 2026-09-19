SUMMARY = "Documentation for texlive-datetime2-romanian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-romanian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn56394"

RPM_NAME = "texlive-datetime2-romanian-doc-2026.226.1.02svn56394-59.2.noarch.rpm"
RPM_HASH = "a1bcb0f9ebad3fd542d0d5fe2049e6f81c04d96ae7e3134de6c3fab68f6fea2d953b6f35bf67cfcb236724501f91f073beb3183d71802c3cc455e53990b4eefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-romanian-doc"

RDEPENDS:${PN} += ""

inherit rpm

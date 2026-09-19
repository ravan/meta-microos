SUMMARY = "Documentation for texlive-biblatex"
DESCRIPTION = "This package includes the documentation for texlive-biblatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.21svn77682"

RPM_NAME = "texlive-biblatex-doc-2026.226.3.21svn77682-61.2.noarch.rpm"
RPM_HASH = "1180b97e2af293edc13798f9926dbe97fe8201017878bdc862e55b9d202a17fcd7dae3debbbb3b102e45860bac4e9b095ce35b630cbe8d37161aff97be55748a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-doc-en \
texlive-biblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm

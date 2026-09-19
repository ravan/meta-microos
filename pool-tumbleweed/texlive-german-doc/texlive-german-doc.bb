SUMMARY = "Documentation for texlive-german"
DESCRIPTION = "This package includes the documentation for texlive-german"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5esvn42428"

RPM_NAME = "texlive-german-doc-2026.226.2.5esvn42428-60.2.noarch.rpm"
RPM_HASH = "964982db40a4e59eeaea74ce16f55f2ad43695a08588a58d0fcc1e68f7f04d861b850465dc7325bdb490f305e80bf96897d90d9e1ed2e49cb6b4858c0d2aba9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-german-doc-de \
texlive-german-doc"

RDEPENDS:${PN} += ""

inherit rpm

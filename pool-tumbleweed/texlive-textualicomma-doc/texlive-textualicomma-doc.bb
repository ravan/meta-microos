SUMMARY = "Documentation for texlive-textualicomma"
DESCRIPTION = "This package includes the documentation for texlive-textualicomma"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn76924"

RPM_NAME = "texlive-textualicomma-doc-2026.227.1.1svn76924-62.2.noarch.rpm"
RPM_HASH = "c659a9f13dea6b4794faae06ef57f516ce6e38881a083e9f10f12083b62d0cfb3ee60cf46ed4d4c1dee8e27c58c74e5f0ee6706b1de8e51512dd887bac566d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textualicomma-doc"

RDEPENDS:${PN} += ""

inherit rpm

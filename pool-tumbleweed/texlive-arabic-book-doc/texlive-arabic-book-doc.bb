SUMMARY = "Documentation for texlive-arabic-book"
DESCRIPTION = "This package includes the documentation for texlive-arabic-book"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn59594"

RPM_NAME = "texlive-arabic-book-doc-2026.226.1.0svn59594-61.2.noarch.rpm"
RPM_HASH = "d3961b7c6c3aa70bfff60181f83d949a61bcfcac1c3353f095dd449e0c71040f01f4703b3ed8b17e23e1aff981e7805660d0c7b5a5927152ad2e40d778daa142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabic-book-doc"

RDEPENDS:${PN} += ""

inherit rpm

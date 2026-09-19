SUMMARY = "Documentation for texlive-cases"
DESCRIPTION = "This package includes the documentation for texlive-cases"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-cases-doc-2026.226.3.2svn77682-59.2.noarch.rpm"
RPM_HASH = "cbe08677cedaa5e5c9e93447da9b33a49e37ce0d39eaa8397a0fbb957a0c3bd286f9af606c8810a1be1f01b5956ae5cae93a7c8915761333d2631e0f518f024b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cases-doc"

RDEPENDS:${PN} += ""

inherit rpm

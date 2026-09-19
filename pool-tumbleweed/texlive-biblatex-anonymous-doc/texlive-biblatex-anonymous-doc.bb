SUMMARY = "Documentation for texlive-biblatex-anonymous"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-anonymous"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.2svn48548"

RPM_NAME = "texlive-biblatex-anonymous-doc-2026.226.2.6.2svn48548-61.2.noarch.rpm"
RPM_HASH = "ee347781c37c78f71a3548a26ddb0eddfa0e6baec9c3993356aba092b6f2179ea5572db1ed8228c178a9a0630017df50ac4ded3fe2ade3ad1652aedfd4b48e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-anonymous-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-fontch"
DESCRIPTION = "This package includes the documentation for texlive-fontch"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn17859"

RPM_NAME = "texlive-fontch-doc-2026.226.2.2svn17859-60.2.noarch.rpm"
RPM_HASH = "a890c721a061a060ccbf8dd19281c37622273f942ee7716a613ac9720c0773a0e72f2dafc0a4a5b14ac76ae2d9456bdd5d9ac3cb00a44d5d566a668cc5bc806c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontch-doc"

RDEPENDS:${PN} += ""

inherit rpm

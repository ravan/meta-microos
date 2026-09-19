SUMMARY = "Documentation for texlive-pst-antiprism"
DESCRIPTION = "This package includes the documentation for texlive-pst-antiprism"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn46643"

RPM_NAME = "texlive-pst-antiprism-doc-2026.226.0.0.02svn46643-59.2.noarch.rpm"
RPM_HASH = "4e57654a01a28f10dad8f2204833c6dbb71185e402e47da26fb421e9731a64aafd75c3a5a5aabdd38649ccc469b57de42bc2307a5aa8260dfb407a658fc3ee7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-antiprism-doc"

RDEPENDS:${PN} += ""

inherit rpm

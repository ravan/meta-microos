SUMMARY = "Documentation for texlive-commutative-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-commutative-diagrams"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn71053"

RPM_NAME = "texlive-commutative-diagrams-doc-2026.226.1.1.2svn71053-60.2.noarch.rpm"
RPM_HASH = "fcc29cc20d27e776d8541299b7395e7d653a0ae8fde6da76223306c49dcdcdedfc0c801ee2d39ad6c491bc3a0fbd259fcdf4f0455fc085cceeba98795dee2cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commutative-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm

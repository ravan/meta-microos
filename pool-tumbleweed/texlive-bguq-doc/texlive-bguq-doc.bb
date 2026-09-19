SUMMARY = "Documentation for texlive-bguq"
DESCRIPTION = "This package includes the documentation for texlive-bguq"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn27401"

RPM_NAME = "texlive-bguq-doc-2026.226.0.0.4svn27401-61.2.noarch.rpm"
RPM_HASH = "109e8950b0ed3e070f752ff375685e2ed24c9056787d1ed2b65b00d4253757073d3cf5fadf767e5e7914199909a6a8435ae4aebcbd205108f86479194e9fc087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bguq-doc"

RDEPENDS:${PN} += ""

inherit rpm

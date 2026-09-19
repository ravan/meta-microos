SUMMARY = "Documentation for texlive-censor"
DESCRIPTION = "This package includes the documentation for texlive-censor"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.5svn74794"

RPM_NAME = "texlive-censor-doc-2026.226.4.5svn74794-59.2.noarch.rpm"
RPM_HASH = "efce65fa2f7ff90ee5e028280f1c719994a0c5016a52cf6cb14512d8b41f241b9de7d2072e7a81beb1ee86dc95f08d24e17c164bc10d8e60f4c4536309bf52a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-censor-doc"

RDEPENDS:${PN} += ""

inherit rpm

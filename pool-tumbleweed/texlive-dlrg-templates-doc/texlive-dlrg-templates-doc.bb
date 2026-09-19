SUMMARY = "Documentation for texlive-dlrg-templates"
DESCRIPTION = "This package includes the documentation for texlive-dlrg-templates"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn74633"

RPM_NAME = "texlive-dlrg-templates-doc-2026.226.1.1.0svn74633-59.2.noarch.rpm"
RPM_HASH = "08aee60197de164bc3f45f4e2e777d01ca0a0600f9a5600074f6cecc69e4dace813622f6820337cfc6ee782912d730126638d681edbf16a67da70a6cf9762c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dlrg-templates-doc-de \
texlive-dlrg-templates-doc"

RDEPENDS:${PN} += ""

inherit rpm

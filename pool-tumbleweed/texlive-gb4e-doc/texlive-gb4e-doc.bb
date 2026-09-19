SUMMARY = "Documentation for texlive-gb4e"
DESCRIPTION = "This package includes the documentation for texlive-gb4e"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gb4e-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "ac37cc5e460ef0d8d51080fe8c9b80d1fa1239a3739a945175a7b4faec1479e045235e493abbb858fddd51a361f7998d197eecb22363e3396c61935b54c592e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gb4e-doc"

RDEPENDS:${PN} += ""

inherit rpm

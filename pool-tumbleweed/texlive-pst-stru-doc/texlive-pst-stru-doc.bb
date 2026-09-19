SUMMARY = "Documentation for texlive-pst-stru"
DESCRIPTION = "This package includes the documentation for texlive-pst-stru"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-doc-2026.226.0.0.13svn38613-60.4.noarch.rpm"
RPM_HASH = "ffb911fd3a9d4cc42d0de3c642d08830c85e4f390946d37c1e5e6c1278f92eb5c819801f6fb67b6bdd446bb1844784600282421c800ab748da68f3ab4e338d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-stru-doc"

RDEPENDS:${PN} += ""

inherit rpm

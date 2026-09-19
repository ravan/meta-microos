SUMMARY = "Documentation for texlive-pst-spinner"
DESCRIPTION = "This package includes the documentation for texlive-pst-spinner"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-doc-2026.226.1.02svn66115-60.4.noarch.rpm"
RPM_HASH = "cb329a968c9b1fc410b7f3e05da48e04c84597fdc4e49c6b0d4e0ec896d5077d3457b2e860779efd134441bb761f8fafd5a1b5577d838fe104ab0e9ccbded005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-spinner-doc"

RDEPENDS:${PN} += ""

inherit rpm

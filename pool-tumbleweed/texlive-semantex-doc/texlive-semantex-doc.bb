SUMMARY = "Documentation for texlive-semantex"
DESCRIPTION = "This package includes the documentation for texlive-semantex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.525svn76924"

RPM_NAME = "texlive-semantex-doc-2026.226.0.0.525svn76924-60.2.noarch.rpm"
RPM_HASH = "5f592a5b8bf183cb75be3abbfee577f2fc7b2589ba42a0a5efc37630fbb79602d213dca8ad7142bc1cf6dbc32c777662f163d7edd20dad540b695368512a06fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantex-doc"

RDEPENDS:${PN} += ""

inherit rpm

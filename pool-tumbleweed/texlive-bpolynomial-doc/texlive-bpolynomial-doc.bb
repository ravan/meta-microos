SUMMARY = "Documentation for texlive-bpolynomial"
DESCRIPTION = "This package includes the documentation for texlive-bpolynomial"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-bpolynomial-doc-2026.226.0.0.5svn15878-59.2.noarch.rpm"
RPM_HASH = "1bec5da7c6a2f29fcd00a61b53d7a5401315517aba6df6009fc3bcaa5ba2ef5857f4c5f28933017d5116458486052145af5ce4427da10d978e071e8a0f5129b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpolynomial-doc"

RDEPENDS:${PN} += ""

inherit rpm

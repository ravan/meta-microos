SUMMARY = "Documentation for texlive-bnumexpr"
DESCRIPTION = "This package includes the documentation for texlive-bnumexpr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7bsvn77682"

RPM_NAME = "texlive-bnumexpr-doc-2026.226.1.7bsvn77682-59.2.noarch.rpm"
RPM_HASH = "a6e7b222b298d519b2ae1859c7fbbd9259cd3baf8a9db83363dc0e353fa77317fa31b030e53a7a23d99f778e8c4b1db79b8e387c34e7d7784558af603c3c8600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bnumexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm

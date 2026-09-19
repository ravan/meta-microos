SUMMARY = "Documentation for texlive-trivialpursuit"
DESCRIPTION = "This package includes the documentation for texlive-trivialpursuit"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.7svn76152"

RPM_NAME = "texlive-trivialpursuit-doc-2026.226.0.0.1.7svn76152-59.2.noarch.rpm"
RPM_HASH = "a056d4a17612cb494bfaa2e21a229bfecb742564e0bf17b8c75b22392bbd6ff98139585b8115dbac7d064b342efc5cfaf5ff7419e2beb15901746b64745d2542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-trivialpursuit-doc-fr \
texlive-trivialpursuit-doc"

RDEPENDS:${PN} += ""

inherit rpm

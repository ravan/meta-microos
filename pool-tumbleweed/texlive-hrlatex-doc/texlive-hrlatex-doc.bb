SUMMARY = "Documentation for texlive-hrlatex"
DESCRIPTION = "This package includes the documentation for texlive-hrlatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-doc-2026.226.0.0.23svn18020-60.2.noarch.rpm"
RPM_HASH = "0b991587d8c7c1c8a2be744515ec655fb0bec8b75658888630e4bf48041db4e0d126bf2797c43e602fe14045eb0900278fb93eec253c66e3afbd5acd685a236b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hrlatex-doc-hr \
texlive-hrlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm

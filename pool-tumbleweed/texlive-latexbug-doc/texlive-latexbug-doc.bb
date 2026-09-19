SUMMARY = "Documentation for texlive-latexbug"
DESCRIPTION = "This package includes the documentation for texlive-latexbug"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0qsvn78101"

RPM_NAME = "texlive-latexbug-doc-2026.226.1.0qsvn78101-61.2.noarch.rpm"
RPM_HASH = "13509972d8267ac9a068e895788040591226639582a499f78b1e709e148697507d3ba0d6ca895b54989e81c952cad60c3eba574d800447243451a32db3cc3f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexbug-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-phfthm"
DESCRIPTION = "This package includes the documentation for texlive-phfthm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn60735"

RPM_NAME = "texlive-phfthm-doc-2026.226.1.2svn60735-58.2.noarch.rpm"
RPM_HASH = "aa7319dd7ea289ccf3cd8612d1a20e15316a36298de151248c5caa1b498dc3990a123d48ae36edfda88525ec6125cc2948779b8774b2c5da4eca8d2cc3f2f07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfthm-doc"

RDEPENDS:${PN} += ""

inherit rpm

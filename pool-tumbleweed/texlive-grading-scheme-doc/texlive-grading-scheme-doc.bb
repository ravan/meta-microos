SUMMARY = "Documentation for texlive-grading-scheme"
DESCRIPTION = "This package includes the documentation for texlive-grading-scheme"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-grading-scheme-doc-2026.226.0.0.1.1svn76924-60.4.noarch.rpm"
RPM_HASH = "8f6efa629607dc23eb2c2a83ebb5891692c5e7b8f214f83a91d9e436ee0835c0c249a551b1dfd23d6ecbcaebef02d361a43383a72295aeea1c473c789e61cbaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grading-scheme-doc"

RDEPENDS:${PN} += ""

inherit rpm

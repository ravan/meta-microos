SUMMARY = "Documentation for texlive-uiucredborder"
DESCRIPTION = "This package includes the documentation for texlive-uiucredborder"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn29974"

RPM_NAME = "texlive-uiucredborder-doc-2026.226.1.00svn29974-60.2.noarch.rpm"
RPM_HASH = "25ddd2ef8c4850a71d90f13e4b2abb17622f1187ed9264570f3fdd74e835b6f129200ab40c94632dc869750af2b0c73da577a54b68e8bf96bda1d27c644588af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uiucredborder-doc"

RDEPENDS:${PN} += ""

inherit rpm

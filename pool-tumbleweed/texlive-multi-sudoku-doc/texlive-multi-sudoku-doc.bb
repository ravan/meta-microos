SUMMARY = "Documentation for texlive-multi-sudoku"
DESCRIPTION = "This package includes the documentation for texlive-multi-sudoku"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn78101"

RPM_NAME = "texlive-multi-sudoku-doc-2026.226.1.00svn78101-61.2.noarch.rpm"
RPM_HASH = "2828035429b87c45182f349a95c8efcef8fb5e6dd0e1831f428aa1026915232605c2863898539fc3a6bc9c07f278ccfd8f8fb30837dcfc929f9daa7faeb4512d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multi-sudoku-doc"

RDEPENDS:${PN} += ""

inherit rpm

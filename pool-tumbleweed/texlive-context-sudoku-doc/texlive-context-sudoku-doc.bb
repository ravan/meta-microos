SUMMARY = "Documentation for texlive-context-sudoku"
DESCRIPTION = "This package includes the documentation for texlive-context-sudoku"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77880"

RPM_NAME = "texlive-context-sudoku-doc-2026.226.svn77880-61.2.noarch.rpm"
RPM_HASH = "fb9e97f5be69a5b24ec3af8f372aa9e65e33bbc7f56dae4be4b8e5ccb0ee5efdf8cee9f76bbd47dff46b7d9694d6c7896160011d32f330b44e892461fe2290ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-sudoku-doc"

RDEPENDS:${PN} += ""

inherit rpm

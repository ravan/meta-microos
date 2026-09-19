SUMMARY = "Documentation for texlive-sudoku"
DESCRIPTION = "This package includes the documentation for texlive-sudoku"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-sudoku-doc-2026.226.1.0svn78101-64.2.noarch.rpm"
RPM_HASH = "fe57132ce3daa97b23ba0775ce79c2c3c5b74ae0a668a830110355cf9c2fe98401229d334e04b2f6471af340a2862abb248344d897be007f9a3c30cb519efb6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sudoku-doc"

RDEPENDS:${PN} += ""

inherit rpm

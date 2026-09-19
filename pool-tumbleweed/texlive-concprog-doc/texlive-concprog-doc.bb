SUMMARY = "Documentation for texlive-concprog"
DESCRIPTION = "This package includes the documentation for texlive-concprog"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn18791"

RPM_NAME = "texlive-concprog-doc-2026.226.svn18791-60.2.noarch.rpm"
RPM_HASH = "02740ef6bafc432e4146fe4d7e5d609545028cfd4a050a07683ae04c7eb0cfa66aa28cb421da2f4ef0aae25605457a356d85a6989e4f4ebb299e7061d6f83f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concprog-doc"

RDEPENDS:${PN} += ""

inherit rpm

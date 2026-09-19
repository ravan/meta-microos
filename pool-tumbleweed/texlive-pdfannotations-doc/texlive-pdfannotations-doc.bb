SUMMARY = "Documentation for texlive-pdfannotations"
DESCRIPTION = "This package includes the documentation for texlive-pdfannotations"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn68958"

RPM_NAME = "texlive-pdfannotations-doc-2026.226.3.1svn68958-58.2.noarch.rpm"
RPM_HASH = "b155942ea4b5773a34f4380812e03232850efd8aec811926aef29240ce2fd9713c2ff8b831737d1a6c00974f45386ffcf4838971c79e24183d848bde0adadfe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfannotations-doc"

RDEPENDS:${PN} += ""

inherit rpm

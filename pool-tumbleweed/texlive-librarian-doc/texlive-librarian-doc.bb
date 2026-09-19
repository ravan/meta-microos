SUMMARY = "Documentation for texlive-librarian"
DESCRIPTION = "This package includes the documentation for texlive-librarian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn19880"

RPM_NAME = "texlive-librarian-doc-2026.226.1.0svn19880-61.2.noarch.rpm"
RPM_HASH = "8eba77128ac2fb045d8091a34682876bfc2dfc540b886ca8c8045f6bb321b9ba87dff6309c444a8e386b3272fd7d73346f8e1869d0a815a821ee11e982187508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librarian-doc"

RDEPENDS:${PN} += ""

inherit rpm

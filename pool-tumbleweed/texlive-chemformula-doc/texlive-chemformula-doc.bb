SUMMARY = "Documentation for texlive-chemformula"
DESCRIPTION = "This package includes the documentation for texlive-chemformula"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.17svn77682"

RPM_NAME = "texlive-chemformula-doc-2026.226.4.17svn77682-60.2.noarch.rpm"
RPM_HASH = "e6ca785e1664f85a02f9d6f3b4bc474b8ccf9ef16764cdcfdab3bae3009271660615f6ae2384726bbd3ef4092f04610d7197a34e5cde2689b6afdb800bbff954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemformula-doc"

RDEPENDS:${PN} += ""

inherit rpm

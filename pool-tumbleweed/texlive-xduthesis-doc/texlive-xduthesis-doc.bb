SUMMARY = "Documentation for texlive-xduthesis"
DESCRIPTION = "This package includes the documentation for texlive-xduthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn63116"

RPM_NAME = "texlive-xduthesis-doc-2026.226.1.00svn63116-59.4.noarch.rpm"
RPM_HASH = "831d3a9cfee19a7c640e38a965873964da484b7f3e58bf9a6ebd653e4991a9ca726e3c6977766a94901ae1a79690702b2d5f268ff37c6babe8273e4f68ff97c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-seu-ml-assign"
DESCRIPTION = "This package includes the documentation for texlive-seu-ml-assign"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn62933"

RPM_NAME = "texlive-seu-ml-assign-doc-2026.226.1.1svn62933-60.2.noarch.rpm"
RPM_HASH = "ca567fa88ec29b208994ff221bdff42d9d8c62004eb9747a999237f847d2b47cbbbccf5149af4e70bfd3fcadb7d8d38cfd6a543e7c6636316affd360c78edff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seu-ml-assign-doc"

RDEPENDS:${PN} += ""

inherit rpm

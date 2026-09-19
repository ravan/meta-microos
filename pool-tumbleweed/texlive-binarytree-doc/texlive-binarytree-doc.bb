SUMMARY = "Documentation for texlive-binarytree"
DESCRIPTION = "This package includes the documentation for texlive-binarytree"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn41777"

RPM_NAME = "texlive-binarytree-doc-2026.226.1.01svn41777-61.2.noarch.rpm"
RPM_HASH = "626f8de6e936bf5dacba2b4a3e7dc3023260ed06d511a1900592281d44473f09658c1e74241a99fae6530e8e8742bd26d4adcc77c45813204298273a2ff187d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-binarytree-doc"

RDEPENDS:${PN} += ""

inherit rpm

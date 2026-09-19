SUMMARY = "Documentation for texlive-pst-jtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-jtree"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn20946"

RPM_NAME = "texlive-pst-jtree-doc-2026.226.2.6svn20946-59.2.noarch.rpm"
RPM_HASH = "e6f3d98b3348a6f829d0a3a4fad3aa858b1e99578efda53ffd98419343e5fc6e8f82178bbd08dc0f92368728baa568020881436618a32d4ea79233b2e3ede1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-jtree-doc"

RDEPENDS:${PN} += ""

inherit rpm

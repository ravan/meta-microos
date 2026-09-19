SUMMARY = "Documentation for texlive-bath-bst"
DESCRIPTION = "This package includes the documentation for texlive-bath-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn77532"

RPM_NAME = "texlive-bath-bst-doc-2026.226.7.2svn77532-60.2.noarch.rpm"
RPM_HASH = "d31693ee5fa410a5e4cd9fc35fa9e8822b360a3a59d7b71161b1e8f4fec3b5028b2805410d5fec9a6d46f75a580edb3f8641ac4cac2cd6e731695e953fca350f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bath-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm

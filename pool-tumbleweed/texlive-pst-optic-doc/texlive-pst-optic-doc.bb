SUMMARY = "Documentation for texlive-pst-optic"
DESCRIPTION = "This package includes the documentation for texlive-pst-optic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn72694"

RPM_NAME = "texlive-pst-optic-doc-2026.226.1.05svn72694-59.2.noarch.rpm"
RPM_HASH = "516240a7563b86efc4fbc3cc90c5f0f859927bde8d69ddc4bdd242f15d2a36f4cdd8a81e545bab5b11fd612fe79a8760223822884cde1d8e8b23caec6c88755a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-optic-doc"

RDEPENDS:${PN} += ""

inherit rpm

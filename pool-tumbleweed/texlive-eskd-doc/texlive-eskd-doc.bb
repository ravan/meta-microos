SUMMARY = "Documentation for texlive-eskd"
DESCRIPTION = "This package includes the documentation for texlive-eskd"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-eskd-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "98fa9de201ecbcbd74c02c3e82dd8c4c7f02e2205e930e35d003c160c82dfadb6ab851fedd830d46eddb759421d01100e8aa43f02443b78a00283c476fa9cc82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eskd-doc"

RDEPENDS:${PN} += ""

inherit rpm

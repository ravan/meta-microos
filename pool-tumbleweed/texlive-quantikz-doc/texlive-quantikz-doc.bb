SUMMARY = "Documentation for texlive-quantikz"
DESCRIPTION = "This package includes the documentation for texlive-quantikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn67206"

RPM_NAME = "texlive-quantikz-doc-2026.226.1.0.1svn67206-60.4.noarch.rpm"
RPM_HASH = "5fcc5ab57816a2e12b58e0cf71828bb36ec673b502031fa03b8f5a15765c0e07d8969c1fcc8b83d4a1d8cd4d0c57a3c0b1c8cfd451a5134bbbb25354f1bdcfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantikz-doc"

RDEPENDS:${PN} += ""

inherit rpm

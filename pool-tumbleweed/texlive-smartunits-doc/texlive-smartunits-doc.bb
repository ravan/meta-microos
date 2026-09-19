SUMMARY = "Documentation for texlive-smartunits"
DESCRIPTION = "This package includes the documentation for texlive-smartunits"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn39592"

RPM_NAME = "texlive-smartunits-doc-2026.226.1.2svn39592-64.2.noarch.rpm"
RPM_HASH = "8af0b51aa8877c90f87713823c74fdc042d4cf940a91da5d969c1aef1e924ab771c7d94363b2bb9c952c3cfe8a12edd13eca9dcbd8fd36de6e8e8620a6ed10c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartunits-doc"

RDEPENDS:${PN} += ""

inherit rpm

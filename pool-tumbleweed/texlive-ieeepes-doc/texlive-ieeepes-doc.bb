SUMMARY = "Documentation for texlive-ieeepes"
DESCRIPTION = "This package includes the documentation for texlive-ieeepes"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn17359"

RPM_NAME = "texlive-ieeepes-doc-2026.226.4.0svn17359-60.2.noarch.rpm"
RPM_HASH = "b7eed3dcafb0d642161adcbc44c94c18b95ed2e8c3c220bbd282b60271c68cc6f5803be89a9cccf66d30cf75e2c50612ef2c2505cd00c912bfe7076f9214bbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeepes-doc"

RDEPENDS:${PN} += ""

inherit rpm

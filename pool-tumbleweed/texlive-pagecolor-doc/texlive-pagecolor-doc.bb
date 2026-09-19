SUMMARY = "Documentation for texlive-pagecolor"
DESCRIPTION = "This package includes the documentation for texlive-pagecolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn77682"

RPM_NAME = "texlive-pagecolor-doc-2026.226.1.2dsvn77682-58.2.noarch.rpm"
RPM_HASH = "cd43119bb4ee6cc95118b00ba759ea3224c08aadc51ea9e931cdc3fee5e32b602d1714c61047e247bf4e1a2a3a4f72b58528e3ebfe1c7474317ff9aecdc1a131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm

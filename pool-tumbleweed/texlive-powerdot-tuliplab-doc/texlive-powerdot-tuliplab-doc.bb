SUMMARY = "Documentation for texlive-powerdot-tuliplab"
DESCRIPTION = "This package includes the documentation for texlive-powerdot-tuliplab"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn47963"

RPM_NAME = "texlive-powerdot-tuliplab-doc-2026.226.1.0.0svn47963-59.2.noarch.rpm"
RPM_HASH = "ba3a6cd45cdca80719184a44093ab0fedd553353445490510d2755311f17a85640cce2a581076012410860dc6b8d5f6a0ee49bc6862cd743e95dd17b0c2ccee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-powerdot-tuliplab-doc"

RDEPENDS:${PN} += ""

inherit rpm

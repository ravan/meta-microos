SUMMARY = "Documentation for texlive-cooking-units"
DESCRIPTION = "This package includes the documentation for texlive-cooking-units"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.00svn76924"

RPM_NAME = "texlive-cooking-units-doc-2026.226.3.00svn76924-61.2.noarch.rpm"
RPM_HASH = "527df78e0b65594e6235fc5b76ac1cd324f1857d0745713f9c129d6c8cb3f639f16b7cdd544c6d15d03e514379c18b191eb127d64496c818f74ba4ed73dff921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooking-units-doc"

RDEPENDS:${PN} += ""

inherit rpm

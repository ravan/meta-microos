SUMMARY = "Documentation for texlive-eemeir"
DESCRIPTION = "This package includes the documentation for texlive-eemeir"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-doc-2026.226.1.1bsvn15878-61.4.noarch.rpm"
RPM_HASH = "bae154f4db80696c54dc48e4490cab195a879f9dea3e93788b3a9831cc99270a8a8a9083ed3b94053b41081b1c80753ac64230dab2ff9e7fd51a8e9dd9b95b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eemeir-doc"

RDEPENDS:${PN} += ""

inherit rpm

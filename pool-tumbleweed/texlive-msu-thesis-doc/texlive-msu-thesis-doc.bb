SUMMARY = "Documentation for texlive-msu-thesis"
DESCRIPTION = "This package includes the documentation for texlive-msu-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3bsvn71883"

RPM_NAME = "texlive-msu-thesis-doc-2026.226.4.3bsvn71883-61.2.noarch.rpm"
RPM_HASH = "946aec73a9a2d44a112c756b5415c8503653366a151f0d24c8eb424ad0ca80fadc2962c284e960b65cc0ff97f6256f4b0f102a054323aee4e08a2da5d78abd06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msu-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

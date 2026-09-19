SUMMARY = "Documentation for texlive-pst-cie"
DESCRIPTION = "This package includes the documentation for texlive-pst-cie"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06bsvn60959"

RPM_NAME = "texlive-pst-cie-doc-2026.226.1.06bsvn60959-59.2.noarch.rpm"
RPM_HASH = "7ba5d1a760ec205d16d19e2d87bad53c5def8b661e1570ba2b79bd48703891c5a07e3486dedb1fa6ef118580ccd10014ffae0a47eca452467a735a461de5f2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-cie-doc"

RDEPENDS:${PN} += ""

inherit rpm

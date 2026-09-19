SUMMARY = "Documentation for texlive-tkz-grapheur"
DESCRIPTION = "This package includes the documentation for texlive-tkz-grapheur"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.30bsvn78169"

RPM_NAME = "texlive-tkz-grapheur-doc-2026.226.0.0.30bsvn78169-59.2.noarch.rpm"
RPM_HASH = "c9722d0c3c0542d59cd2e490fdae4f82a9baddc7e3b494c205093e8ee0f15dca597ef431fe93f199e6eca3c670740964251014050a9e6fb9dc20e58fc0dcf2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-grapheur-doc-en;fr \
texlive-tkz-grapheur-doc"

RDEPENDS:${PN} += ""

inherit rpm

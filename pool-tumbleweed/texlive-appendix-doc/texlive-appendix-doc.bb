SUMMARY = "Documentation for texlive-appendix"
DESCRIPTION = "This package includes the documentation for texlive-appendix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2csvn78101"

RPM_NAME = "texlive-appendix-doc-2026.226.1.2csvn78101-61.2.noarch.rpm"
RPM_HASH = "646f40d2662fdab0ee2a9d425fa5fe86a5f4ed48b1e23c4799a86e9163cba3dd071a6483a1c7b469abe3ec38cc13d4707bb68dacf29aca8c5a61f2743b74a6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-appendix-doc"

RDEPENDS:${PN} += ""

inherit rpm

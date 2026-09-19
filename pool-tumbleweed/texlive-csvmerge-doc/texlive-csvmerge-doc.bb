SUMMARY = "Documentation for texlive-csvmerge"
DESCRIPTION = "This package includes the documentation for texlive-csvmerge"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51857"

RPM_NAME = "texlive-csvmerge-doc-2026.226.1.0svn51857-61.2.noarch.rpm"
RPM_HASH = "e88143f1ea05925aecaf427616825da24b4a87220f5ccc6ccf5fc486c233472507652047622c3cf2838308c5bdd093223a24bca86c860370f27d2077fb5258bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csvmerge-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-getitems"
DESCRIPTION = "This package includes the documentation for texlive-getitems"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39365"

RPM_NAME = "texlive-getitems-doc-2026.226.1.0svn39365-60.2.noarch.rpm"
RPM_HASH = "5d2f8da76c8d78df1e2efab960c533174caa09156fb0d8c193c69abefa8547e360f734840ca162338d52272a4d8f83d1390992c298ae54d99b7a69e8f0fee2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getitems-doc"

RDEPENDS:${PN} += ""

inherit rpm

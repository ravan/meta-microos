SUMMARY = "Documentation for texlive-glossaries-irish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-irish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "d40686080a6ae2d81ede1d5f1e716241ea96c41d5133db66e4894c4244824e0aee34accd014543a9b917b4b3a0077467d13a747e55c583a05106822a5c360d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm

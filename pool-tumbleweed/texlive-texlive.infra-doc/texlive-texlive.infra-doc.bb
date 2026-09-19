SUMMARY = "Documentation for texlive-texlive.infra"
DESCRIPTION = "This package includes the documentation for texlive-texlive.infra"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78218"

RPM_NAME = "texlive-texlive.infra-doc-2026.227.svn78218-62.2.noarch.rpm"
RPM_HASH = "37fd18c2acd43be363f4b32ac4ec55fbbad28613f71a58c8e58cf39d40f4b11ebdea1d538603899074a962dd01a6fdb4c7f9313c0a1a2f15ead55f88c56728bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mktexlsr.1 \
man-tlmgr.1 \
texlive-texlive.infra-doc"

RDEPENDS:${PN} += ""

inherit rpm

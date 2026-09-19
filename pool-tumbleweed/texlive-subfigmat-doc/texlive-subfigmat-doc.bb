SUMMARY = "Documentation for texlive-subfigmat"
DESCRIPTION = "This package includes the documentation for texlive-subfigmat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn20308"

RPM_NAME = "texlive-subfigmat-doc-2026.226.1.0svn20308-64.2.noarch.rpm"
RPM_HASH = "e5609e2330b88c3c059cdc39bbd6da60286232edc16b75e4dba439edc0601791ec65a2ab43e5961d8a10388fe357299d2ec376b434192ed0f7a351e898445e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfigmat-doc"

RDEPENDS:${PN} += ""

inherit rpm

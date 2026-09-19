SUMMARY = "Documentation for texlive-glossaries-serbian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-serbian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "d3fb78134fe69280c504bec544cfe46db207f6c190cab8de698c78a2449039ec0257fe761bf0faee4bdba856df0f5d7ba2eab72218ef66a506f6e3b3cac8ed63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm

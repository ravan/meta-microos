SUMMARY = "Documentation for texlive-changelayout"
DESCRIPTION = "This package includes the documentation for texlive-changelayout"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn16094"

RPM_NAME = "texlive-changelayout-doc-2026.226.1.0svn16094-59.2.noarch.rpm"
RPM_HASH = "ee40137ee1e98628b367b20bec94087cb45150b7f9334fc1155d66632a217d986b35650efb2366037267a468bc4d54885685257c9be6db2671e4ddb3a4d7c49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm

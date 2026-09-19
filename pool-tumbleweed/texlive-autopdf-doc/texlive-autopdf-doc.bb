SUMMARY = "Documentation for texlive-autopdf"
DESCRIPTION = "This package includes the documentation for texlive-autopdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32377"

RPM_NAME = "texlive-autopdf-doc-2026.226.1.1svn32377-60.2.noarch.rpm"
RPM_HASH = "c8aed85286a08422a9d4ef8922628797658b4f34b579b578d058cadca7a167eab8c14aa6599b192c5f4797c48b57175c10974537c4e618804129b253156e8137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm

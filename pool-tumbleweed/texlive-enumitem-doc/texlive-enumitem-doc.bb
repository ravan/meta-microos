SUMMARY = "Documentation for texlive-enumitem"
DESCRIPTION = "This package includes the documentation for texlive-enumitem"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.11svn77682"

RPM_NAME = "texlive-enumitem-doc-2026.226.3.11svn77682-61.4.noarch.rpm"
RPM_HASH = "88bfed7356936a622a9e73f6e0217f7d27911c8b107f052d96c97eb907ae63a434c1722b9b3d71eb17daec96c23c61c2d53f5c058f21053ed9b8fb4b7b859c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-bidipresentation"
DESCRIPTION = "This package includes the documentation for texlive-bidipresentation"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn35267"

RPM_NAME = "texlive-bidipresentation-doc-2026.226.0.0.3svn35267-61.2.noarch.rpm"
RPM_HASH = "a8dc903ee5483c6d59487b502efe267581dbc602ea9aa9db9622f50d4d7707e93dc9afd7ca98651461cc415421862ab8acf0f55caaaeb25f05c0dfa90cb976b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidipresentation-doc"

RDEPENDS:${PN} += ""

inherit rpm

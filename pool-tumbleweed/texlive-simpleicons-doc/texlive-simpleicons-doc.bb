SUMMARY = "Documentation for texlive-simpleicons"
DESCRIPTION = "This package includes the documentation for texlive-simpleicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.16.9.0svn78009"

RPM_NAME = "texlive-simpleicons-doc-2026.226.16.9.0svn78009-60.2.noarch.rpm"
RPM_HASH = "03fe39e9cf3cb8c5fb6092d2b49286ea94c21eb2a239542184cdd6320a179459f3a429d27a7bc72927b9403da169e57a9909726dfae270e9b127b00cfd205fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleicons-doc"

RDEPENDS:${PN} += ""

inherit rpm

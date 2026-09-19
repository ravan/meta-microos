SUMMARY = "Documentation for texlive-courseoutline"
DESCRIPTION = "This package includes the documentation for texlive-courseoutline"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-courseoutline-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "13e8a42d1be556eea7b165cb024ac9f55c6740a51d00d721ca64444c98b5a3581443c7d1aa0bdc2e6964b5c7e21bea8bd294a74f22ce70005bb0fe030d4fb88e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courseoutline-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-simpleinvoice"
DESCRIPTION = "This package includes the documentation for texlive-simpleinvoice"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn45673"

RPM_NAME = "texlive-simpleinvoice-doc-2026.226.svn45673-60.2.noarch.rpm"
RPM_HASH = "7f0114a013c286a167a3b82d7750cefb7d0d108db47a6eb9847ab935b41f79c051376627b2feb4cf2dabba3f9c15ce70044785bd59074bba4b81dc2332016d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleinvoice-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-lion-msc"
DESCRIPTION = "This package includes the documentation for texlive-lion-msc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.31svn75184"

RPM_NAME = "texlive-lion-msc-doc-2026.226.0.0.31svn75184-61.2.noarch.rpm"
RPM_HASH = "b78cbe35ddf9e17ff164b68ab0b8744780ef5bc7376b6b06cc34f296b26dc56e3fd4b3d4e6759eb38f9496b9d94fc2ed2e5da28ad01ffa90a8413b2a56e1a1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lion-msc-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-adjmulticol"
DESCRIPTION = "This package includes the documentation for texlive-adjmulticol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-adjmulticol-doc-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "072584fcdb0c75756b5d31555046bdacb784ce75b4ccea8f0166e33e28ef65dd8171caf270c297011b38508ce7cbfcd1aac76416f9bc865be3483ff690ca9782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adjmulticol-doc"

RDEPENDS:${PN} += ""

inherit rpm

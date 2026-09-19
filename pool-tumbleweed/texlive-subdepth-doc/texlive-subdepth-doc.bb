SUMMARY = "Documentation for texlive-subdepth"
DESCRIPTION = "This package includes the documentation for texlive-subdepth"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-subdepth-doc-2026.226.0.0.1svn77682-64.2.noarch.rpm"
RPM_HASH = "750e2bfbb8f34b467d7e8bcaa3b75f0d374d4c2cb7a308709262740aec9a1a40d5886eda2620060b5c4a87c0969f8e23f8dec5553c0d6f629d5b064eabc3e223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subdepth-doc"

RDEPENDS:${PN} += ""

inherit rpm

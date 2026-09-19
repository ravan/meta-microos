SUMMARY = "Documentation for texlive-warning"
DESCRIPTION = "This package includes the documentation for texlive-warning"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn73265"

RPM_NAME = "texlive-warning-doc-2026.226.0.0.11svn73265-60.2.noarch.rpm"
RPM_HASH = "fb4973a8da974740d02c2647d42f4fc852fe70bae5791449a41818078807d53413732c7a60c086386560f38c1fbe4cbc32565bb13936a4aaea87995a8ae02d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-warning-doc"

RDEPENDS:${PN} += ""

inherit rpm

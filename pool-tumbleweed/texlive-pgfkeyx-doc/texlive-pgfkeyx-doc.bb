SUMMARY = "Documentation for texlive-pgfkeyx"
DESCRIPTION = "This package includes the documentation for texlive-pgfkeyx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn26093"

RPM_NAME = "texlive-pgfkeyx-doc-2026.226.0.0.0.1svn26093-58.2.noarch.rpm"
RPM_HASH = "d9bd6ae51c858d3866374382a5cf7ed78253a1a7b84bc08276317cd93cb82a6bcd64993639596694b30ce1a5aae6d403a31086aff955ecc2edf158db902e7e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfkeyx-doc"

RDEPENDS:${PN} += ""

inherit rpm

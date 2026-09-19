SUMMARY = "Documentation for texlive-biblatex-cse"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-cse"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn76777"

RPM_NAME = "texlive-biblatex-cse-doc-2026.226.2.0.0svn76777-61.2.noarch.rpm"
RPM_HASH = "d1ed909c8cb284f50db7a946668531b5fe9cf3c3630ec087b20c5c1b2ba7ffce7c31ff97b04ee1e653cf1f5f25aa776bd813df9a92193d190b45d773c0f299c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cse-doc"

RDEPENDS:${PN} += ""

inherit rpm

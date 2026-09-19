SUMMARY = "Documentation for texlive-latex-uni8"
DESCRIPTION = "This package includes the documentation for texlive-latex-uni8"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn49729"

RPM_NAME = "texlive-latex-uni8-doc-2026.226.0.0.03svn49729-63.2.noarch.rpm"
RPM_HASH = "151cdba42d59bfb0ba223a80ace7cf1e4a25964f781debd93d8ff8bb5cb28cb9e6eb6afa1a086a07a22c53e067896a037d1f022f9854f882478c7d6c38a891f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-uni8-doc"

RDEPENDS:${PN} += ""

inherit rpm

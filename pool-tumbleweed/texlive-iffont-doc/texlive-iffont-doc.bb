SUMMARY = "Documentation for texlive-iffont"
DESCRIPTION = "This package includes the documentation for texlive-iffont"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn38823"

RPM_NAME = "texlive-iffont-doc-2026.226.1.0.0svn38823-60.2.noarch.rpm"
RPM_HASH = "7c15d80442ab8aa13a8e8805f865f3e62cd0e1e54d6de9b1e51bb803eb9398b91c7f9526732dd973a0cb4635e39186477a8d3be080c697ff98b9c6e326b8582b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iffont-doc"

RDEPENDS:${PN} += ""

inherit rpm

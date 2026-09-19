SUMMARY = "Documentation for texlive-biblatex-musuos"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-musuos"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24097"

RPM_NAME = "texlive-biblatex-musuos-doc-2026.226.1.0svn24097-61.2.noarch.rpm"
RPM_HASH = "d22ec35f45e7b48fee53fe087af9f282f069e7f1d7f5ed8f06f0fa77479f02b4759c913753a9838e4717507a52db6fe0fa2763412eeae36050dde67a5d5387e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-musuos-doc"

RDEPENDS:${PN} += ""

inherit rpm

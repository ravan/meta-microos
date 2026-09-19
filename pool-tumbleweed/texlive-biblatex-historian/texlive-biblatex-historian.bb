SUMMARY = "A BibLaTeX style"
DESCRIPTION = "A BibLaTeX style, based on the Turabian Manual (a version of \
Chicago)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn19787"

RPM_NAME = "texlive-biblatex-historian-2026.226.0.0.4svn19787-61.2.noarch.rpm"
RPM_HASH = "03403b946e14ee4d94dfac795988690c39c8882418ae674133390db3f6dd7e4673f40a99cd92edec56560816c7a1c786c3298aeadea1ea12e6ecc8c15a117fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-historian.bbx \
tex-historian.cbx \
tex-historian.lbx \
texlive-biblatex-historian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

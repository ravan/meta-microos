SUMMARY = "BibLaTeX stylefiles for German law theses"
DESCRIPTION = "The package provides a custom citation-style for typesetting a \
German law thesis with LaTeX. The package (using BibLaTeX) is \
based on biblatex-dw and uses biber."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23svn77682"

RPM_NAME = "texlive-biblatex-juradiss-2026.226.0.0.23svn77682-61.2.noarch.rpm"
RPM_HASH = "208939fa46a72fae3a20e4650a3e2b54f619c5843f6b31f069f4542ebd3cf7e52b5f2ff8acd0d58b6b676ae28595947dedd27bc72b8d03674c230e9ec6302414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-juradiss.bbx \
tex-biblatex-juradiss.cbx \
texlive-biblatex-juradiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle-dw.bbx \
tex-authortitle-dw.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

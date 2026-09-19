SUMMARY = "Macros for typesetting crossword puzzles"
DESCRIPTION = "The package provides a LaTeX method of typesetting crosswords, \
and assists the composer ensure that the grid all goes together \
properly. Brian Hamilton Kelly's original was written for LaTeX \
2.09, and needed to be updated to run with current LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn16896"

RPM_NAME = "texlive-crosswrd-2026.226.3.0svn16896-61.2.noarch.rpm"
RPM_HASH = "7ce4988ce49cfda56bc5506b56a958ffb706f8fd4546291e8e1d07c8eae9878755e9446dc847931ef3cfde5c21be4f00f427a13f6c772168e23bc65f43b65daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crosswrd.sty \
texlive-crosswrd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Extend graphicx to improve placement of graphics"
DESCRIPTION = "Graphbox is an extension of the standard graphicx LaTeX2e \
package to allow the placement of graphics relative to the \
'current position' using additional optional arguments of \
\\includegraphics. For example, changing the vertical alignment \
is convenient for using graphics as elements of (mathematical) \
formulae. Options for shifting, smashing and hiding the \
graphics may be useful in support, for example, of the beamer \
framework."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn77682"

RPM_NAME = "texlive-graphbox-2026.226.1.1.1svn77682-60.4.noarch.rpm"
RPM_HASH = "e75922f3d216cf2c88d5a0752c530ed03256f13602819f17cb6bb76f72a990fffd3cbb848a157dead7fd3abccc7fcd68e753419ceac4ac771d5509fa8690e668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphbox.sty \
texlive-graphbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

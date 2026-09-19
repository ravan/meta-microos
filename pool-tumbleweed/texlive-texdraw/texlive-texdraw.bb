SUMMARY = "Graphical macros, using embedded PostScript"
DESCRIPTION = "TeXdraw is a set of macro definitions for TeX, which allow the \
user to produce PostScript drawings from within TeX and LaTeX. \
TeXdraw has been designed to be extensible. Drawing 'segments' \
are relocatable, self-contained units. Using a combination of \
TeX's grouping mechanism and the gsave/grestore mechanism in \
PostScript, drawing segments allow for local changes to the \
scaling and line parameters. Using TeX's macro definition \
capability, new drawing commands can be constructed from \
drawing segments."
LICENSE = "LPPL-1.0"

PV = "2026.227.v2r3svn64477"

RPM_NAME = "texlive-texdraw-2026.227.v2r3svn64477-62.2.noarch.rpm"
RPM_HASH = "3c232fa27497f8cfaf4f3735bd5fcabbbc58461edd99f0356b7951c88660fd0af9744eee7e89b6ed3f79d7f0c1f4e0caab9c62cfd9d6fdeac25bd2c6545c2e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blockdiagram.tex \
tex-texdraw.sty \
tex-texdraw.tex \
tex-txdps.tex \
tex-txdtools.tex \
texlive-texdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

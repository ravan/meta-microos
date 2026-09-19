SUMMARY = "Draw cooking symbols"
DESCRIPTION = "The package uses TikZ for drawing cooking symbols like top \
heat, airfryer and so on. The commands are provided in English \
and German. The size of the symbol is based on the font size \
and grabbed with \\settoheight and \\settodepth."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn75636"

RPM_NAME = "texlive-tikz-cookingsymbols-2026.227.2.0svn75636-62.2.noarch.rpm"
RPM_HASH = "d4929af12f115f48b6fa47c26bda3c929cafcd8668af51d467e1d78641a93b29e51ab5afa485b8b252b8cf4cca1454c0f3d2e225ea0c3d46243a5184d4145461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-cookingsymbols.sty \
texlive-tikz-cookingsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

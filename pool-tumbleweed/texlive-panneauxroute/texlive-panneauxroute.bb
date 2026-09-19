SUMMARY = "Commands to display French road signs (vector graphics)"
DESCRIPTION = "The package provides commands to insert French road signs as \
vector graphics: \\AffPanneau[graphicx options]{code} \
\\prcode[graphicx options]"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.2svn73069"

RPM_NAME = "texlive-panneauxroute-2026.226.0.0.1.2svn73069-58.2.noarch.rpm"
RPM_HASH = "86c89c9c5d27872bf36cdb8022ce845af820d4537581d85eb1d63211eb0ca1679de5602edec4810948dca98b554f9552cbc4634db278de90640f2f37eec4d853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PanneauxRoute.sty \
texlive-panneauxroute"

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

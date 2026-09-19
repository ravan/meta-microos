SUMMARY = "Absolute content positioning"
DESCRIPTION = "The package provides commands so that the user of LuaLaTeX may \
position arbitrary content at any position specified by \
absolute coordinates on the page. The package draws a grid on \
each page of the document, to aid positioning (the grid may be \
disabled, for 'final copy' using the command \\placeatsetup)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1d1svn45145"

RPM_NAME = "texlive-placeat-2026.226.0.0.1d1svn45145-58.2.noarch.rpm"
RPM_HASH = "cbcb58646305b7c9a9dd36e4e46d83950d1e9f2d367a93c04e9f1b3f39ca16ea98bff98cf940d3de8f82aa2e49057ba7759ff489b980a73c3d84f49d85e445b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeat.sty \
texlive-placeat"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

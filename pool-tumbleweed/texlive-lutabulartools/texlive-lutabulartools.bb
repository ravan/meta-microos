SUMMARY = "Some useful LuaLaTeX-based tabular tools"
DESCRIPTION = "This package provides some useful commands for tabular matter. \
It uses LuaLaTeX and offers the ability to combine the \
facilities of multirow and makecell with an easy to use syntax. \
It also adds some enhanced rules for the booktabs package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73345"

RPM_NAME = "texlive-lutabulartools-2026.226.svn73345-59.2.noarch.rpm"
RPM_HASH = "a2256cefc49af3dd946b152c9345ee58e0f74ee219e35a1ff91fcbda51da42bb36614d2d0dc08c8633164d3c354dd1e41f4c5768e52702760479456c9fa6a1f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lutabulartools.sty \
texlive-lutabulartools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-colortbl.sty \
tex-longtable.sty \
tex-luacode.sty \
tex-makecell.sty \
tex-multirow.sty \
tex-penlightplus.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

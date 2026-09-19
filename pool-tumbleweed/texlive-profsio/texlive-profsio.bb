SUMMARY = "Commands (with TikZ) to work with French 'BTS SIO' maths themes"
DESCRIPTION = "This package provides some commands (in French) to work with: \
tables of Karnaugh ; MPM graphs ; simple graphs."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn76398"

RPM_NAME = "texlive-profsio-2026.226.0.0.3.5svn76398-59.2.noarch.rpm"
RPM_HASH = "4e985a5a9ed7ea8d4425f27d772456dd85b36e5ed9fecbc82b367495426785ad20f83329927602d4360e59eb3f63c5d1226c505fd499c5d5dfbdb6ae65fbd43d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProfSio.sty \
texlive-profsio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-luacode.sty \
tex-lualinalg.sty \
tex-nicematrix.sty \
tex-pgffor.sty \
tex-simplekv.sty \
tex-siunitx.sty \
tex-systeme.sty \
tex-tabularray.sty \
tex-tikz.sty \
tex-xintbinhex.sty \
tex-xintexpr.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

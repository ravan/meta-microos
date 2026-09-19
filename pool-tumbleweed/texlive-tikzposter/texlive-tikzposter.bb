SUMMARY = "Create scientific posters using TikZ"
DESCRIPTION = "A document class provides a simple way of using TikZ for \
generating posters. Several formatting options are available, \
and spacing and layout of the poster is to a large extent \
automated."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn32732"

RPM_NAME = "texlive-tikzposter-2026.226.2.0svn32732-59.2.noarch.rpm"
RPM_HASH = "81b62824952450f67a40595deede1eebb479e380c3b7b43227f1cae7c9880f668b38ec182c132cede10f0ae8a34230b9a3e99fa6976967944a6699a33d001bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzposter.cls \
tex-tikzposterBackgroundstyles.tex \
tex-tikzposterBlockstyles.tex \
tex-tikzposterColorpalettes.tex \
tex-tikzposterColorstyles.tex \
tex-tikzposterInnerblockstyles.tex \
tex-tikzposterLayoutthemes.tex \
tex-tikzposterNotestyles.tex \
tex-tikzposterTitlestyles.tex \
texlive-tikzposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a0size.sty \
tex-ae.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-extarticle.cls \
tex-geometry.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

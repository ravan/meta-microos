SUMMARY = "Compiling basic math formulas in Japanese using LuaLaTeX"
DESCRIPTION = "This is a style file for compiling basic maths formulas in \
Japanese using LuaLaTeX. \\NewDocumentCommand allows you to \
specify whether the formula should be used within a sentence or \
on a new line. The main packages used in \
japanese-mathformulas.sty are amsmath, amssymb, siunitx, \
ifthen, xparse, TikZ, mathtools, and graphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn64678"

RPM_NAME = "texlive-japanese-mathformulas-2026.226.1.0.2svn64678-63.2.noarch.rpm"
RPM_HASH = "d8edbdc677f67b35ee0e11b59096f35f33ee8ac601c464c1e8a09beeeee128096ff287b7cabc201af0dcd709ca496147758410e5897579b443c24487e2084c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-japanese-mathformulas.sty \
texlive-japanese-mathformulas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-esvect.sty \
tex-graphics.sty \
tex-ifthen.sty \
tex-luatexja-fontspec.sty \
tex-luatexja-otf.sty \
tex-luatexja.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

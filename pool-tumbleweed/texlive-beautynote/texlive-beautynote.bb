SUMMARY = "A package designed to meet the publication of books and the production of LaTeX templates, with elegant chapter"
DESCRIPTION = "The package is a specially designed to meet the publication of \
books and the production of LaTeX templates, with elegant \
chapter styles and unique page styles."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-beautynote-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "85f7a17d28ac5a61fb8f360772013a6d3e7dcabc6d3f0f8ff54c00324337e660305cdba5d2512f99a7a01b8e96d67f72447d126e61284a466b72dfceaa1df512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beautynote.cls \
texlive-beautynote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bbding.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-bropd.sty \
tex-csquotes.sty \
tex-doclicense.sty \
tex-empheq.sty \
tex-enumitem.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-fbox.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-lipsum.sty \
tex-mathtools.sty \
tex-mdframed.sty \
tex-ninecolors.sty \
tex-pgfornament-han.sty \
tex-pgfplots.sty \
tex-physics.sty \
tex-pifont.sty \
tex-psfrag.sty \
tex-report.cls \
tex-rotating.sty \
tex-shadowtext.sty \
tex-tikz.sty \
tex-times.sty \
tex-titlesec.sty \
tex-transparent.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

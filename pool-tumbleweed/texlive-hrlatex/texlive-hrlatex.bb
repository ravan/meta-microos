SUMMARY = "LaTeX support for Croatian documents"
DESCRIPTION = "This package simplifies creation of new documents for the \
(average) Croatian user. As an example, a class file hrdipl.cls \
(designed for the graduation thesis at the University of \
Zagreb) and sample thesis documents are included."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-2026.226.0.0.23svn18020-60.2.noarch.rpm"
RPM_HASH = "eb40d795c3b2e9000be5fffc251fb7be07d5f2dd130c7051d77a0903aad0b0a4e28246155a280e942b3244ab0b6a2d16c36746e7b4a200fd28fdeed2156f4c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fsbispit.cls \
tex-fsbmath.sty \
tex-hrlatex.sty \
texlive-hrlatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsopn.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-calc.sty \
tex-cancel.sty \
tex-enumerate.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-multicol.sty \
tex-optional.sty \
tex-paralist.sty \
tex-txfonts.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

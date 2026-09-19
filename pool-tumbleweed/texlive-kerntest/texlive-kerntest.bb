SUMMARY = "Print tables and generate control files to adjust kernings"
DESCRIPTION = "This class makes it easy to generate tables that show many \
different kerning pairs of an arbitrary font, usable by LaTeX. \
It shows the kerning values that are used in the font by \
default. In addition, this class enables the user to alter the \
kernings and to observe the results. Kerning pairs can be \
defined for groups of similar glyphs at the same time. An mtx \
file is generated automatically. The mtx file may then be \
loaded by fontinst to introduce the user-made kernings into the \
virtual font for later use in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.32svn15878"

RPM_NAME = "texlive-kerntest-2026.226.1.32svn15878-63.2.noarch.rpm"
RPM_HASH = "3ba2281f7fe632a8d3f6216d2fe9897e017e7324a6d065392595c4502e3ad8f682f54a13bd1474d0de6136188c718e804375e1fd938bb44fbadad8628544551e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kerntest.cls \
tex-ly1mtx.clo \
tex-ot1mtx.clo \
tex-t1cmr-1200.fd \
tex-t1mtx.clo \
tex-t2amtx.clo \
tex-t2bmtx.clo \
tex-ts1mtx.clo \
texlive-kerntest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-calc.sty \
tex-color.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

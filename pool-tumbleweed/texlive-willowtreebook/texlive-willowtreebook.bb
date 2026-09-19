SUMMARY = "Easy basic book class, built on memoir"
DESCRIPTION = "The willowtreebook class is a simple book class, which the \
author uses for his lecture notes to be found on his web page \
Benjamin McKay. It actually just selects options for the more \
sophisticated memoir class."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn60638"

RPM_NAME = "texlive-willowtreebook-2026.226.1.03svn60638-60.2.noarch.rpm"
RPM_HASH = "a978e05c7e22caeffd12b8f9b468540e1f488df04b2686b30614e57ef0229be4757964809ef6068a74e7e88e9b117fcf2910777348ce572ca522646d7bcc86d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-willowtreebook.cls \
texlive-willowtreebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKutf8.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-braket.sty \
tex-cfr-lm.sty \
tex-colortbl.sty \
tex-embrac.sty \
tex-enumitem.sty \
tex-etex.sty \
tex-eucal.sty \
tex-fontenc.sty \
tex-inputenc.sty \
tex-isomath.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-multicol.sty \
tex-newunicodechar.sty \
tex-tcolorbox.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Write online interactive content in LaTeX"
DESCRIPTION = "The Ximera document class provides macros that support the \
creation of both PDF and online materials."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.1svn71243"

RPM_NAME = "texlive-ximera-2026.226.1.5.1svn71243-59.4.noarch.rpm"
RPM_HASH = "bb79ed28e4775215bdd805219785b6236a2ceedf8dc09ad9e380d8a53324008d604f887aa4d7e3340fe4084f5bf842d1fc6b87256d57d03682edaccf35796516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfsys-ximera.def \
tex-ximera.cfg \
tex-ximera.cls \
tex-xourse.cls \
texlive-ximera"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-cancel.sty \
tex-comment.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-epstopdf.sty \
tex-fancyvrb.sty \
tex-forloop.sty \
tex-gettitlestring.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-multido.sty \
tex-nameref.sty \
tex-pgfplots.sty \
tex-pgfsys-dvisvgm.def \
tex-tikz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-titling.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

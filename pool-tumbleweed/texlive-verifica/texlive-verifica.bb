SUMMARY = "Typeset (Italian high school) exercises"
DESCRIPTION = "This class provides various environments and commands to \
produce the typical exercises contained in a test. It is mainly \
intended for Italian high school teachers, as the style is \
probably more in line with Italian high school tests."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn75682"

RPM_NAME = "texlive-verifica-2026.226.2.0svn75682-60.2.noarch.rpm"
RPM_HASH = "2962a9ecd91e524cd86c63545863e505512f8c2cc305cd5c3860ac9318966278702785112bc74b0eca9a9e9ce6f1782c1cb4ff362d22cd303b75d65c33e9c836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verifica.cls \
texlive-verifica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-article.cls \
tex-bm.sty \
tex-cmbright.sty \
tex-enumitem.sty \
tex-eurosym.sty \
tex-extarticle.cls \
tex-gensymb.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-lineno.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-multido.sty \
tex-nccmath.sty \
tex-newunicodechar.sty \
tex-setspace.sty \
tex-tabto.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

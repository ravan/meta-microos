SUMMARY = "A LaTeX document class for lecture notes"
DESCRIPTION = "A LaTeX document class for lecture notes -- for a seminar, for \
an entire course with several lectures, or for brief talks. \
Provides an elegant template with support for sidenotes and \
detailed title section along with several other options. \
Requires compilation with LuaLaTeX and typesets with the \
kpfonts-otf package."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn74699"

RPM_NAME = "texlive-lecturenotes-2026.226.3.2svn74699-61.2.noarch.rpm"
RPM_HASH = "da13d40c7e5a3bea31062c3c528831267befb0e2d7a1e805885bbb9a5b83440c6daee1e13c2aef9d86982247ee653ee99dd36080e49e26c6178fde6eca4703fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lecturenotes.cls \
texlive-lecturenotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-amsxtra.sty \
tex-article.cls \
tex-babel.sty \
tex-babelbib.sty \
tex-booktabs.sty \
tex-cancel.sty \
tex-csquotes.sty \
tex-datetime.sty \
tex-faktor.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-kpfonts-otf.sty \
tex-mathdots.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-mparhack.sty \
tex-multirow.sty \
tex-setspace.sty \
tex-stmaryrd.sty \
tex-textcase.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-unicode-math.sty \
tex-xfrac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "LaTeX template for dissertations in Peking University"
DESCRIPTION = "The package provides a simple, clear and flexible LaTeX \
template for dissertations in Peking University."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.4svn70491"

RPM_NAME = "texlive-pkuthss-2026.226.1.9.4svn70491-58.2.noarch.rpm"
RPM_HASH = "17affd0058ca87e93f84238a9ec23dffcc607ee6e0069dc416b1018af8aa798269f2459a71f302a9eb47cf63f7049af96da36afb745152113d7ed62dbc8ba29a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pkuthss-gbk.def \
tex-pkuthss-utf8.def \
tex-pkuthss.cls \
tex-pkuthss.def \
texlive-pkuthss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-keyval.sty \
tex-mathptmx.sty \
tex-scrextend.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-tocloft.sty \
tex-ulem.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Xidian University TeX Suite"
DESCRIPTION = "XDUTS is designed to help Xidian University students use LaTeX \
typesetting efficiently. XDUTS contains a font configuration \
package that meets the school's requirements and can be applied \
to any document class. In addition, there are thesis and thesis \
proposal templates for both undergraduate and postgraduate that \
meet the school's requirements."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.2.7.2svn76924"

RPM_NAME = "texlive-xduts-2026.226.6.2.7.2svn76924-59.4.noarch.rpm"
RPM_HASH = "4170e98262f6dfb4e2d96116db98e53ff7a1e4caf240ab7af2e19c33104533b76987533d47410e2dbae63b1038d19b4e6334f2db0a3e3b5139bea21ab94b72e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xdufont.sty \
tex-xdupgthesis.cls \
tex-xduugthesis.cls \
tex-xduugtp.cls \
texlive-xduts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibentry.sty \
tex-biblatex.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-gbt7714.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tocloft.sty \
tex-unicode-math.sty \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

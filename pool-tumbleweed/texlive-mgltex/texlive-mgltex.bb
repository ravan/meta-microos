SUMMARY = "High-quality graphics from MGL scripts embedded in LaTeX documents"
DESCRIPTION = "This package allows you to create high-quality \
publication-ready graphics directly from MGL scripts embedded \
into your LaTeX document, using the MathGL library. Besides \
following the LaTeX philosophy of allowing you to concentrate \
on content rather than output (mglTeX takes care of producing \
the output), mglTeX facilitates the maintenance of your \
document, since both code for text and code for plots are \
contained in a single file. MathGL. is a fast and efficient \
library by Alexey Balakin for the creation of high-quality \
publication-ready scientific graphics. Although it defines \
interfaces for many programming languages, it also implements \
its own scripting language, called MGL, which can be used \
independently."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.2svn63255"

RPM_NAME = "texlive-mgltex-2026.226.4.2svn63255-61.2.noarch.rpm"
RPM_HASH = "b1e6c05ab8af51c8ffbaa93058cf5cfca116e7110da1dc67080f5fe4892f32a417b5e1abf3abc97993415f81c77c16f9bdeba69fda786e1f5431a1ce90b9bae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex \
tex-mgltex.sty \
texlive-mgltex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Book Template for Qian Yuan Xue Fu"
DESCRIPTION = "qyxf-book is a LaTeX document class (template) developed by \
Qian Yuan Xue Fu (QYXF), a student club of Xi'an Jiaotong \
University (XJTU). Up to now, this template has been applied to \
academic counselling material ('course helpers') written by \
members of QYXF, including Solutions to University Physics \
Notes on Computing Methods Features of the template: \
Minimalistic document style, as preferred for 'course helpers'. \
Several color schemes are offered, and it is easy to customize \
your own scheme. Simple interfaces for users to customize the \
style of preface, main part and so on. Currently the template \
is only designed for Chinese typesetting."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.0svn75712"

RPM_NAME = "texlive-qyxf-book-2026.226.3.1.0svn75712-60.4.noarch.rpm"
RPM_HASH = "5669501ebd7f316d1fa197c6fa0ca3e292843d337e49fb6fcc38c12e267faecb34d3c9a6a12b05899a2d4ea04fa8ae730189f85cd394f4e74c86bbf893effd96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qyxf-book.cls \
texlive-qyxf-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-appendix.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-natbib.sty \
tex-pifont.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

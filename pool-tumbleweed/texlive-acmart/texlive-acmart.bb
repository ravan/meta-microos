SUMMARY = "Class for typesetting publications of ACM"
DESCRIPTION = "This package provides a class for typesetting publications of \
the Association for Computing Machinery (ACM)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn76177"

RPM_NAME = "texlive-acmart-2026.226.2.16svn76177-61.2.noarch.rpm"
RPM_HASH = "ca8fcffe340b2284f694082cf4b54389c9bcd98ef1e694cd92e60dd4912d812647d88bb1e30c68ef9390f72dd96ea2cc7a51363f2ce756f595b8b67374af26a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acmart-tagged.cls \
tex-acmart.cls \
tex-acmauthoryear.bbx \
tex-acmauthoryear.cbx \
tex-acmnumeric.bbx \
tex-acmnumeric.cbx \
texlive-acmart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-amssymb.sty \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-babel.sty \
tex-balance.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cmap.sty \
tex-comment.sty \
tex-draftwatermark.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-iftex.sty \
tex-libertine.sty \
tex-manyfoot.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-numeric.cbx \
tex-pbalance.sty \
tex-refcount.sty \
tex-setspace.sty \
tex-totpages.sty \
tex-trad-plain.bbx \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
tex-xstring.sty \
tex-zi4.sty \
tex-zref-savepos.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "A document class for typesetting theses, books and articles"
DESCRIPTION = "The class can be used to typeset any kind of book (originally \
designed for use in the humanities)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.6svn73055"

RPM_NAME = "texlive-suftesi-2026.226.3.2.6svn73055-64.2.noarch.rpm"
RPM_HASH = "aa4c821efe7bfd9fb9519055e8883e3d600a68939e1235d2a3deae01f39714dd8ffbf7eb90b8fe9f08a68afdd3e419a9c3c9ebe599beee4914d31d3f6db20558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suftesi.cls \
texlive-suftesi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-appendix.sty \
tex-beramono.sty \
tex-biolinum.sty \
tex-book.cls \
tex-caption.sty \
tex-cclicenses.sty \
tex-cochineal.sty \
tex-color.sty \
tex-crop.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fixltxhyph.sty \
tex-fontenc.sty \
tex-fontsize.sty \
tex-footnpag.sty \
tex-geometry.sty \
tex-iftex.sty \
tex-inconsolata.sty \
tex-libertine.sty \
tex-libertinust1math.sty \
tex-lmodern.sty \
tex-luatex85.sty \
tex-mathalpha.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-newtxmath.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

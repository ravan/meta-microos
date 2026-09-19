SUMMARY = "A document class for IACR journal publications"
DESCRIPTION = "The iacrj document class is used to produce publications for \
three IACR journals. It is intended as an eventual replacement \
for iacrcc.cls and iacrtrans.cls. It can be used to produce \
publications for IACR Communications in Cryptology, IACR \
Transactions on Symmetric Cryptology, and IACR Transactions on \
Cryptographic Hardware and Embedded Systems. iacrj.cls is part \
of a larger set of tools for implementing a journal publishing \
workflow, and it depends on the metacapture.sty package. There \
is also a companion open source implementation of a publishing \
workflow written in Python that is used for this journal and \
provides a simplified workflow for copy editing and production. \
Further information on this workflow can be found in two \
articles that were published by the authors: Lowering the Cost \
of Diamond Open Access Journals, A LaTeX publishing workflow"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn77813"

RPM_NAME = "texlive-iacrj-2026.226.0.0.9.1svn77813-60.2.noarch.rpm"
RPM_HASH = "043f1802d31fa3a0d82f71d27f2d5b18aae545d23eb1f114ed83cdecb24138598efbd07a5c29e296d7bc8ebe9091942a588896092929147e16c3ff581de03f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iacrj.cls \
texlive-iacrj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsthm.sty \
tex-article.cls \
tex-biblatex.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-currfile.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-floatrow.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-lineno.sty \
tex-lmodern.sty \
tex-luatex85.sty \
tex-mathtools.sty \
tex-metacapture.sty \
tex-microtype.sty \
tex-sectsty.sty \
tex-tikz.sty \
tex-totpages.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
tex-xstring.sty \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

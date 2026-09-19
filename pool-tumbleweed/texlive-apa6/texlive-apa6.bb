SUMMARY = "Format documents in APA style (6th edition)"
DESCRIPTION = "The class formats documents in APA style (6th Edition). It \
provides a full set of facilities in three different output \
modes (journal-like appearance, double-spaced manuscript, \
LaTeX-like document), in contrast to the earlier apa6e, which \
only formats double-spaced manuscripts in APA style. The class \
can mask author identity for copies for use in masked peer \
review. The class is a development of the apa class (which is \
no longer maintained)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.35svn67848"

RPM_NAME = "texlive-apa6-2026.226.2.35svn67848-61.2.noarch.rpm"
RPM_HASH = "0c207465d129ea406a4f2b852843d055244666d88c6f29a8ddb4ef909e2f9356a535453d746cac05ae8f09c9daa9ff6d64f88dbca87f94ff1cc39642da88b9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-APAendfloat.cfg \
tex-apa6.cls \
texlive-apa6"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-apacite.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-biblatex.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-draftwatermark.sty \
tex-endfloat.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-ftnright.sty \
tex-geometry.sty \
tex-gettitlestring.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-mathptm.sty \
tex-pslatex.sty \
tex-substr.sty \
tex-threeparttable.sty \
tex-times.sty \
tex-txfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

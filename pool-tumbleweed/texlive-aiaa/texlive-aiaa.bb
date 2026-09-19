SUMMARY = "Typeset AIAA conference papers"
DESCRIPTION = "A bundle of LaTeX/BibTeX files and sample documents to aid \
those producing papers and journal articles according to the \
guidelines of the American Institute of Aeronautics and \
Astronautics (AIAA)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn15878"

RPM_NAME = "texlive-aiaa-2026.226.3.6svn15878-61.2.noarch.rpm"
RPM_HASH = "31b3b6d58c9b7832992ba5b227ac1f5fee0fb0ac8152a8783dd59c40f989ddb54f861fc46097a6c29cc1fe1e3289dba1aae5d447fd47df731885863556e2d790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aiaa-tc.cls \
texlive-aiaa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-overcite.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

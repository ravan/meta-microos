SUMMARY = "Annotate PDF slides"
DESCRIPTION = "This is a package for annotating PDF slides with LaTeX \
elements, and for inserting code snippets."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn68958"

RPM_NAME = "texlive-pdfannotations-2026.226.3.1svn68958-58.2.noarch.rpm"
RPM_HASH = "474950eef40f80727435e8e1328780d166cc613a8d52832b18467f74bb3a2ce5f7aad48d02df70034d91a2fe73d2d873658daa0564d17e892a46b37069b22cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfannotations.cls \
tex-pdfannotations.sty \
texlive-pdfannotations"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-expl3.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-pdfpages.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Typesetting job applications"
DESCRIPTION = "The package provides packages and classes for typesetting \
applications with titlepage, cover letter, cv and additional \
documents in just a single document. There is also a class for \
printing a table of the latest applications that can be shown \
to the German authorities. The data for these applications can \
be maintained in a simple CSV file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn61632"

RPM_NAME = "texlive-bewerbung-2026.226.1.3svn61632-61.2.noarch.rpm"
RPM_HASH = "04f1cafe1b3f454b04565f3287298f45f59c6ef0faefaace4f59cfa99543c1ec629b1ccec0950d59821d69d3cab6b1f88b194edf56a1a401161752f520283cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-argetabelle.cls \
tex-bewerbung-cv-casual.sty \
tex-bewerbung-cv-classic.sty \
tex-bewerbung-cv-oldstyle.sty \
tex-bewerbung-cv.sty \
tex-bewerbung.cls \
tex-bewerbung.sty \
texlive-bewerbung"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-datatool.sty \
tex-eurosym.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-marvosym.sty \
tex-multicol.sty \
tex-pdfpages.sty \
tex-ragged2e.sty \
tex-scrartcl.cls \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

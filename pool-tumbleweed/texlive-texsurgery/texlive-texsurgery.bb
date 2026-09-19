SUMMARY = "A LaTeX companion to the 'texsurgery' python project"
DESCRIPTION = "This LaTeX library is a companion to the texsurgery python \
project. It will make sure that 'pdflatex document.tex' will \
work, with reasonable defaults, for a document that is intended \
to work with texsurgery, and also has other uses, always in \
tandem with the texsurgery pypi package."
LICENSE = "BSD-3-Clause"

PV = "2026.227.0.0.6.0svn59885"

RPM_NAME = "texlive-texsurgery-2026.227.0.0.6.0svn59885-62.2.noarch.rpm"
RPM_HASH = "e72fd6c8fc4de0cf40fa9866cf32c95729c716ed9ba5df2d67268a58174a19c58eb183b472d289cfc2109e35eed25489e9af7b53db803e592d6e93b1a62bab84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texsurgery.sty \
texlive-texsurgery"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

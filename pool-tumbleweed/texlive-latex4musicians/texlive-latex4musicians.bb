SUMMARY = "A guide for combining LaTeX and music"
DESCRIPTION = "This guide, 'LaTeX for Musicians', explains how to create LaTeX \
documents that include several kinds of music elements: music \
symbols, song lyrics, guitar chords diagrams, lead sheets, \
music excerpts, guitar tablatures, multi-page scores."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.1.0.1svn49759"

RPM_NAME = "texlive-latex4musicians-2026.226.1.0.1svn49759-61.2.noarch.rpm"
RPM_HASH = "1f3f44910a65b4e2ced0f9f0c127b7211ced781fa27ed0b7b437126839d388b9479a694c33a526e46f6a898ec1db64f8712f804817267046739913d6cd8e9690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4musicians"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

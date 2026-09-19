SUMMARY = "Prepare papers for the journal Nature"
DESCRIPTION = "Nature does not accept papers in LaTeX, but it does accept PDF. \
This class and BibTeX style provide what seems to be necessary \
to produce papers in a format acceptable to the publisher."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21819"

RPM_NAME = "texlive-nature-2026.226.1.0svn21819-61.2.noarch.rpm"
RPM_HASH = "c0460222a7fb4a8b8777f34060e0d52fa3fd7d084c52d96fc1f604a8bce0bbbe679fd29b3b17fb90b748fcda34d1dce18c4a4880030b1d41c532c786762af958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nature.cls \
texlive-nature"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-cite.sty \
tex-fullpage.sty \
tex-ifthen.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

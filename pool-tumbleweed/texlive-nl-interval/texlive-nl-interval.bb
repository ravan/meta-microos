SUMMARY = "Represent intervals on the number line"
DESCRIPTION = "This package provides macros to simplify the process of \
representing intervals on the number line. It depends on \
tkz-fct, ifthen, and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn58328"

RPM_NAME = "texlive-nl-interval-2026.226.1.0svn58328-61.2.noarch.rpm"
RPM_HASH = "ec7245e6e4f391fff2625e750c5de01e9a62667acccaac3a4c3cb1169373a72a658b3c686179b7a71fc79a16fbd80a5d07b6943088102504f1e7d894f6746d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nl-interval.sty \
texlive-nl-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tkz-fct.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

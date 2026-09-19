SUMMARY = "A BibTeX replacement for users of BibLaTeX"
DESCRIPTION = "Biber is a BibTeX replacement for users of BibLaTeX. Biber \
supports full UTF-8, can (re)-encode input and output, supports \
highly configurable sorting, dynamic bibliography sets and many \
other features. The CTAN distribution offers a compressed tar \
archive of the sources, etc., together with 'binary' \
distributions for a variety of platforms. Note: on SourceForge \
biber is formally named 'biblatex-biber', to distinguish it \
from an earlier (now apparently moribund) project called \
'biber'."
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2026.226.2.21svn75738"

RPM_NAME = "texlive-biber-2026.226.2.21svn75738-61.2.noarch.rpm"
RPM_HASH = "9bfbb266baf0e31dcf95d63165771ca9a42cf68d5da1dc744ac6ac3a21b98bacbd06d0c2987de3b1263c69563e1df6a6fefea9712b59fc7a766fd8534ad533e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-biber-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

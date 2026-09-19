SUMMARY = "OpenType Unicode text and maths fonts"
DESCRIPTION = "The Scientific and Technical Information eXchange (STIX) fonts \
are intended to satisfy the demanding needs of authors, \
publishers, printers, and others working in the scientific, \
medical, and technical fields. They combine a comprehensive \
Unicode-based collection of mathematical symbols and alphabets \
with a set of text faces suitable for professional publishing. \
The fonts are available royalty-free under the SIL Open Font \
License."
LICENSE = "OFL-1.1"

PV = "2026.226.2.12svn58735"

RPM_NAME = "texlive-stix2-otf-2026.226.2.12svn58735-64.2.noarch.rpm"
RPM_HASH = "173b426ea3c391a758469df4b36bdac1d3119ba653fd5b0e1846ae84c39f27c196758e609cbd392cc6704928e42c404a703c4331509922b290a73ccb3d50b356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-otf"

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
texlive-scripts-bin \
texlive-stix2-otf-fonts"

inherit rpm

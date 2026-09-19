SUMMARY = "Typeset parallel texts"
DESCRIPTION = "Provides a parallel environment which allows two potentially \
different texts to be typeset in two columns, while maintaining \
alignment. The two columns may be on the same page, or on \
facing pages. This arrangement of text is commonly used when \
typesetting translations, but it can have value when comparing \
any two texts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-parallel-2026.226.svn77682-58.2.noarch.rpm"
RPM_HASH = "f42a864c85509bb08fcba58debd2b812b87ef0b56fe9bdb5e4a5ee92858add0ebfa7af93d19c57258224305646c90556c3f31318aee3f9cd1f01fcc835d2737d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parallel.sty \
texlive-parallel"

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

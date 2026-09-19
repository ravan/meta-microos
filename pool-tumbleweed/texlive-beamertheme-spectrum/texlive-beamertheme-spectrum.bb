SUMMARY = "A clean beamer/ltx-talk theme with a big title graphic"
DESCRIPTION = "This package provides a clean beamer/ltx-talk theme with a big \
title graphic. The theme is deliberately fairly clean and \
simple in order to not distract too much from the content. The \
one vanity are the big graphics on the title, section, and \
standout slides."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn77770"

RPM_NAME = "texlive-beamertheme-spectrum-2026.226.0.0.6svn77770-61.2.noarch.rpm"
RPM_HASH = "a69882d948abd8b56aa1ca7a989d4b9c283032de8109850c10b75f662aa1277e43823834b786e72e6194ff92ecc2993e52f0a67a8bbb81f39ef8d18406ac2913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemespectrum.sty \
tex-talkthemespectrum.sty \
texlive-beamertheme-spectrum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-beamer \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm

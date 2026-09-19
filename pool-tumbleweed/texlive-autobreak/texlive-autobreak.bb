SUMMARY = "Simple line breaking of long formulae"
DESCRIPTION = "This package implements a simple mechanism of line/page \
breaking within the align environment of the amsmath package; \
new line characters are considered as possible candidates for \
the breaks and the package tries to put breaks at adequate \
places. It is suitable for computer-generated long formulae \
with many terms."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-autobreak-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "f28c06753052a708f98e24fae59e085a9c1e655b912313cbe66489894884ea247ff0bf85514d448d910898bfd168908c3b1d620618c911b4f803180f20629f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autobreak.sty \
texlive-autobreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-catchfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

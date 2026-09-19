SUMMARY = "Typeset natural deduction proofs"
DESCRIPTION = "The package provides commands to typeset proofs in the style \
used by Jaskowski, or that of Kalish and Montague."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn32693"

RPM_NAME = "texlive-natded-2026.226.0.0.1svn32693-61.2.noarch.rpm"
RPM_HASH = "816bcfcc15f2e45e16c7b5ebb8f0a4bdc254674bc50722590ff61fef19ec8316aaeb928b705c2803fe8f64d3359db2055a2595b278595802e9761552f8050699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-natded.sty \
texlive-natded"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

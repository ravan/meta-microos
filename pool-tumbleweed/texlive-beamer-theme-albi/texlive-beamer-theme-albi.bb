SUMMARY = "The Albi beamer theme"
DESCRIPTION = "The Albi beamer theme features a colorful triangular design."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn74899"

RPM_NAME = "texlive-beamer-theme-albi-2026.226.1.5svn74899-61.2.noarch.rpm"
RPM_HASH = "7f2fa2547b7155bd49529931b2ebcc0ae1b2a8ec2f9de873f48c3bc6c5fcf36be8f03a791e59a5c22a07163a67da5d828b9cea6bd61106441e562d6e1694228c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeAlbi.sty \
texlive-beamer-theme-albi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

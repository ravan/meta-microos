SUMMARY = "Babel module to support Serbian Cyrillic"
DESCRIPTION = "The package provides support for Serbian documents written in \
Cyrillic, in babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2asvn64588"

RPM_NAME = "texlive-babel-serbianc-2026.226.3.2asvn64588-60.2.noarch.rpm"
RPM_HASH = "8667e8ed04f2552130541adcd714f1daf8e5b9003be42a24a1b68efff952a247b53a274d24ad072d1926f91e5b4467450b9cecf750f41641aff4a21fee589979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbianc.ldf \
texlive-babel-serbianc"

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

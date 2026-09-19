SUMMARY = "Babel support for Belarusian"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Belarusian."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn49022"

RPM_NAME = "texlive-babel-belarusian-2026.226.1.5svn49022-60.2.noarch.rpm"
RPM_HASH = "2550dd9faa101376f7b3cb1cf799732dae48bb361270261a3b71cf9ff01fa7e17261084040fc916971f0a135669391c4be8fd17d8de2d4006063eaa71ec42f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-belarusian.ldf \
texlive-babel-belarusian"

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

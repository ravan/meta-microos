SUMMARY = "Access to the 'frimurer' cipher for use with LaTeX"
DESCRIPTION = "This package provides access to the 'frimurer' cipher for use \
with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn56704"

RPM_NAME = "texlive-frimurer-2026.226.1svn56704-60.2.noarch.rpm"
RPM_HASH = "8ba64c74b64c5cfb21be1fb438cd1b662454900cceb3b5c31e0f3cb2e0dfb3973692d15a4333f161f2fdfe882e0ad9ebe781ddb601cc80c2a69f09b23d49e4d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frimurer.enc \
tex-frimurer.sty \
tex-frimurer.tfm \
texlive-frimurer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-frimurer-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

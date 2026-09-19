SUMMARY = "Absolute placement with coffins"
DESCRIPTION = "This package lets you place contents at an absolute position, \
anchored at some specified part of the contents, similar to how \
TikZ nodes work, though without using the two-pass strategy of \
TikZ. It also avoids messing with the order of beamer overlays, \
which is what happens when one uses the textpos package with \
the overlay option. The solution used is quite straightforward, \
combining coffins (using l3coffins) with the placement \
mechanisms of atbegshi."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-abspos-2026.226.0.0.1svn76924-61.2.noarch.rpm"
RPM_HASH = "073dc0fc0e27ded2c38b95d4ddf5accc362e6848629617d57e10f999cae2904968c84663ea60ca792d7800ad7e8892be5fd4225f21dc1adaf857250c66292752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abspos.sty \
texlive-abspos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

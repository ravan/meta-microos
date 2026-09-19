SUMMARY = "LaTeX layout inspired by harvmac"
DESCRIPTION = "The package aims to streamline the work of typesetting, and to \
provide the look and feel of harvmac for readers."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn45081"

RPM_NAME = "texlive-chet-2026.226.2.2svn45081-60.2.noarch.rpm"
RPM_HASH = "81713ef13662eecbbb15355f1698329c5839b5bb9e0bfa20ce780309e1d9891a4fa967ccb4b2c7e3ae9cec9426d6d82b58cdc16cd25dcdf8bd9f260b65f80526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chet.sty \
texlive-chet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-caption.sty \
tex-cite.sty \
tex-collref.sty \
tex-color.sty \
tex-datetime.sty \
tex-filecontents.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-manyfoot.sty \
tex-microtype.sty \
tex-tocloft.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

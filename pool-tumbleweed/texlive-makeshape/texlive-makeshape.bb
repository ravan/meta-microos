SUMMARY = "Declare new PGF shapes"
DESCRIPTION = "The package simplifies production of custom shapes with correct \
anchor borders, in PGF/TikZ; the only requirement is a PGF path \
describing the anchor border. The package also provides macros \
that help with the management of shape parameters, and the \
definition of anchor points."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn28973"

RPM_NAME = "texlive-makeshape-2026.226.2.1svn28973-59.2.noarch.rpm"
RPM_HASH = "a19479a344109e04329aa98573bab72ba28c2b5afa4b4efa1a861f692d705fb443b68e5272c5b213dd4a9e4ffa35f1110eabce4602cc21bafce1493a8495cfe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeshape.sty \
texlive-makeshape"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

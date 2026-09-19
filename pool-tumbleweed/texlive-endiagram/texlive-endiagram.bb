SUMMARY = "Easy creation of potential energy curve diagrams"
DESCRIPTION = "The package provides the facility of drawing potential energy \
curve diagrams with just a few simple commands. The package \
cannot (yet) be considered stable."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1dsvn76924"

RPM_NAME = "texlive-endiagram-2026.226.0.0.1dsvn76924-61.4.noarch.rpm"
RPM_HASH = "164b7622ecd5f084b8e4dc1e99baa0fcaa6a65d2d9d3b625a314f17db4bb88820368ee1071bbd76e6b1c3b66a422aabbd3eb4dcb6c2c02106b1d3cba36a2bc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endiagram.sty \
texlive-endiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

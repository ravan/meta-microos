SUMMARY = "Macros and fonts for creating Feynman (and other) diagrams"
DESCRIPTION = "The feynmf package provides an interface to Metafont (inspired \
by the facilities of mfpic) to use simple structure \
specifications to produce relatively complex diagrams. (The \
feynmp package, also part of this bundle, uses MetaPost in the \
same way.) While the package was designed for Feynman diagrams, \
it could in principle be used for diagrams in graph and similar \
theories, where the structure is semi-algorithmically \
determined."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.08svn77682"

RPM_NAME = "texlive-feynmf-2026.226.1.08svn77682-59.2.noarch.rpm"
RPM_HASH = "a8b322ca0bbc641f3acee37b1bfa1a086294fbda3542f50c7c00d3052234f6942e2d3d1110980524fdc1e61c6ec91b536528ef823326e18afe5f76dca393c9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feynmf.sty \
tex-feynmp.sty \
texlive-feynmf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

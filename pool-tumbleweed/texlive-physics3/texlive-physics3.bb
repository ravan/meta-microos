SUMMARY = "Modularized package for easy setting of physical formulas"
DESCRIPTION = "This package defines commands for typesetting math formulae \
faster and more simply. physics3 is a modularized package, that \
currently provides modules for: Automatic braces Dirac bra-ket \
notation Easy way to typeset diagonal matrices and matrices \
with similar entries Double cross and double dot (binary) \
operators for tensors"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn77682"

RPM_NAME = "texlive-physics3-2026.226.0.0.2asvn77682-58.2.noarch.rpm"
RPM_HASH = "10c895e76ee75431b85ac77a080b21916749a125b791f32508ea40d18364d29206eaf6728ca06600db623534d319f7c59c2bff89e0d23ddf40b4c2bd64c8b025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phx-ab.braket.sty \
tex-phx-ab.legacy.sty \
tex-phx-ab.sty \
tex-phx-bm-um.sty \
tex-phx-braket.sty \
tex-phx-diagmat.sty \
tex-phx-doubleprod.sty \
tex-phx-operator.sty \
tex-phx-qtext.legacy.sty \
tex-phx-xmat.sty \
tex-physics3.sty \
texlive-physics3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-etoolbox.sty \
tex-fixdif.sty \
tex-keyval.sty \
tex-mathtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

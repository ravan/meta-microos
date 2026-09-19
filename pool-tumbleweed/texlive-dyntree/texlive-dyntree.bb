SUMMARY = "Construct Dynkin tree diagrams"
DESCRIPTION = "The package is intended for users needing to typeset a Dynkin \
Tree Diagram--a group theoretical construct consisting of \
cartan coefficients in boxes connected by a series of lines. \
Such a diagram is a tool for working out the states and their \
weights in terms of the fundamental weights and the simple \
roots. The package makes use of the author's coollist package."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.0svn67016"

RPM_NAME = "texlive-dyntree-2026.226.1.0svn67016-61.4.noarch.rpm"
RPM_HASH = "f6908c34686e9b73d916d2a413994e9e1a7494f7f77cf4023dfa4db39a59340779726f34d545ccfcce9e18740f6363f9544750bcd5c66c3adf885ed9f283c151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dyntree.sty \
texlive-dyntree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-coollist.sty \
tex-eepic.sty \
tex-epic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

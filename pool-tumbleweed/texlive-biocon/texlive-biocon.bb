SUMMARY = "Typesetting biological species names"
DESCRIPTION = "The biocon--biological conventions--package aids the \
typesetting of some biological conventions. At the moment, it \
makes a good job of typesetting species names (and ranks below \
the species level). A distinction is made between the Plant, \
Fungi, Animalia and Bacteria kingdoms. There are default \
settings for the way species names are typeset, but they can be \
customized. Different default styles are used in different \
situations."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-biocon-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "a33128d2e92c346e0496470a770adce9975f2289a42712a393d8bc90d7431c48665ede88ad74d125207ea501e780f4a9a0d44c5384bf26e0ff00f41cab69084e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biocon-old.sty \
tex-biocon.sty \
texlive-biocon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

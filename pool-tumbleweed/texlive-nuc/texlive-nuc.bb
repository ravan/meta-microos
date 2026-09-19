SUMMARY = "Notation for nuclear isotopes"
DESCRIPTION = "A simple package providing nuclear sub- and superscripts as \
commonly used in radiochemistry, radiation science, and nuclear \
physics and engineering applications. Isotopes which have Z \
with more digits than A require special spacing to appear \
properly; this spacing is supported in the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn22256"

RPM_NAME = "texlive-nuc-2026.226.0.0.1svn22256-61.2.noarch.rpm"
RPM_HASH = "0233d136be6061e32345a414c46c82ce28010534eb5d792307900f4bb22d0af5064484655238fa23b30e89f116cce3b097dc7cdfd5dfa6fee6b088de21f3af4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nuc.sty \
texlive-nuc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

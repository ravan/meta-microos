SUMMARY = "Library for genealogytree aiming at large trees"
DESCRIPTION = "The main goal of this package is to offer additional database \
fields and formats for the genealogytree package, particularly \
for typesetting large trees. The package depends on \
genealogytree and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-2026.226.1.2bsvn49062-60.4.noarch.rpm"
RPM_HASH = "fdb3be3b4417ea36bd56ebc1eda7178f1950f700c8cb11442329ec5c9356c9c752a9f953f908e9c9778ae6a1e54fe099c2b801f2d9fa7136e273db198d3c3c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtrlib.largetrees.code.tex \
tex-gtrlib.largetrees.sty \
texlive-gtrlib-largetrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-genealogytree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Contributed beamer theme"
DESCRIPTION = "A theme for beamer presentations."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn21977"

RPM_NAME = "texlive-beamerthemejltree-2026.226.1.1svn21977-61.2.noarch.rpm"
RPM_HASH = "96b2e165d6e87784dd073392dc92870d7683d23e53761834324593c20150d01720a03af5fbf54f8bff7e5a0b535d6b6dd75a6f976a3390e6b34df132ecda4762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeJLTree.sty \
texlive-beamerthemejltree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

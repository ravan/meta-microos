SUMMARY = "LK Proof figure macros"
DESCRIPTION = "The package defines a pair of commands \\infer and \\deduce, that \
are used in constructing LK proof diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1svn20021"

RPM_NAME = "texlive-lkproof-2026.226.3.1svn20021-61.2.noarch.rpm"
RPM_HASH = "2f9454e10ae430f8ab2f940e8c719718eb38f929c2eb39716343e1595eab4650d96c0fa44552c1cc21112adb9dde24589a47d9823cd153c01c1974cf086be6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proof.sty \
texlive-lkproof"

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

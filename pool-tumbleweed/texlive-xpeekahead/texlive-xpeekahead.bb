SUMMARY = "A simple way for peeking ahead after commands and environments"
DESCRIPTION = "This package offers a few commands aiming at peeking ahead \
after environments and commands in simple cases."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77050"

RPM_NAME = "texlive-xpeekahead-2026.226.1.3asvn77050-59.4.noarch.rpm"
RPM_HASH = "9bfb06da812112c5a65c6a11cc910f594c2da9e2ded2f34459e095952dcbcefd0e0858b1a3e9f3bbad0c94d1f071e86b17bdc98fd81c25235a221d4914214809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpeekahead.sty \
texlive-xpeekahead"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

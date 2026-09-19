SUMMARY = "Draw Lewis structures"
DESCRIPTION = "The package provides rudimentary support for drawing Lewis \
Structures. Support is limited to elements that support the \
octet rule."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-lewis-2026.226.0.0.1svn15878-61.2.noarch.rpm"
RPM_HASH = "23d8b06d9b9e587d00587705e0a513081ef64315bbc2d2ace51f13aa4457ebb595acf486f5e3e42dfe4de2f463d6d8d7a45376497345c2670ad2b2b3a77da520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lewis.sty \
texlive-lewis"

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

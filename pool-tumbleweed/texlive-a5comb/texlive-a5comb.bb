SUMMARY = "Support for a5 paper sizes"
DESCRIPTION = "Superseded by geometry."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4svn76924"

RPM_NAME = "texlive-a5comb-2026.226.4svn76924-61.2.noarch.rpm"
RPM_HASH = "08d514d55a6ac217dad5df50a5050986071b0d4deea0367c9c7a9cbde3b1056e7121bf252144236af96b952794b5cac4a78ad63b6127961bce5fa27a07c5697f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a5comb.sty \
texlive-a5comb"

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

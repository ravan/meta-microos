SUMMARY = "Color separation"
DESCRIPTION = "Support for colour separation when using dvips."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn13293"

RPM_NAME = "texlive-colorsep-2026.226.svn13293-60.2.noarch.rpm"
RPM_HASH = "4e6af5d9294d4b559e662b6192619cc082111c3d18a6785b6f840bd2c00528925abbd3329b9f3c649c0f3dea5ddfa5afcd69eecd7c8a075b793eeb69b3b0feba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorsep"

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

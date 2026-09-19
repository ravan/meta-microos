SUMMARY = "Wide range of design sizes for CM fonts"
DESCRIPTION = "Extensions, originally to the CM fonts, providing a \
parameterization scheme to build Metafont fonts at true design \
sizes, for a large range of sizes. The scheme has now been \
extended to a range of other fonts, including the AMS fonts, \
bbm, bbold, rsfs and wasy fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.4svn13293"

RPM_NAME = "texlive-sauter-2026.226.2.4svn13293-60.2.noarch.rpm"
RPM_HASH = "c7a63fd18c3ac33db663cdd25d0dd4e29906a9e8e8cc344f74573037e6d96874a2b7fcd6b7a1eea5646f75bc389191dd81c9a2e9d79ce088c3dde0107e4f4119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauter"

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

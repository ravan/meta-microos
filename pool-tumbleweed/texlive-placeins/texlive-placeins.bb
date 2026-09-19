SUMMARY = "Control float placement"
DESCRIPTION = "Defines a \\FloatBarrier command, beyond which floats may not \
pass; useful, for example, to ensure all floats for a section \
appear before the next \\section command."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-placeins-2026.226.2.2svn77682-58.2.noarch.rpm"
RPM_HASH = "4945b5b6cc8ac24b7a984216f23948fdac7e6f9c57bad9c1714d4a4b9319139334c8c968a5d71dca91c6aa13ef899254a05a22c77106475b923f7dabfb3b04a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeins.sty \
texlive-placeins"

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

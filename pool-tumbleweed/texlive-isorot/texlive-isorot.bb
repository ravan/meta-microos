SUMMARY = "Rotation of document elements"
DESCRIPTION = "The package is for rotation of document elements. It is a \
combination of the lscape package and an extension of the \
rotating package. The package is designed for use with the iso \
class but may be used with any normal class."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-isorot-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "b7a151fddf272e6eacff57069d09308bcfa3056c71279562d89894d2bdd9263de54b06f25d5ca81f2996266510457cda303229277b11d6567db65c1046356f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isorot.sty \
texlive-isorot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-lscape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Generate Beamer slideshows with song lyrics"
DESCRIPTION = "This package, together with the Beamer class, is used to \
generate slideshows with song lyrics. This is typically used in \
religious services in churches equipped with a projector, for \
which this package has been written, but it can be useful for \
any type of singing assembly. It provides environments to \
describe a song in a natural way, and formatting it into slides \
with overlays. The package comes with an additional Python \
script that can be used to convert plain-text song lyrics to \
the expected LaTeX markup."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2.0svn76924"

RPM_NAME = "texlive-songproj-2026.226.1.2.0svn76924-64.2.noarch.rpm"
RPM_HASH = "65a519d040ed0084c8da45075676b8969b949dfdc6cb8a0ed0d35e521a256cd3e5ae971d6056dd520fc12e5393a39c88143847a8aa6a7b751f7976cedbaf78a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-songproj.sty \
texlive-songproj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-verse.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

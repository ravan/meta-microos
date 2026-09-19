SUMMARY = "Metafont source and macros for the Baha'i nine-pointed star"
DESCRIPTION = "This package provides a Metafont-based implementation of the \
Baha'i nine-pointed star [?] for usage in LaTeX documents, \
while still providing proper copy behavior with the official \
Unicode codepoints and supporting the usage of the character \
directly."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76351"

RPM_NAME = "texlive-bahaistar-2026.226.0.0.1svn76351-60.2.noarch.rpm"
RPM_HASH = "d9f06f614ba11e470271b9ebf4cbdaacb6a6c58d0d1ff843009ef76a556fb29685bc1ecbb37d81d41b1fd5f2318c9558d48928db37e9161306f4216455910223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahaistar.sty \
tex-bahaistar.tfm \
texlive-bahaistar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-newunicodechar.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

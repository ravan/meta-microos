SUMMARY = "A LaTeX package for testing fonts"
DESCRIPTION = "This package provides a simple way for font designers and users \
to test their fonts in different sizes without much input."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0csvn76924"

RPM_NAME = "texlive-pangram-2026.226.0.0.0csvn76924-58.2.noarch.rpm"
RPM_HASH = "cfd606033aec1d5c77eae1b6092643f9b2f2f52007838855742c3b0009bd36d75ec1b6802e246bbc36759cab48676fe5ffcdbe036ab41f08f964b593b44a226e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pangram.sty \
texlive-pangram"

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

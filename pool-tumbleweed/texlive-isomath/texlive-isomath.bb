SUMMARY = "Mathematics style for science and technology"
DESCRIPTION = "The package provides tools for a mathematical style that \
conforms to the International Standard ISO 80000-2 and is \
common in science and technology. It changes the default shape \
of capital Greek letters to italic, sets up bold italic and \
sans-serif bold italic math alphabets with Latin and Greek \
characters, and defines macros for markup of vector, matrix and \
tensor symbols."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.1svn27654"

RPM_NAME = "texlive-isomath-2026.226.0.0.6.1svn27654-63.2.noarch.rpm"
RPM_HASH = "7150b5d28cae5c861979eb018e58e44de4f3ea4d0fc7e3a49762ae4c9d906fad7510daafcaf77698cba39d3ff8788705ba605404861b0958fa59317a11aa10eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isomath.sty \
texlive-isomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixmath.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

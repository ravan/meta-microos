SUMMARY = "Support for use of \\parshape in LaTeX"
DESCRIPTION = "The package provides macros and environments that relieve the \
programmer of some of the difficulties of using \\parshape in \
LaTeX macros. It does not actually calculate shapes in the way \
that the shapepar package does."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "9a58db09cc9ab3e069d0dccb1679f1478e12c1cb5d884bded440c174d372c441a411806fa693cbc8c718ab173f70f058b91388f9ed594c7da3cca89e5e195cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rjlpshap.sty \
texlive-rjlparshap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjob.sty \
tex-forloop.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

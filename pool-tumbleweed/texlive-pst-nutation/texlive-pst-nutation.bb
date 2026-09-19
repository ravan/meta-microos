SUMMARY = "Rotation, precession, nutation of the earth"
DESCRIPTION = "This package illustrates the concepts of rotation, precession, \
and nutation of the earth. pst-nutation defines the command \
\\psNutation[options] to simulate the behaviour of the earth."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77145"

RPM_NAME = "texlive-pst-nutation-2026.226.0.0.01svn77145-59.2.noarch.rpm"
RPM_HASH = "5fcbd7b9affb108a6a397d758549ac95be5d0ff403657927ba70beddac39453e43bbdfa0c78b1bfb22a81584556b2cf6d85839e086a052f6fce0da3c3636e725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-nutation.sty \
tex-pst-nutation.tex \
texlive-pst-nutation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

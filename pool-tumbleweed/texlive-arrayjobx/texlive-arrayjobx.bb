SUMMARY = "Array data structures for (La)TeX"
DESCRIPTION = "This package provides array data structures in (La)TeX, in the \
meaning of the classical procedural programming languages like \
Fortran, Ada or C, and macros to manipulate them. Arrays can be \
mono or bi-dimensional. This is useful for applications which \
require high level programming techniques, like algorithmic \
graphics programmed in the TeX language. The package supersedes \
the arrayjob package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn18125"

RPM_NAME = "texlive-arrayjobx-2026.226.1.04svn18125-60.2.noarch.rpm"
RPM_HASH = "7de3cb61ca242878f40369ae989e2e9dc41e1c73fb71a5d2d07d0ca7bb3a8f29f484f195fa109808bf09e30e469cf80495fec171f34171796b3c1c26e253e39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arrayjob.sty \
tex-arrayjobx.sty \
texlive-arrayjobx"

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

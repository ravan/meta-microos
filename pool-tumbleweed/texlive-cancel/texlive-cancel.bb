SUMMARY = "Place lines through maths formulae"
DESCRIPTION = "A package to draw diagonal lines ('cancelling' a term) and \
arrows with limits (cancelling a term 'to a value') through \
parts of maths formulae."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-cancel-2026.226.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "62d3f7d49f05697f3725850791da493dda8a6c4820734fac31afe16668ae50516493f50e80ebfea330b1709e0bb50ee584b00e6ce5fc54ab2cdd08a45064333e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cancel.sty \
texlive-cancel"

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

SUMMARY = "Atomic and molecular orbitals using TikZ"
DESCRIPTION = "Atomic s, p and d orbitals may be drawn, as well as molecular \
orbital diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn36439"

RPM_NAME = "texlive-tikzorbital-2026.226.svn36439-59.2.noarch.rpm"
RPM_HASH = "679022fdfa62370d45a1fc50d804de139a07b41b894e99ddcef0464afa7b92fd4637b38d0fece1818de8b7241b9193ec3a15b48fe5bd975601d34425b0718bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzorbital.sty \
texlive-tikzorbital"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

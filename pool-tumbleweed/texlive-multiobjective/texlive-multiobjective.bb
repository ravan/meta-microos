SUMMARY = "Symbols for multiobjective optimisation etcetera"
DESCRIPTION = "The package provides a series of operators commonly used in \
papers related to multiobjective optimisation, multiobjective \
evolutionary algorithms, multicriteria decision making and \
similar fields."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-multiobjective-2026.226.1.0svn75878-61.2.noarch.rpm"
RPM_HASH = "88156f65d2768885c031db337a866ec7f31129a90b0c558fecb81242a0f5de288246605b9250ce0bd6cbee12196d982d2598b04bd6a43b8058e8d22fa386a5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiobjective.sty \
texlive-multiobjective"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

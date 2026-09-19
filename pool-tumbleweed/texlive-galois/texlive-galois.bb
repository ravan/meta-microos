SUMMARY = "Typeset Galois connections"
DESCRIPTION = "The package deals with connections in two-dimensional style, \
optionally in colour."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-galois-2026.226.1.5svn15878-60.2.noarch.rpm"
RPM_HASH = "0c7cc465a13b1ec4c84caa507570c2ecfcbf39138a6c9b24b73b13934fddbb40afe6607320d85c873e922d7039709380c52f98faa9d764be38033036671485ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-galois.sty \
texlive-galois"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

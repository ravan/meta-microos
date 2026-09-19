SUMMARY = "Publication quality tables in LaTeX"
DESCRIPTION = "The package enhances the quality of tables in LaTeX, providing \
extra commands as well as behind-the-scenes optimisation. \
Guidelines are given as to what constitutes a good table in \
this context. From version 1.61, the package offers longtable \
compatibility."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.61803398svn77682"

RPM_NAME = "texlive-booktabs-2026.226.1.61803398svn77682-59.2.noarch.rpm"
RPM_HASH = "26ce12cebc7ff4d1d819ef43b93d85a4e0753b6072493bcd849aa31c60eed9b08b3db23bb30c24698e0bda35f3013f24154afc97c0d81644535f767d078dad6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-booktabs.sty \
texlive-booktabs"

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

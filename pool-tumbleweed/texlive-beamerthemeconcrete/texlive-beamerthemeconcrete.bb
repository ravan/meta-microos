SUMMARY = "A collection of flat beamer themes"
DESCRIPTION = "The concrete bundle provides a collection of flat beamer themes \
for making LaTeX presentations, especially for academic and \
scientific presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024bsvn69528"

RPM_NAME = "texlive-beamerthemeconcrete-2026.226.2024bsvn69528-61.2.noarch.rpm"
RPM_HASH = "7f9a047350ad81dc8c48a9545309d64f8cf7363a72c02cb1f3e6d9029eca713b3a83e2c9fb4210be65054ef324419fedcaa248255284121c515325f8807b8b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemecbernoulli.sty \
tex-beamerthemecdirichlet.sty \
tex-beamerthemecfermat.sty \
tex-beamerthemecgauss.sty \
tex-beamerthemeclagrange.sty \
tex-beamerthemecmobius.sty \
tex-beamerthemecriemann.sty \
texlive-beamerthemeconcrete"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-fontawesome.sty \
tex-manfnt.sty \
tex-multicol.sty \
tex-tikz.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

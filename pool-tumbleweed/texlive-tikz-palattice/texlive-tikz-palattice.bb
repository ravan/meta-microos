SUMMARY = "Draw particle accelerator lattices with TikZ"
DESCRIPTION = "This package allows for drawing a map of a particle accelerator \
just by giving a list of elements -- similar to lattice files \
for simulation software. The package includes 12 common element \
types like dipoles, quadrupoles, cavities, or screens, as well \
as automatic labels with element names, a legend, a rule, and \
an environment to fade out parts of the accelerator. The \
coordinate of any element can be saved and used for custom TikZ \
drawings or annotations. Thereby, lattices can be connected to \
draw injection/extraction or even a complete accelerator \
facility."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn43442"

RPM_NAME = "texlive-tikz-palattice-2026.226.2.3svn43442-59.2.noarch.rpm"
RPM_HASH = "1acd8d1ad8edf764485d202ded5fc952de80878e0ac4b9a6ca71a621e67444cff2d936a560e9a9e491c5df24dafa46d18c89df618537886d68258925eff152bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-palattice.sty \
texlive-tikz-palattice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-iflang.sty \
tex-ifthen.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

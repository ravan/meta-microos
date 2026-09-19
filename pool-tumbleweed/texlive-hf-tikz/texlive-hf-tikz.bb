SUMMARY = "A simple way to highlight formulas and formula parts"
DESCRIPTION = "The package provides a way to highlight formulas and formula \
parts in both documents and presentations, us TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-2026.226.0.0.3asvn34733-60.4.noarch.rpm"
RPM_HASH = "cb9fe169368984b3f9df0b1c3418189fefd5ed36a20aadf2f9cfdaa2e15a6c64c3073acfc7e1afd42dc7db890cdd0a6efd7d0d63cbd3837194c53e6df5321d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hf-tikz.sty \
texlive-hf-tikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Create images of the soroban using TikZ/PGF"
DESCRIPTION = "The package makes it possible to create pictures of the soroban \
(Japanese abacus) using PGF/TikZ"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32269"

RPM_NAME = "texlive-pgf-soroban-2026.226.1.1svn32269-58.2.noarch.rpm"
RPM_HASH = "b2668a4af5c1b07a53222052889cb69fcc14fafb0f818c16e6fd63c162fd70bc78c39b07f98157a88d92ec0283cc7c3cbd76d7c1ca877cfec18efbbe80875136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-soroban.sty \
texlive-pgf-soroban"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

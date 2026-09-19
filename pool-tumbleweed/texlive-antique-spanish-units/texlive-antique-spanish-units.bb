SUMMARY = "A short document about antique spanish units"
DESCRIPTION = "This short document is about antique spanish units used in \
Spain and their colonies between the sixteenth and nineteenth \
centuries. The next step will be to develop a LaTeX package \
similar to siunitx. The document could be interesting for \
historians, economists, metrologists and others, as a reference \
and detailed compendium about this old system of units."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn69568"

RPM_NAME = "texlive-antique-spanish-units-2026.226.1.6svn69568-61.2.noarch.rpm"
RPM_HASH = "2fd3b4be3e207b3ac508e5a37a9ba867a2a28c16ba86cc16655853f035ed4447a8f40e92f75dfb05ffc0c9e5aa3b1dcecd7e6ccdc9a5f87dc20d3c366c7e2066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antique-spanish-units"

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

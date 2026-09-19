SUMMARY = "Horizontally and vertically split elliptical nodes"
DESCRIPTION = "This package provides horizontally and vertically split \
elliptical (pairs of) nodes in TikZ. The package name derives \
from the fact that split ellipses of this type are used to \
represent Single-World Intervention Graph (SWIG) models which \
are used in counterfactual causal inference."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59889"

RPM_NAME = "texlive-tikz-swigs-2026.226.svn59889-59.2.noarch.rpm"
RPM_HASH = "42cfb9a110d8f3858c2e6c2490d664442edf7854dc1a66c0754bd395a0fc10e4a675ce48c3ee6c1c2b76de9b5cbd09eaaf328dff3aabfb35e9c0aa3a0edf63a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryswigs.code.tex \
texlive-tikz-swigs"

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

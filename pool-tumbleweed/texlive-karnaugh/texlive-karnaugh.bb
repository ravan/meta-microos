SUMMARY = "Typeset Karnaugh-Veitch-maps"
DESCRIPTION = "The package provides macros for typesetting Karnaugh-Maps and \
Veitch-Charts in a simple and user-friendly way. Karnaugh-Maps \
and Veitch-Charts are used to display and simplify logic \
functions 'manually'. These macros can typeset Karnaugh-Maps \
and Veitch-Charts with up to ten variables (=1024 entries)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21338"

RPM_NAME = "texlive-karnaugh-2026.226.svn21338-63.2.noarch.rpm"
RPM_HASH = "ac7132a3e6efaad8e81943e369f7d5c33f5ebed398ae294a2014e1bb3daf79a96695f7298bab6e57c373f63684423c3df393c39cfdb49cde7842b0250cd3a957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvmacros.tex \
texlive-karnaugh"

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

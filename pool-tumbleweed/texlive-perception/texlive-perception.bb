SUMMARY = "BibTeX style for the journal Perception"
DESCRIPTION = "A product of custom-bib, provided simply to save others' time."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-perception-2026.226.svn76790-58.2.noarch.rpm"
RPM_HASH = "74f1f526269499cd2c082091fc783d3244bf28c783326d4da866ae66e2a7910992059f7c1f487fcd3a06e3fb68e55c05e4020fbc7ea63d8d140cf14d489f2524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perception"

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

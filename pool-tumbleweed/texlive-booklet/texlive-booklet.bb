SUMMARY = "Aids for printing simple booklets"
DESCRIPTION = "Pages of a document processed with the booklet package will be \
reordered and scaled so that they can be printed as four pages \
per physical sheet of paper, two pages per side. The resulting \
sheets will, when folded in half, assemble into a booklet. \
Instructions on producing the manual itself as a booklet are \
included."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7bsvn77682"

RPM_NAME = "texlive-booklet-2026.226.0.0.7bsvn77682-59.2.noarch.rpm"
RPM_HASH = "170a733d21fedcd658926e0515b5f208e095429a26bab0685e5f36a8b4d322c1294dff7611a6290f3648394d25ff0c9b45e945b6f42a7d270bd610c63922affc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bkltprnt.sty \
tex-booklet.sty \
texlive-booklet"

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

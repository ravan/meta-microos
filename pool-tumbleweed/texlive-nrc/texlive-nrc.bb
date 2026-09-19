SUMMARY = "Class for the NRC technical journals"
DESCRIPTION = "Macros, and some documentation, for typesetting papers for \
submission to journals published by the National Research \
Council Research Press. At present, only nrc2.cls (for \
two-column layout) should be used."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01asvn29027"

RPM_NAME = "texlive-nrc-2026.226.2.01asvn29027-61.2.noarch.rpm"
RPM_HASH = "71f40d1b0bff9aa7fdea10f7a23c01f50a3744dcf7dedf6b9a3b7f0faddbb94d91c18ca88a8100ca160e986072dff66774312111ebf12f45fe79453ae77fdf66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nrc1.cls \
tex-nrc1.sty \
tex-nrc2.cls \
tex-nrc2.sty \
texlive-nrc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-fontenc.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

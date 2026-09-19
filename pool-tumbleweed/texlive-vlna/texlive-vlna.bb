SUMMARY = "Add ~ after non-syllabic preposition, for Czech/Slovak"
DESCRIPTION = "Preprocessor for TeX source implementing the Czech/Slovak \
typographical rule forbidding a non-syllabic preposition alone \
at the end of a line."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73908"

RPM_NAME = "texlive-vlna-2026.226.svn73908-60.2.noarch.rpm"
RPM_HASH = "297d4cc5a6a09d2cc2e6b9189fb575a1d148de3da50c22104808070feea2bd89a69b4226c7e2a9c7aef393b450ab224038aa39dede9a2f39558cd8891a6df4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-vlna.1 \
texlive-vlna"

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
texlive-scripts-bin \
texlive-vlna-bin"

inherit rpm

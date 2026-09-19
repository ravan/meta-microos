SUMMARY = "A collection of small packages by Walter Schmidt"
DESCRIPTION = "A bundle of packages that arise in the author's area of \
interest: compliance of maths typesetting with ISO standards; \
symbols that work in both maths and text modes commas for both \
decimal separator and maths; and upright Greek letters in \
maths."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn64691"

RPM_NAME = "texlive-was-2026.226.svn64691-60.2.noarch.rpm"
RPM_HASH = "86999c83f50271ada647f49945a1cc90cf1763002f6be647e5d14ad0ac236a72dccd7405b02aab27c902e01f1483c6a277fcbc5e367fbf12f8dd79812266b4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icomma.sty \
tex-upgreek.sty \
texlive-was"

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

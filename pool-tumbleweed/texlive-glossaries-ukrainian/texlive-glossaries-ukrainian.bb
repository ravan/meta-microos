SUMMARY = "Ukrainian language module for glossaries package"
DESCRIPTION = "Ukrainian language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77154"

RPM_NAME = "texlive-glossaries-ukrainian-2026.226.1.0svn77154-60.4.noarch.rpm"
RPM_HASH = "332752d9d290f4e85e145613e08be120aaaf232fd85b35d67d6d51fabf14fe8f1f0c13391d84374aab50ae88b09f509d952b70ac33ef4cca194591c2adfee9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-ukrainian.ldf \
texlive-glossaries-ukrainian"

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

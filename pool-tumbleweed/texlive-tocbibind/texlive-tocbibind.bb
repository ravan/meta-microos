SUMMARY = "Add bibliography/index/contents to Table of Contents"
DESCRIPTION = "Automatically adds the bibliography and/or the index and/or the \
contents, etc., to the Table of Contents listing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5ksvn77682"

RPM_NAME = "texlive-tocbibind-2026.226.1.5ksvn77682-59.2.noarch.rpm"
RPM_HASH = "af710cb32aba4f508ca9cd3b5160b246856400cf6c6a91c465d440f770ec7cbf0008257da4b34360d7856186743b88dbb3c5b53d3ce47e50754aff9cc08df222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocbibind.sty \
texlive-tocbibind"

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
